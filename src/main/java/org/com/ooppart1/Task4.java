package org.com.ooppart1;

import static org.com.ooppart1.Task4.SeriesCalculator.calculateSum;

/**
 * Create a class SeriesCalculator with a method calculateSum(int n) to calculate the sum of the first n numbers in the series 1 + 3 + 5 + 7 + ....
 * Use the formula Sum = (n/2) * [2*a + (n-1)*d], where "a" is the first term and "d" is the common difference.
**/
public class Task4 {


    public static class SeriesCalculator{
        public static int calculateSum(int n) {
            int a = 1 ;
            int d = 2 ;
            return (n/2) * (2*a + (n-1) * d);
        }
    }

    public static void main(String[] args) {
        System.out.println(calculateSum(9));
    }
}
