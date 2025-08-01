package org.com.ooppart1;

import static org.com.ooppart1.Task2.Calculator.calculateDifference;
import static org.com.ooppart1.Task2.Calculator.calculateSum;

/**
 *  Create a class Calculator with the following methods:
 *  calculateSum(int number1, int number2) to calculate the sum of two numbers.
 *  calculateDifference(int number1, int number2) to calculate the difference between two numbers.
**/


public class Task2 {

    static class Calculator {
        public static int calculateSum(int number1, int number2){
            return number1 + number2;
        }
        public static int calculateDifference(int number1, int number2){
            return number1 - number2;
        }
    }

    public static void main(String[] args) {
        System.out.println(calculateSum(1 , 2));
        System.out.println(calculateDifference( 4 , 7));
    }
}
