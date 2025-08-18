package org.com.preparingOOD.behavioralpatterns.commandpattern.concretecommand;

import org.com.preparingOOD.behavioralpatterns.commandpattern.Command;
import org.com.preparingOOD.behavioralpatterns.commandpattern.Editor;

public class DeleteCommand implements Command {
    private final Editor editor;
    private final int start;
    private final int end;
    private String deletedText;

    public DeleteCommand(Editor editor, int start, int end) {
        this.editor = editor;
        this.start = start;
        this.end = end;
    }

    @Override
    public void execute() {
        deletedText = editor.delete(start, end);
    }

    @Override
    public void undo() {
        if (deletedText != null && !deletedText.isEmpty()) {
            editor.append(deletedText);
        }
    }
}
