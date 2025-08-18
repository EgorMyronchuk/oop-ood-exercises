package org.com.preparingOOD.structuralpatterns.proxypattern;

import java.time.Duration;
import java.time.Instant;

public class ClientApp {

    public void run (String role){
        RemoteDocumentService document = new RemoteDocumentService();
        DocumentProxy documentProxy= new DocumentProxy(document,role);

        System.out.println(documentProxy.listDocuments());

        Instant startTime = Instant.now();
        System.out.println("Start time: " + startTime);

        System.out.println(documentProxy.getDocument("conf_001"));
        System.out.println(documentProxy.getDocument("pub_002"));

        Instant endTime = Instant.now();
        System.out.println("End time: " + endTime);


        long durationMillis = Duration.between(startTime, endTime).toMillis();
        System.out.println("Difference in milliseconds: " + durationMillis);

        Instant startTime2 = Instant.now();
        System.out.println("Start time with chaced: " + startTime2);

        System.out.println(documentProxy.getDocument("conf_001"));
        System.out.println(documentProxy.getDocument("pub_002"));

        Instant endTime2 = Instant.now();
        System.out.println("End time: " + endTime2);


        long durationMillis2 = Duration.between(startTime2, endTime2).toMillis();
        System.out.println("Difference in milliseconds with chaced: " + durationMillis2);

    }

}
