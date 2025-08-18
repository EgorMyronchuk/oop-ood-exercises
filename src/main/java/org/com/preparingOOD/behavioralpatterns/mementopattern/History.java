package org.com.preparingOOD.behavioralpatterns.mementopattern;

import org.com.preparingOOD.behavioralpatterns.mementopattern.originator.Memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    List<Memento> mementos = new ArrayList<Memento>();

    public void saveState(Memento memento) {
        mementos.add(memento);
    }

    public Memento undo() {
        Memento memento = mementos.getLast();
        mementos.remove(memento);
        return memento;
    }
}
