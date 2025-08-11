package org.com.preparingOOD.creationalpatterns.builderpatern;

import org.com.preparingOOD.creationalpatterns.builderpatern.abstractbuilder.PizzaBuilder;
import org.com.preparingOOD.creationalpatterns.builderpatern.concretebuilder.ConcretePizzaBuilder;
import org.com.preparingOOD.creationalpatterns.builderpatern.director.Director;
import org.com.preparingOOD.creationalpatterns.builderpatern.product.Pizza;

public class Launcher {
    public static void main(String[] args) {
        PizzaBuilder pizzaBuilder = new ConcretePizzaBuilder();
        Director director = new Director();
        System.out.println(director.buildMeatLoversPizza(pizzaBuilder));
        System.out.println(director.buildVegetarianPizza(pizzaBuilder));


    }
}
