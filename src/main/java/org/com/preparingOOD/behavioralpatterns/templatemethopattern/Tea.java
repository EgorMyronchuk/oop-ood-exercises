package org.com.preparingOOD.behavioralpatterns.templatemethopattern;

public class Tea extends Beverage{
    @Override
    void brew() {
        System.out.println("Add tea leaf");
    }

    @Override
    void addCondiments() {
        System.out.println("Add sugar");
    }
}
