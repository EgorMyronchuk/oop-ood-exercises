package org.com.ooppart2;

public class Task2 {
    /**
     * Write a Java program to create a class called "Vehicle" with attributes for make, model, and year.
     * Create subclasses "Car" and "Truck" that add specific attributes like trunk size for cars and payload capacity for trucks.
     * Implement a method to display vehicle details in each subclass.
     **/

    public static class Vehicle {
        String make;
        String model;
        int year;

        public Vehicle(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }


    }

    public static final class Car extends Vehicle {
        int trunkSize;

        public Car(String make, String model, int year, int trunkSize) {
            super(make, model, year);
            this.trunkSize = trunkSize;
        }

        public void displayVehicle() {
            String result = "Car{" +
                    "Model=" + model +
                    ", Make='" + make + '\'' +
                    ", Year=" + year + '\'' +
                    ", Trunk size=" + trunkSize +
                    '}';
            System.out.println(result);
        }
    }

    public static final class Truck extends Vehicle {
        int capacity;

        public Truck(String make, String model, int year, int capacity) {
            super(make, model, year);
            this.capacity = capacity;
        }


        public void displayVehicle() {
            String result = "Truck{" +
                    "Model=" + model +
                    ", Make='" + make + '\'' +
                    ", Year=" + year + '\'' +
                    ", Capacity=" + capacity +
                    '}';
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        Truck truck = new Truck("Truck", "Model", 2016, 2);
        Car car = new Car("Car", "Model", 2016, 2);

        truck.displayVehicle();
        car.displayVehicle();
    }

}
