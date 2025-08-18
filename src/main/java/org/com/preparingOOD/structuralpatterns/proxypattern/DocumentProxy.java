package org.com.preparingOOD.structuralpatterns.proxypattern;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DocumentProxy implements DocumentService{
    private RemoteDocumentService remoteDocumentService;
    private String role;
    private Map<String , Document> cachedDocuments;

    public DocumentProxy(RemoteDocumentService remoteDocumentService , String role) {
        this.remoteDocumentService = remoteDocumentService;
        this.cachedDocuments = new HashMap<String , Document>();
        this.role = role;
    }


    @Override
    public Document getDocument(String docId) {
        if ("employee".equals(role) && docId.startsWith("conf_")) {
            return null; //better throw ex but i need it to performance
        }
        if (cachedDocuments.containsKey(docId)) {
            System.out.println("Retrieved from cache: " + docId);
            return cachedDocuments.get(docId);
        }

        Document doc = remoteDocumentService.getDocument(docId);

        cachedDocuments.put(docId, doc);
        System.out.println("Loaded from remote service: " + docId);

        return doc;
    }

    @Override
    public List<String> listDocuments() {
        List<String> result = remoteDocumentService.listDocuments();
        if (role.equals("employee")) {
            return result.stream()
                    .filter(x -> x.startsWith("pub_"))
                    .collect(Collectors.toList());
        }
        return result;
    }
}
