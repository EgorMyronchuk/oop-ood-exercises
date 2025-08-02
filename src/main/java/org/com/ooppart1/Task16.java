package org.com.ooppart1;

import java.util.List;
import java.util.Scanner;

/**
 * Write a program to store N elements in an array of integers.
 * Display the elements, then accept a number to search for.
 * Display whether the number is found using a linear search method within a class.
**/
public class Task16 {

   static class Storage {
       int[] arr ;

       public Storage(Scanner sc,int... numbers) {
           this.arr = numbers ;

           for (int number : numbers){
               System.out.printf("%d ", number);
           }

           System.out.println("\nPleas , enter the number which you want to find ");

           if (find(sc.nextInt() , arr)) System.out.println("Number found");
           else System.out.println("Number not found");
       }

       public static boolean find(int num , int[] arr) {
           for (int numbers : arr){
               if (numbers == num){
                   return true;
               }
           }
           return false;
       }
   }



    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Storage storage = new Storage(sc,new int[]{1,2,3,4,5,6,7,8,9});
   }
}


