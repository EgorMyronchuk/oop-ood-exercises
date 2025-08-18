package org.com.preparingOOD.structuralpatterns.proxypattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoteDocumentService implements DocumentService {

    private Map<String, Document> documents;

    public RemoteDocumentService() {
        documents = new HashMap<>();

        documents.put("pub_001", new Document("pub_001", "Public Doc 1", "Content 1"));
        documents.put("pub_002", new Document("pub_002", "Public Doc 2", "Content 2"));
        documents.put("pub_003", new Document("pub_003", "Public Doc 3", "Content 3"));
        documents.put("pub_004", new Document("pub_004", "Public Doc 4", "Content 4"));
        documents.put("pub_005", new Document("pub_005", "Public Doc 5", "Content 5"));

        // Конфиденциальные документы
        documents.put("conf_001", new Document("conf_001", "Confidential Doc 1", "Secret content 1"));
        documents.put("conf_002", new Document("conf_002", "Confidential Doc 2", "Secret content 2"));
        documents.put("conf_003", new Document("conf_003", "Confidential Doc 3", "Secret content 3"));
        documents.put("conf_004", new Document("conf_004", "Confidential Doc 4", "Secret content 4"));
        documents.put("conf_005", new Document("conf_005", "Confidential Doc 5", "Secret content 5"));
    }

    @Override
    public Document getDocument(String docId) {
        simulateNetworkLatency();
        return documents.get(docId);
    }

    @Override
    public List<String> listDocuments() {
        simulateNetworkLatency();
        return new ArrayList<String>(documents.keySet());
    }

    private void simulateNetworkLatency() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
