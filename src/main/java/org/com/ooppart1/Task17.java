package org.com.ooppart1;

import java.util.Scanner;

/**
 * Create a class Employee with members empNo, name, department, and salary.
 * In main, create a reference variable of type Employee, allocate memory for the Employee object using the new operator,
 * and initialize the data members using command line arguments.
 * Display the data members.
**/
public class Task17 {

   static class Employee {
       int empNo;
       String name;
       String department ;
       double salary;

       public Employee(int empNo, String name, String department, double salary) {
           this.empNo = empNo;
           this.name = name;
           this.department = department;
           this.salary = salary;
       }

       @Override
       public String toString() {
           return "Employee{empNo=%d, name='%s', department='%s', salary=%s}".formatted(empNo, name, department, salary);
       }
   }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
        Employee emp2 = new Employee(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());

        System.out.println(emp);
        System.out.println(emp2);

        String out =
                """
                1
                Egor
                It
                20
                2
                Anton
                Hr
                1
                Employee{empNo=1, name='Egor', department='It', salary=20.0}
                Employee{empNo=2, name='Anton', department='Hr', salary=1.0}
                """;
   }
}


