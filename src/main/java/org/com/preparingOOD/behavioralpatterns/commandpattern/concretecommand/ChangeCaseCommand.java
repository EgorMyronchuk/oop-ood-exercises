package org.com.preparingOOD.behavioralpatterns.commandpattern.concretecommand;

import org.com.preparingOOD.behavioralpatterns.commandpattern.Command;
import org.com.preparingOOD.behavioralpatterns.commandpattern.Editor;

public class ChangeCaseCommand implements Command {
    private final Editor editor;
    private final int start;
    private final int end;
    private final boolean toUpper;
    private String originalText;

    public ChangeCaseCommand(Editor editor, int start, int end, boolean toUpper) {
        this.editor = editor;
        this.start = start;
        this.end = end;
        this.toUpper = toUpper;
    }

    @Override
    public void execute() {
        if (toUpper) {
            originalText = editor.toUpperCase(start, end);
        } else {
            originalText = editor.toLowerCase(start, end);
        }
    }

    @Override
    public void undo() {
        if (originalText != null && !originalText.isEmpty()) {
            editor.delete(start, end);
            editor.append(originalText);
        }
    }
}
