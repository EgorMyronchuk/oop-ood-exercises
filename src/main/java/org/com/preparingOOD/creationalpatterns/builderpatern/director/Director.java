package org.com.preparingOOD.creationalpatterns.builderpatern.director;

import org.com.preparingOOD.creationalpatterns.builderpatern.abstractbuilder.PizzaBuilder;
import org.com.preparingOOD.creationalpatterns.builderpatern.product.Pizza;
import org.com.preparingOOD.creationalpatterns.builderpatern.product.SizeSet;

public class Director {

    public Pizza buildVegetarianPizza(PizzaBuilder builder) {
        return builder
                .setSize(SizeSet.MEDIUM)
                .addCheese()
                .addOlives()
                .addMushrooms()
                .addOnions()
                .build();
    }

    public Pizza buildMeatLoversPizza(PizzaBuilder builder) {
        return builder
                .setSize(SizeSet.LARGE)
                .addCheese()
                .addPepperoni()
                .addBacon()
                .build();
    }
}
