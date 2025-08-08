package org.com.preparingOOD.behavioralpatterns.observer;

public interface LibraryUser {
    public void subscribe(Observer observer);

    public void unsubscribe(Observer observer);

    public void notifyObservers();
}
