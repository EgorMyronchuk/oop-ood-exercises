package org.com.ooppart2;

import java.util.UUID;

public class Task5 {
    /**
     * Write a Java program to create a class called "ElectronicsProduct" with attributes for product ID, name, and price.
     * Implement methods to apply a discount and calculate the final price.
     * Create a subclass " WashingMachine" that adds a warranty period attribute and a method to extend the warranty.
     **/

    public static class ElectronicsProduct {
        String productID;
        String productName;
        double productPrice;

        public ElectronicsProduct(String productID, String productName, double productPrice) {
            this.productID = productID;
            this.productName = productName;
            this.productPrice = productPrice;
        }

        public void calculateFinalPrice() {
            System.out.println(productPrice);
        }

        public void calculateFinalPrice(double discount) {
            System.out.println(productPrice - productPrice * discount);
        }
    }

    public static class WashingMachine extends ElectronicsProduct {
        int warrantyPeriod;

        public WashingMachine(String productID, double productPrice, int warrantyPeriod) {
            super(productID, "Washing machine", productPrice);
            this.warrantyPeriod = warrantyPeriod;
        }

        public void extendWarrantyPeriod(int warrantyPeriod) {
            this.warrantyPeriod += warrantyPeriod;
        }
    }

    public static void main(String[] args) {
        ElectronicsProduct electronicsProduct = new ElectronicsProduct(UUID.randomUUID().toString(), "Phone", 1900.0);
        WashingMachine washingMachine = new WashingMachine(UUID.randomUUID().toString(), 200, 2);

        electronicsProduct.calculateFinalPrice();
        electronicsProduct.calculateFinalPrice(0.15);

        washingMachine.extendWarrantyPeriod(3);
        washingMachine.calculateFinalPrice();
        washingMachine.calculateFinalPrice(0.20);

    }
}
