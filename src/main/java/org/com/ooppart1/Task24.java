package org.com.ooppart1;

/**
 * Create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter().
 * Then, implement two subclasses Rectangle and Circle. The Rectangle class should have attributes for length and width, and the Circle class should have an attribute for radius.
 * Both subclasses should implement the abstract methods to calculate the area and perimeter.
 * Write a program to create instances of both classes, set their attributes, and display their area and perimeter.
 **/
public class Task24 {

    public static abstract class Shape {
        public abstract int calculateArea();

        public abstract int calculatePerimeter();

    }

    public static class Rectangle extends Shape {
        int length;
        int width;

        public Rectangle(int length, int width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public int calculateArea() {
            return 2 * (length + width);
        }

        @Override
        public int calculatePerimeter() {
            return length * width;
        }
    }

    public static class Circle extends Shape {
        int radius;

        public Circle(int radius) {
            this.radius = radius;
        }

        @Override
        public int calculateArea() {
            return (int) Math.round(Math.PI * (radius * radius));
        }

        @Override
        public int calculatePerimeter() {
            return (int) Math.round(2 * Math.PI * radius);
        }
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(12);
        Circle circle2 = new Circle(15);
        Circle circle3 = new Circle(14);

        Rectangle rectangle1 = new Rectangle(10, 10);
        Rectangle rectangle2 = new Rectangle(12, 55);
        Rectangle rectangle3 = new Rectangle(12, 43);

        System.out.println("Area of circle1: " + circle1.calculateArea());
        System.out.println("Perimeter of circle1: " + circle1.calculatePerimeter());
        System.out.println("Area of circle2: " + circle2.calculateArea());
        System.out.println("Perimeter of circle2: " + circle2.calculatePerimeter());
        System.out.println("Area of circle3: " + circle3.calculateArea());
        System.out.println("Perimeter of circle3: " + circle3.calculatePerimeter());

        System.out.println("Area of rectangle1: " + rectangle1.calculateArea());
        System.out.println("Perimeter of rectangle1: " + rectangle1.calculatePerimeter());
        System.out.println("Area of rectangle2: " + rectangle2.calculateArea());
        System.out.println("Perimeter of rectangle2: " + rectangle2.calculatePerimeter());
        System.out.println("Area of rectangle3: " + rectangle3.calculateArea());
        System.out.println("Perimeter of rectangle3: " + rectangle3.calculatePerimeter());
    }
}


