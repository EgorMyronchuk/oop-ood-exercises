package org.com.preparingOOD.creationalpatterns.builderpatern.concretebuilder;

import org.com.preparingOOD.creationalpatterns.builderpatern.abstractbuilder.PizzaBuilder;
import org.com.preparingOOD.creationalpatterns.builderpatern.product.Pizza;
import org.com.preparingOOD.creationalpatterns.builderpatern.product.SizeSet;

public class ConcretePizzaBuilder implements PizzaBuilder {
    private SizeSet size;
    private boolean cheese = false;
    private boolean pepperoni = false;
    private boolean bacon = false;
    private boolean olives = false;
    private boolean mushrooms = false;
    private boolean onions = false;


    @Override
    public PizzaBuilder setSize(SizeSet size) {
        this.size = size;
        return this;
    }

    @Override
    public PizzaBuilder addCheese() {
        this.cheese = true;
        return this;
    }

    @Override
    public PizzaBuilder addPepperoni() {
        this.pepperoni = true;
        return this;
    }

    @Override
    public PizzaBuilder addBacon() {
        this.bacon = true;
        return this;
    }

    @Override
    public PizzaBuilder addOlives() {
        this.olives = true;
        return this;
    }

    @Override
    public PizzaBuilder addMushrooms() {
        this.mushrooms = true;
        return this;
    }

    @Override
    public PizzaBuilder addOnions() {
        this.onions = true;
        return this;
    }

    private void reset(){
        this.size = null;
        this.cheese = false;
        this.pepperoni = false;
        this.bacon = false;
        this.olives = false;
        this.mushrooms = false;
        this.onions = false;
    }

    @Override
    public Pizza build() {
        Pizza pizza = new Pizza(size,cheese,pepperoni,bacon,olives,mushrooms,onions);
        reset();
        return pizza;
    }
}
