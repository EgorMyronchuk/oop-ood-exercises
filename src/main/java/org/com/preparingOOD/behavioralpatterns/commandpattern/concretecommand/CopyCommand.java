package org.com.preparingOOD.behavioralpatterns.commandpattern.concretecommand;

import org.com.preparingOOD.behavioralpatterns.commandpattern.Command;
import org.com.preparingOOD.behavioralpatterns.commandpattern.Editor;

public class CopyCommand implements Command {
    private final Editor editor;
    private final int start;
    private final int end;

    public CopyCommand(Editor editor, int start, int end) {
        this.editor = editor;
        this.start = start;
        this.end = end;
    }

    @Override
    public void execute() {
        editor.copy(start, end);
    }

    @Override
    public void undo() {

    }
}