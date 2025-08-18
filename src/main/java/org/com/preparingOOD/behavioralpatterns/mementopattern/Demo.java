package org.com.preparingOOD.behavioralpatterns.mementopattern;

import org.com.preparingOOD.behavioralpatterns.mementopattern.originator.TextEditor;

public class Demo {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor("Hello World");

        History history = new History();

        System.out.println(textEditor.getText());
        history.saveState(textEditor.save());
        textEditor.setText("Hello World,step 2");

        System.out.println(textEditor.getText());
        history.saveState(textEditor.save());
        textEditor.setText("Hello World,step 3");

        System.out.println(textEditor.getText());
        history.saveState(textEditor.save());
        textEditor.setText("Hello World,step 4");
        System.out.println(textEditor.getText());

        System.out.println("Undo ---------------------------------");

        System.out.println(textEditor.getText());
        textEditor.restore(history.undo());
        System.out.println(textEditor.getText());
        textEditor.restore(history.undo());
        System.out.println(textEditor.getText());
        textEditor.restore(history.undo());
        System.out.println(textEditor.getText());
    }
}
