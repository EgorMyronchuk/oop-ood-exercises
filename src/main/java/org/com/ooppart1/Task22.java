package org.com.ooppart1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.stream.Collectors;

/**
 * Create a class Store with attributes StoreID, StoreName, ProductList, and Revenue.
 * Implement methods to add a product to the list, calculate total revenue, and display store information.
 * I changed to better form;
**/
public class Task22 {

    public static class Store {
        int storeID;
        String storeName;

        Map<String, Product> productList = new HashMap<>();

        public Store(int storeID, String storeName) {
            this.storeID = storeID;
            this.storeName = storeName;
        }

        public static class Product {
            int quantity;
            double pricePerUnit;

            public Product(int quantity, double pricePerUnit) {
                this.quantity = quantity;
                this.pricePerUnit = pricePerUnit;
            }
        }

        public void addProduct(String productName, int quantity, double pricePerUnit) {
            productList.put(productName, new Product(quantity, pricePerUnit));
        }

        public void updateProductQuantity(String productName, int newQuantity) {
            Product product = productList.get(productName);
            if (product != null) {
                product.quantity = newQuantity;
            } else {
                System.out.println("Product " + productName + " not found.");
            }
        }

        public double calculateRevenue() {
            return productList.values().stream()
                    .mapToDouble(p -> p.quantity * p.pricePerUnit * 0.3)
                    .sum();
        }

        public void displayProducts() {
            System.out.println("Products in " + storeName + ":");
            productList.forEach((name, product) ->
                    System.out.printf("%s — quantity: %d, price per unit: %.2f\n", name, product.quantity, product.pricePerUnit));
        }
    }


    public static void main(String[] args) {
        Store store = new Store(1, "SuperMart");

        store.addProduct("Apple", 300, 2.5);
        store.addProduct("Banana", 150, 1.2);
        store.addProduct("Orange", 200, 3.0);
        store.addProduct("Grapes", 120, 4.0);
        store.addProduct("Watermelon", 50, 7.5);

        store.displayProducts();

        double revenue = store.calculateRevenue();
        System.out.printf("Calculated revenue (30%% commission): %.2f\n", revenue);

        store.updateProductQuantity("Banana", 180);
        store.updateProductQuantity("Watermelon", 45);

        System.out.println("\nAfter updating quantities:");
        store.displayProducts();

        revenue = store.calculateRevenue();
        System.out.printf("New calculated revenue (30%% commission): %.2f\n", revenue);
    }
}


