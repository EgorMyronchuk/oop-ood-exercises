package org.com.preparingOOD.structuralpatterns.proxypattern;

import java.util.List;

public interface DocumentService {
    Document getDocument(String docId);

    List<String> listDocuments();

}
