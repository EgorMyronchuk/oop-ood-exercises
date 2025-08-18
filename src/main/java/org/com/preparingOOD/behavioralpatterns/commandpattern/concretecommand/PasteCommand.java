package org.com.preparingOOD.behavioralpatterns.commandpattern.concretecommand;

import org.com.preparingOOD.behavioralpatterns.commandpattern.Command;
import org.com.preparingOOD.behavioralpatterns.commandpattern.Editor;

public class PasteCommand implements Command {
    private final Editor editor;
    private final int position;
    private String pastedText;

    public PasteCommand(Editor editor, int position) {
        this.editor = editor;
        this.position = position;
    }

    @Override
    public void execute() {
        pastedText = editor.getClipboard();
        editor.paste(position);
    }

    @Override
    public void undo() {
        if (pastedText != null && !pastedText.isEmpty()) {
            editor.delete(position, position + pastedText.length());
        }
    }
}