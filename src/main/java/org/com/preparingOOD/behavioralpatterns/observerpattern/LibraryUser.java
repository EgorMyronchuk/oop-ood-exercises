package org.com.preparingOOD.behavioralpatterns.observerpattern;

public interface LibraryUser {
    public void subscribe(Observer observer);

    public void unsubscribe(Observer observer);

    public void notifyObservers();
}
