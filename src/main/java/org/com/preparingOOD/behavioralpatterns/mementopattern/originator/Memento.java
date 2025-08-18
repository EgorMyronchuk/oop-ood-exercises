package org.com.preparingOOD.behavioralpatterns.mementopattern.originator;

public class Memento {
    private final String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
