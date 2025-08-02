package org.com.ooppart1;

import java.util.Scanner;

/**
 * Create an Employee class with members empNo, name, department, and salary.
 * Use a one-dimensional array of Employee objects (size 10) to read the data for 5 employees from command line arguments.
 * Display the data and determine which employee has the highest salary.
**/
public class Task18 {

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

       public static void printEmployees(Employee[] emp) {
           Employee bestSalary = emp[0];
           for(Employee e : emp){
               if (e == null) {
                   System.out.printf( "The best salary in %s is %.2f\n ", bestSalary.name , bestSalary.salary);
                   return;
               }
               if (e.salary > bestSalary.salary) bestSalary = e;
               System.out.println(e);
           }

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
        Employee emp3 = new Employee(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
        Employee emp4 = new Employee(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
        Employee emp5 = new Employee(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());

        Employee[] emps = new Employee[10];
        emps[0] = emp;
        emps[1] = emp2;
        emps[2] = emp3;
        emps[3] = emp4;
        emps[4] = emp5;
        emps[5] = emp;

        Employee.printEmployees(emps);
   }
}


