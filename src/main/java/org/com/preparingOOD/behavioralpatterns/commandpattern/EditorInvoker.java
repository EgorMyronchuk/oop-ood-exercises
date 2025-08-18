package org.com.preparingOOD.behavioralpatterns.commandpattern;

public class EditorInvoker {
    private final CommandHistory history = new CommandHistory();

    public void executeCommand(Command cmd) {
        cmd.execute();
        history.push(cmd);
    }

    public void undo() {
        Command cmd = history.popUndo();
        if (cmd != null) {
            cmd.undo();
        } else {
            System.out.println("Нечего отменять");
        }
    }

    public void redo() {
        Command cmd = history.popRedo();
        if (cmd != null) {
            cmd.execute();
        } else {
            System.out.println("Нечего повторять");
        }
    }
}
