package org.com.ooppart1;

/**
 * Write a program to accept a number and display its last digit in words using a method in a class.
**/
public class Task10 {

    static String[] numberInWords = {
            "нуль", "один", "два", "три", "чотири",
            "п'ять", "шість", "сім", "вісім", "дев'ять"
    };


    public static void displayNumber (int number) {
        System.out.println(numberInWords[number % 10]);
    }

    public static void main(String[] args) {
        displayNumber(999);
        displayNumber(922);
        displayNumber(1);
        displayNumber(20);

    }

}


