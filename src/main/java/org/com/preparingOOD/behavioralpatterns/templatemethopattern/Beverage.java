package org.com.preparingOOD.behavioralpatterns.templatemethopattern;

public abstract class Beverage {
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

     void boilWater() {
         System.out.println("Boiling water");
     }

    abstract void brew();

    void pourInCup() {
        System.out.println("Pouring cup");
    }

    abstract void addCondiments();

}
