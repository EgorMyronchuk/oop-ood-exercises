package org.com.ooppart2;

public class Task6 {
    /**
     * Write a Java program to create a class called "Building" with attributes for address, number of floors, and total area.
     * Create subclasses "ResidentialBuilding" and "CommercialBuilding" that add specific attributes like number of apartments for residential and office space for commercial buildings.
     * Implement a method to calculate the total rent for each subclass.
     **/

    public static class Building {
        String address;
        int number;
        int floors;
        int totalArea;

        public Building(String address, int number, int floors, int totalArea) {
            this.address = address;
            this.number = number;
            this.floors = floors;
            this.totalArea = totalArea;
        }

        public double totalPriceFroRent() {
            return 25 * floors +
                    16.50 * totalArea;
        }

    }

    public static class ResidentialBuilding extends Building {
        int numberOfApartments;

        public ResidentialBuilding(String address, int number, int floors, int totalArea, int numberOfApartments) {
            super(address, number, floors, totalArea);
            this.numberOfApartments = numberOfApartments;
        }

        @Override
        public double totalPriceFroRent() {
            return super.totalPriceFroRent() * numberOfApartments;
        }

    }

    public static class CommercialBuilding extends Building {
        int officeSpace;

        public CommercialBuilding(String address, int number, int floors, int totalArea, int officeSpace) {
            super(address, number, floors, totalArea);
            this.officeSpace = officeSpace;
        }

        @Override
        public double totalPriceFroRent() {
            return super.totalPriceFroRent() + officeSpace * 10.50;
        }

    }

    public static void main(String[] args) {
        Building building1 = new ResidentialBuilding("Streat 1", 2, 2, 150, 1);
        Building building2 = new CommercialBuilding("Streat 1", 3, 1, 70, 150);

        System.out.println(building1.totalPriceFroRent());
        System.out.println(building2.totalPriceFroRent());
    }
}
