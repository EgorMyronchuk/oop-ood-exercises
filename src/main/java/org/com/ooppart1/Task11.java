package org.com.ooppart1;

import java.sql.SQLOutput;
import java.util.SortedMap;

/**
 * Create a program that keeps track of the number of objects created and displays the count in a function called display().
**/
public class Task11 {

    public class ObjectCounter {
        private static int count = 0;


        public ObjectCounter() {
            count++;
        }

        public static void display() {
            System.out.println("Number of objects created: " + count);
        }
    }

    public static void main(String[] args) {
        Task11 outer = new Task11();
        Task11.ObjectCounter obj = outer.new ObjectCounter();
        Task11.ObjectCounter obj2 = outer.new ObjectCounter();
        System.out.println(obj.count);
        Task11.ObjectCounter obj3 = outer.new ObjectCounter();
        System.out.println(obj.count);
        Task11.ObjectCounter obj4 = outer.new ObjectCounter();
        System.out.println(obj.count);
        Task11.ObjectCounter obj5= outer.new ObjectCounter();
        System.out.println(obj.count);
    }
}


