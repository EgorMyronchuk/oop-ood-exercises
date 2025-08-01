package org.com.ooppart1;

/**
 * Write a program to accept a student’s name and three marks. Calculate the total and average, and display the result using a class and object.
**/
public class Task12 {

    public static class Student {
       String name;
       int mark1 , mark2 , mark3 ;

        public Student(String name, int mark1, int mark2, int mark3) {
            this.name = name;
            this.mark1 = mark1;
            this.mark2 = mark2;
            this.mark3 = mark3;
        }

        public void averageMarksToDispay() {
            System.out.println(((mark1 * mark2 * mark3) / 3));
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Mary", 2, 4, 5);
        Student student2 = new Student("Mary", 4, 5, 8);
        Student student3 = new Student("Mary", 6, 5, 2);
        Student student4 = new Student("Mary", 11, 5, 9);

        student1.averageMarksToDispay();
        student2.averageMarksToDispay();
        student3.averageMarksToDispay();
        student4.averageMarksToDispay();
    }


    // Too much question about this class inside , it`s break my brain.
}


