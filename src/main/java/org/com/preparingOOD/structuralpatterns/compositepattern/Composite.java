package org.com.preparingOOD.structuralpatterns.compositepattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Composite implements Component {
    List<Component> children = new ArrayList<Component>();

    public Composite(Component... childrens) {
        add(childrens);
    }

    public void add(Component component) {
        children.add(component);
    }

    public void add(Component... components) {
        children.addAll(Arrays.asList(components));
    }

    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Composite");
        for (Component component : children) {
            component.showDetails();
        }
    }

    @Override
    public double getPrice() {
        double sum = 0;
        for (Component component : children) {
            sum += component.getPrice();
        }
        return sum;
    }

}
