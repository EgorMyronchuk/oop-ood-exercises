package org.com.preparingOOD.observer;

public interface LibraryUser {
    public void subscribe(Observer observer);

    public void unsubscribe(Observer observer);

    public void notifyObservers();
}
