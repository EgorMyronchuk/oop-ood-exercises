package org.com.preparingOOD.behavioralpatterns.commandpattern;

import org.com.preparingOOD.behavioralpatterns.commandpattern.concretecommand.*;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        EditorInvoker invoker = new EditorInvoker();

        invoker.executeCommand(new WriteCommand(editor, "Hello "));
        invoker.executeCommand(new WriteCommand(editor, "World"));

        invoker.executeCommand(new DeleteCommand(editor, 5, 11));

        invoker.executeCommand(new CopyCommand(editor, 0, 5));
        invoker.executeCommand(new PasteCommand(editor, 0));

        invoker.executeCommand(new ChangeCaseCommand(editor, 0, 5, true));

        System.out.println("Текст зараз: " + editor.getText());

        invoker.undo();
        invoker.undo();
        System.out.println("После після: " + editor.getText());

        invoker.redo();
        invoker.redo();
        System.out.println("Після redo: " + editor.getText());
    }
}
