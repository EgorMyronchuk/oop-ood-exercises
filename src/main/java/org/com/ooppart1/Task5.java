package org.com.ooppart1;

import java.util.Collections;

/**
 * Create a class Biggest that contains a single-dimensional
 * array as a data member and a method display() to find and display the largest element of the array.
**/
public class Task5 {
    public static class Biggest {
        static  int[] arr = new int[]{1, 2 , 3 , 4 , 5 , 6 , 7};

        public static void display(){
            int buffer = 0 ;
            for(int i = 0 ; i < arr.length ; i++){
                if(arr[i] > buffer){
                    buffer = arr[i];
                }
            }
            System.out.println(buffer);
        }
    }

    public static void main(String[] args) {
        Biggest.display();
    }
}
