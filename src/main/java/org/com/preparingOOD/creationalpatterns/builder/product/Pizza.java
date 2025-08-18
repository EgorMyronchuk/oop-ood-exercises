package org.com.preparingOOD.creationalpatterns.builder.product;

public class Pizza {
    private final SizeSet size;
    private final boolean cheese;
    private final boolean pepperoni;
    private final boolean bacon;
    private final boolean olives;
    private final boolean mushrooms;
    private final boolean onions;

    public Pizza(SizeSet size, boolean cheese, boolean pepperoni, boolean bacon, boolean olives, boolean mushrooms, boolean onions) {
        this.size = size;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
        this.bacon = bacon;
        this.olives = olives;
        this.mushrooms = mushrooms;
        this.onions = onions;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", bacon=" + bacon +
                ", olives=" + olives +
                ", mushrooms=" + mushrooms +
                ", onions=" + onions +
                '}';
    }
}
