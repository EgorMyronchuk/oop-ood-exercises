package org.com.ooppart1;

import java.util.List;

/**
 * Write a program to accept three numbers and find the largest of the three using method overloading.
**/
public class Task9 {

    public static class Calculator {
        public int largest(int a, int b, int c) {
            return Math.max(a, Math.max(b, c));
        }

        public double largest(double a, double b, double c) {
            return Math.max(a, Math.max(b, c));
        }

        public long largest(long a, long b, long c) {
            return Math.max(a, Math.max(b, c));
        }

        public float largest(float a, float b, float c) {
            return Math.max(a, Math.max(b, c));
        }

    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.largest(32.0, 3.0, 54.0));
        System.out.println(calculator.largest(13, 55, 70));
        System.out.println(calculator.largest(123.0F , 3.0F, 4.0F));
        System.out.println(calculator.largest(222L , 3L, 4L));


    }

}


