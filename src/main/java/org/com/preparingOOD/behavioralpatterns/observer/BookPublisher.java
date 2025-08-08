package org.com.preparingOOD.behavioralpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class BookPublisher implements LibraryUser {
    private List<Observer> observers ;
    private String title ;

    public BookPublisher() {
        observers = new ArrayList<>();
    }

    public void makeNewTitle (String titel){
        this.title = titel;
        this.notifyObservers();
    }


    public BookPublisher(List<Observer> observers) {
        this.observers = observers;
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(news -> news.update(title));
    }
}
