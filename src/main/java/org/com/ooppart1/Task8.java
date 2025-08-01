package org.com.ooppart1;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Create a Student class with name, rollNo, and marks as attributes.
 * Write a method to calculate the grade based on the marks and display the grade. Create multiple instances of the Student class and print
**/
public class Task8 {

    public static class Student {
        String name ;
        String rollNo ;
        List<Integer> marks;

        public Student(String name, String rollNo, List<Integer> marks) {
            this.name = name;
            this.rollNo = rollNo;
            this.marks = marks;
        }

        public void getAvgMark() {
            int avg =  marks.stream()
                       .mapToInt(Integer::intValue)
                       .sum();
            System.out.println(avg);
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Egor" , "1 - B " , List.of(9, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Student student2 = new Student("Andrew" , "2 - B " , List.of(1, 2, 3, 4, 3, 6, 7, 8, 9, 10));
        Student student3 = new Student("Anton" , "4 - A " , List.of(1, 9, 3, 4, 2, 6, 7, 8, 7, 10));
        Student student4 = new Student("Artem" , "3 - B " , List.of(1, 2, 3, 4,1, 6, 7, 8, 9, 10));
        Student student5 = new Student("Arkadii" , "1 - C " , List.of(9, 2, 2, 4, 5, 6, 7, 8, 9, 10));
        Student student6 = new Student("Vladimir" , "1 - D " , List.of(1, 2, 9, 4, 5, 6, 5, 8, 9, 10));
        Student student7 = new Student("Sergei" , "2 - D " , List.of(12, 2, 3, 2, 5, 6, 7, 8, 9, 10));


        student1.getAvgMark();
        student2.getAvgMark();
        student3.getAvgMark();
        student4.getAvgMark();
        student5.getAvgMark();
        student6.getAvgMark();
        student7.getAvgMark();
    }

}
