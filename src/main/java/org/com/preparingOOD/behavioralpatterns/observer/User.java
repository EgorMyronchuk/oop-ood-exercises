package org.com.preparingOOD.behavioralpatterns.observer;

public class User implements Observer {
    String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " get new news " + news);
    }
}
