package org.com.ooppart1;

/**
 * Create a class Customer with name, address, and phone as attributes.
 * Implement polymorphism by overriding methods in a subclass VIPCustomer to apply discounts for VIP customers.
 **/
public class Task25 {

    public static class Customer {
        String name;
        String address;
        String phone;

        public Customer(String name, String address, String phone) {
            this.name = name;
            this.address = address;
            this.phone = phone;
        }
    }

    public static class VIPCustomer extends Customer {

        public VIPCustomer(String name, String address, String phone) {
            super(name, address, phone);
        }
    }

    public static class Checkpoint {

        public void entrance(Customer customer) {
            if (customer instanceof VIPCustomer) {
                System.out.println("Hi, VIP customer you have discount to entr");
            } else {
                System.out.println("Customer Entrance , you don`t have discount to entr");
            }
        }

    }

    public static void main(String[] args) {
        Customer regularCustomer = new Customer("John Doe", "123 Main St", "555-1234");

        VIPCustomer vipCustomer = new VIPCustomer("Alice Smith", "456 Park Ave", "555-5678");

        Checkpoint checkpoint = new Checkpoint();

        checkpoint.entrance(regularCustomer);
        checkpoint.entrance(vipCustomer);
    }
}


