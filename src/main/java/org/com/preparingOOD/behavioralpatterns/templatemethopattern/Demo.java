package org.com.preparingOOD.behavioralpatterns.templatemethopattern;

public class Demo {

    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        tea.prepareRecipe();
        System.out.println("_____________________________");
        coffee.prepareRecipe();
    }
}
