package org.com.preparingOOD.behavioralpatterns.visitorpattern.concreteelement;

import org.com.preparingOOD.behavioralpatterns.visitorpattern.DocumentElement;
import org.com.preparingOOD.behavioralpatterns.visitorpattern.DocumentVisitor;

public class Text implements DocumentElement {
    private String content;

    public Text(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
