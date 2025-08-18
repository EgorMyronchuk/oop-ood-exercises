package org.com.preparingOOD.creationalpatterns.builder;

import org.com.preparingOOD.creationalpatterns.builder.abstractbuilder.PizzaBuilder;
import org.com.preparingOOD.creationalpatterns.builder.concretebuilder.ConcretePizzaBuilder;
import org.com.preparingOOD.creationalpatterns.builder.director.Director;

public class Launcher {
    public static void main(String[] args) {
        PizzaBuilder pizzaBuilder = new ConcretePizzaBuilder();
        Director director = new Director();
        System.out.println(director.buildMeatLoversPizza(pizzaBuilder));
        System.out.println(director.buildVegetarianPizza(pizzaBuilder));


    }
}
