package org.com.ooppart1;

/**
 * Create a class Car with attributes make, model, and year. The class should have a method displayDetails() that prints the details of the car.
 * Include a constructor to initialize these attributes.
 * Create an instance of the Car class and display its details.
**/
public class Task13 {

    public static class Car {
        String make;
        String model;
        int year;

        public Car(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public void displayDetails() {
            System.out.printf("Make: %s. Model: %s. Year: %d\n", make, model, year);
        }

    }


    public static void main(String[] args) {
        Car car = new Car("Ford", "Mustang", 2018);
        Car car1 = new Car("Tesla", "Y", 2013);
        Car car2 = new Car("Nissan", "Sentra", 2015);

        car.displayDetails();
        car1.displayDetails();
        car2.displayDetails();
    }

}


