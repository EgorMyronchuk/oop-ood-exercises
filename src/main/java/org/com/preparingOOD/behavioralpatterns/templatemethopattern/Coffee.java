package org.com.preparingOOD.behavioralpatterns.templatemethopattern;

public class Coffee extends Beverage{
    @Override
    void brew() {
        System.out.println("Add coffee to cup");
    }

    @Override
    void addCondiments() {
        System.out.println("Add syrup");
    }
}
