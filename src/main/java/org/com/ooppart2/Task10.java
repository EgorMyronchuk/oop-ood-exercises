package org.com.ooppart2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Task10 {
    /**
     * Write a Java program to create a class called "Pet" with attributes for name, species, and age.
     * Create subclasses "Dog" and "Bird" that add specific attributes like favorite toy for dogs and wing span for birds.
     * Implement methods to display pet details and calculate the pet's age in human years.
     **/

    public static class Pet {
        String name;
        String species;
        int age;

        public void displayInfo (){
            System.out.printf("Name: %s , species: %s , age: %d \n", name, species, age);
        }
        public int toHumanYears(){
            return age;
        }
    }

    public static class Dog extends Pet {
       String favoriteToy;

       @Override
        public void displayInfo (){
            super.displayInfo();
            System.out.printf(" Favorite toy: %s \n", favoriteToy);
        }

        @Override
        public int toHumanYears(){
            return age * 7;
        }

    }

    public static class Bird extends Pet {
        int wingSpan;

        @Override
        public void displayInfo (){
            super.displayInfo();
            System.out.printf(" Wing span: %s \n", wingSpan);
        }

        @Override
        public int toHumanYears(){
            return age * 10;
        }

    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Rex";
        dog.species = "Dog";
        dog.age = 4;
        dog.favoriteToy = "Rubber Bone";

        Bird bird = new Bird();
        bird.name = "Kiwi";
        bird.species = "Bird";
        bird.age = 2;
        bird.wingSpan = 30;

        System.out.println("=== Dog Info ===");
        dog.displayInfo();
        System.out.println("Age in human years: " + dog.toHumanYears());

        System.out.println("\n=== Bird Info ===");
        bird.displayInfo();
        System.out.println("Age in human years: " + bird.toHumanYears());
    }


}
