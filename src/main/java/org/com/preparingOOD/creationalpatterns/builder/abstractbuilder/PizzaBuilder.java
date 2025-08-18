package org.com.preparingOOD.creationalpatterns.builder.abstractbuilder;

import org.com.preparingOOD.creationalpatterns.builder.product.Pizza;
import org.com.preparingOOD.creationalpatterns.builder.product.SizeSet;

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
