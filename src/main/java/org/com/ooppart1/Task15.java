package org.com.ooppart1;

import java.util.List;

/**
 * Create a program to accept three numbers and find the largest and second largest numbers using object-oriented principles;
**/
public class Task15 {

    private interface nMaxNum{
        int findLargestNumber();

        int findSecondLargestNumber();
    }

    private static class NumberAnalyzer implements nMaxNum {
        int num1 , num2 , num3;

        public NumberAnalyzer(int num1, int num2, int num3) {
            this.num1 = num1;
            this.num2 = num2;
            this.num3 = num3;
        }

        public int findLargestNumber() {
            return Math.max(num1, Math.max(num2, num3));
        }

        public int findSecondLargestNumber() {
            return List.of(num1 , num2 , num3)
                    .stream()
                    .sorted()
                    .skip(1)
                    .findFirst()
                    .get();
        }
    } //Here I use encapsulation and interface implementation (polymorphism)


    public static void main(String[] args) {
        nMaxNum finder1 = new NumberAnalyzer(54 , 13 , 23);

        System.out.println(finder1.findLargestNumber());
        System.out.println(finder1.findSecondLargestNumber());
    }

}


