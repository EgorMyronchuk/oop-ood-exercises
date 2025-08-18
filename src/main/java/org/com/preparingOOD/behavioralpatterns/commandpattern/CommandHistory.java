package org.com.preparingOOD.behavioralpatterns.commandpattern;

import java.util.Stack;

public class CommandHistory {
    private Stack<Command> undoStack = new Stack<>();
    private Stack<Command> redoStack = new Stack<>();

    public void push(Command cmd) {
        undoStack.push(cmd);
        redoStack.clear();
    }

    public Command popUndo() {
        if (!undoStack.isEmpty()) {
            Command cmd = undoStack.pop();
            redoStack.push(cmd);
            return cmd;
        }
        return null;
    }

    public Command popRedo() {
        if (!redoStack.isEmpty()) {
            Command cmd = redoStack.pop();
            undoStack.push(cmd);
            return cmd;
        }
        return null;
    }

    public boolean canUndo() {
        return !undoStack.isEmpty();
    }

    public boolean canRedo() {
        return !redoStack.isEmpty();
    }
}
