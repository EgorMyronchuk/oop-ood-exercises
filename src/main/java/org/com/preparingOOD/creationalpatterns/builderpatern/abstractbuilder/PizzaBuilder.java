package org.com.preparingOOD.creationalpatterns.builderpatern.abstractbuilder;

import org.com.preparingOOD.creationalpatterns.builderpatern.product.Pizza;
import org.com.preparingOOD.creationalpatterns.builderpatern.product.SizeSet;

public interface PizzaBuilder {
    PizzaBuilder setSize(SizeSet size);
    PizzaBuilder addCheese();
    PizzaBuilder addPepperoni();
    PizzaBuilder addBacon();
    PizzaBuilder addOlives();
    PizzaBuilder addMushrooms();
    PizzaBuilder addOnions();
    Pizza build();
}
