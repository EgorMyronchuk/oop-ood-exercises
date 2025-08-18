package org.com.preparingOOD.behavioralpatterns.commandpattern.concretecommand;

import org.com.preparingOOD.behavioralpatterns.commandpattern.Command;
import org.com.preparingOOD.behavioralpatterns.commandpattern.Editor;

public class WriteCommand implements Command {
    private final Editor editor;
    private final String content;
    private int beforeLength = -1;

    public WriteCommand(Editor editor, String content) {
        this.editor = editor;
        this.content = content;
    }

    @Override
    public void execute() {
        beforeLength = editor.length();
        editor.append(content);
    }

    @Override
    public void undo() {
        if (beforeLength >= 0) {
            editor.delete(beforeLength, editor.length());
        }
    }
}
