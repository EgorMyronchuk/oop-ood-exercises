package org.com.preparingOOD.structuralpatterns.proxypattern;

public class Document {
    String id;
    String title;
    String content;

    public Document(String id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Document{id=%s, title='%s', content='%s'}"
                .formatted(id, title, content);
    }
}
