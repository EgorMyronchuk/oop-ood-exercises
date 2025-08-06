package org.com.ooppart1;
/**
 * Create a class Rectangle with attributes length and width, each defaulting to 1.
 * The class should include set and get methods for both attributes, and a method to calculate the area of the rectangle.
**/
public class Task6 {

    public static class Rectangle {
        int length = 1;
        int width = 1;
        // better to use constructor with no-variables
//        public Rectangle() {
//            this.length = 1;
//            this.width = 1;
//        }
        public void setLength(int length) {
            if (length > 0) {
                this.length = length;
            } else {
                System.out.println("Length must be positive.");
            }
        }

        @Override
        public String toString() {
            return "Rectangle{length=%d, width=%d}".formatted(length, width);
        }

        public void setWidth(int width) {
            if (width > 0) {
                this.width = width;
            } else {
                System.out.println("Width must be positive.");
            }
        }

        public int getLength() {
            return length;
        }

        public int getWidth() {
            return width;
        }

        public int areaOfRectangle () {
            return length * width;
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(4);
        rectangle.setWidth(5);
        System.out.println(rectangle.areaOfRectangle());
    }

}
