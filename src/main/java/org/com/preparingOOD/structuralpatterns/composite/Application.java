package org.com.preparingOOD.structuralpatterns.composite;

public class Application {
    public static void main(String[] args) {
        Leaf apple = new Leaf("Apple", 10.0, 5);
        Leaf banana = new Leaf("Banana", 7.5, 3);
        Leaf orange = new Leaf("Orange", 8.0, 4);
        Leaf milk = new Leaf("Milk", 20.0, 2);
        Leaf bread = new Leaf("Bread", 15.0, 1);

        Composite fruitBasket = new Composite();
        fruitBasket.add(apple, banana, orange);

        Composite groceryBag = new Composite();
        groceryBag.add(milk, bread);

        Composite shoppingCart = new Composite();
        shoppingCart.add(fruitBasket, groceryBag);

        System.out.println("=== Show Details ===");
        shoppingCart.showDetails();

        System.out.println("=== Total Price ===");
        System.out.println(shoppingCart.getPrice());
    }
}
