package org.com.ooppart2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task3 {
    /**
     * Write a Java program to create a class called "Customer" with attributes for name, email, and purchase history.
     * Implement methods to add purchases to the history and calculate total expenditure.
     * Create a subclass "LoyalCustomer" that adds a discount rate attribute and a method to apply the discount.
     **/

    public static class Product {
        private final String name;
        private final int price;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Product product = (Product) o;
            return price == product.price && name.equals(product.name);
        }

        @Override
        public int hashCode() {
            int result = name.hashCode();
            result = 31 * result + price;
            return result;
        }
    }

    public static class Purchase {
        private final Product product;
        private final int quantity;
        private final LocalDateTime timestamp;

        public Purchase(Product product, int quantity, LocalDateTime timestamp) {
            this.product = product;
            this.quantity = quantity;
            this.timestamp = timestamp;
        }

        public int getTotalCost() {
            return product.getPrice() * quantity;
        }
    }

    public static class Customer {
        protected String name;
        protected String email;
        protected List<Purchase> purchaseHistory;

        public Customer(String name, String email) {
            this.name = name;
            this.email = email;
            this.purchaseHistory = new ArrayList<>();
        }

        public void addPurchase(Product product, int quantity) {
            purchaseHistory.add(new Purchase(product, quantity, LocalDateTime.now()));
        }

        public int calculateTotalExpenditure() {
            return purchaseHistory.stream().mapToInt(Purchase::getTotalCost).sum();
        }
    }

    public static class LoyalCustomer extends Customer {
        private final double discountRate;

        public LoyalCustomer(String name, String email, double discountRate) {
            super(name, email);
            this.discountRate = discountRate;
        }

        public int calculateTotalExpenditure() {
            return (int) Math.round(super.calculateTotalExpenditure() * (1 - discountRate));
        }
    }

    public static void main(String[] args) {
        Product milk = new Product("Milk", 25);
        Product bread = new Product("Bread", 30);

        LoyalCustomer customer = new LoyalCustomer("Alice", "alice@example.com", 0.15);
        customer.addPurchase(milk, 2);
        customer.addPurchase(bread, 1);

        Customer customer1 = new Customer("Ben", "Ben@example.com");
        customer1.addPurchase(bread, 1);
        customer1.addPurchase(milk, 2);


        System.out.println("Total: for loyal customer  " + customer.calculateTotalExpenditure());

        System.out.println("Total: for common customer  " + customer1.calculateTotalExpenditure());
    }

}
