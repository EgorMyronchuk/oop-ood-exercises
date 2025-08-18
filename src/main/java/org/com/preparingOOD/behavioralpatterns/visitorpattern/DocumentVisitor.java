package org.com.preparingOOD.behavioralpatterns.visitorpattern;


import org.com.preparingOOD.behavioralpatterns.visitorpattern.concreteelement.Document;
import org.com.preparingOOD.behavioralpatterns.visitorpattern.concreteelement.Image;
import org.com.preparingOOD.behavioralpatterns.visitorpattern.concreteelement.Table;
import org.com.preparingOOD.behavioralpatterns.visitorpattern.concreteelement.Text;

public interface DocumentVisitor {
    public void visit(Text text);

    public void visit(Image image);

    public void visit(Table table);

    public void visit(Document document);
}
