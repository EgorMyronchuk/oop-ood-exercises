package org.com.preparingOOD.behavioralpatterns.visitorpattern.concretevisitor;

import org.com.preparingOOD.behavioralpatterns.visitorpattern.DocumentElement;
import org.com.preparingOOD.behavioralpatterns.visitorpattern.DocumentVisitor;
import org.com.preparingOOD.behavioralpatterns.visitorpattern.concreteelement.Document;
import org.com.preparingOOD.behavioralpatterns.visitorpattern.concreteelement.Image;
import org.com.preparingOOD.behavioralpatterns.visitorpattern.concreteelement.Table;
import org.com.preparingOOD.behavioralpatterns.visitorpattern.concreteelement.Text;

import java.util.List;

public class HtmlRenderVisitor implements DocumentVisitor {
    @Override
    public void visit(Text text) {
        System.out.println("<p>" + text.getContent() + "</p>");
    }

    @Override
    public void visit(Image image) {
        System.out.println("<img src='" + image.getPath() + "' width='" + image.getWidth() +
                "' height='" + image.getHeight() + "' />");
    }

    @Override
    public void visit(Table table) {
        System.out.println("<table>" + table.getRows() + "x" + table.getColumn() + "</table>");
    }

    @Override
    public void visit(Document document) {
        List<DocumentElement> list = document.takeList();

        for(DocumentElement element : list){
            element.accept(this);
        }
    }
}
