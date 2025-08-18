package org.com.preparingOOD.structuralpatterns.compositepattern;

public class Leaf implements Component {
    private final String name;
    private final double price;
    private final int quantity;

    public Leaf(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public void showDetails() {
        System.out.printf("Leaf{name='%s', price=%s, quantity=%d}%n\n", name, price, quantity)
        ;
    }

    @Override
    public double getPrice() {
        return price;
    }


}
