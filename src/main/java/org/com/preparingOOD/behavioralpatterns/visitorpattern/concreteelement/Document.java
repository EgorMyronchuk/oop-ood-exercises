package org.com.preparingOOD.behavioralpatterns.visitorpattern.concreteelement;

import org.com.preparingOOD.behavioralpatterns.visitorpattern.DocumentElement;
import org.com.preparingOOD.behavioralpatterns.visitorpattern.DocumentVisitor;

import java.util.ArrayList;
import java.util.List;

public class Document implements DocumentElement {
    List<DocumentElement> elementList = new ArrayList<>();

    public void addElement (DocumentElement documentElement){
        elementList.add(documentElement);
    }

    public List<DocumentElement> takeList(){
        return elementList;
    }
    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
