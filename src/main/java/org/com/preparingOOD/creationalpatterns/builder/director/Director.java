package org.com.preparingOOD.creationalpatterns.builder.director;

import org.com.preparingOOD.creationalpatterns.builder.abstractbuilder.PizzaBuilder;
import org.com.preparingOOD.creationalpatterns.builder.product.Pizza;
import org.com.preparingOOD.creationalpatterns.builder.product.SizeSet;

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
