package org.com.preparingOOD.behavioralpatterns.visitorpattern.concretevisitor;

import org.com.preparingOOD.behavioralpatterns.visitorpattern.DocumentElement;
import org.com.preparingOOD.behavioralpatterns.visitorpattern.DocumentVisitor;
import org.com.preparingOOD.behavioralpatterns.visitorpattern.concreteelement.Document;
import org.com.preparingOOD.behavioralpatterns.visitorpattern.concreteelement.Image;
import org.com.preparingOOD.behavioralpatterns.visitorpattern.concreteelement.Table;
import org.com.preparingOOD.behavioralpatterns.visitorpattern.concreteelement.Text;

import java.util.Arrays;
import java.util.List;

public class WordCountVisitor implements DocumentVisitor {

    @Override
    public void visit(Text text) {
        long count = Arrays.stream(text.getContent().split(" ")).count();
        System.out.println(count);
    }

    @Override
    public void visit(Image image) {
        System.out.println("Did`t work with image");
    }

    @Override
    public void visit(Table table) {
        System.out.println(table.getColumn() * table.getRows());
    }

    @Override
    public void visit(Document document) { //with this type of task I can`t do it correctly
        List<DocumentElement> list = document.takeList();

        for(DocumentElement element : list){
            element.accept(this);
        }
    }
}
