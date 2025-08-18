package org.com.preparingOOD.behavioralpatterns.mementopattern.originator;

public class TextEditor {
    String text;

    public TextEditor(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Memento save(){
       return new Memento(text);
    }

    public void restore (Memento memento){
        this.text = memento.getState();
    }
}
