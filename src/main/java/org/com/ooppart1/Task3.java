package org.com.ooppart1;

import java.util.List;

/**
 *  Create a class Employee with overloaded constructors to initialize employee details based on different combinations of arguments.
 *  Ensure the constructors support the creation of objects in various ways.
**/
public class Task3 {
    
    public static class Employee {
        String name;
        int age;

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", address='" + address + '\'' +
                    ", phone='" + phone + '\'' +
                    ", salary=" + salary +
                    ", extra=" + extra +
                    '}';
        }

        String address;
        String phone;
        int salary;
        List<String> extra;

        public Employee(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Employee(String name, int age, String address, String phone, int salary, List<String> extra) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.phone = phone;
            this.salary = salary;
            this.extra = extra;
        }

        public Employee(String name, int age, String address, String phone, int salary) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.phone = phone;
            this.salary = salary;
        }

        public Employee(String name, int age, String address, String phone) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.phone = phone;
        }
    }

    //refactor DRY

    public static class Employee1 {
        String name;
        int age;
        String address;
        String phone;
        int salary;
        List<String> extra;

        public Employee1(String name, int age, String address, String phone, int salary, List<String> extra) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.phone = phone;
            this.salary = salary;
            this.extra = extra;
        }

        public Employee1(String name, int age, String address, String phone, int salary) {
            this(name, age, address, phone, salary, null);
        }

        public Employee1(String name, int age, String address, String phone) {
            this(name, age, address, phone, 0);
        }

        public Employee1(String name, int age, String address) {
            this(name, age, address, null);
        }
    }


    public static void main(String[] args) {
        Employee1 emp1 = new Employee1("Egor", 12 , "str1");
        Employee1 emp2 = new Employee1("Egor", 12 , "str1", "3321");
        Employee1 emp3 = new Employee1("Egor", 12 , "str1" , "3321" , 3321);
        Employee1 emp4 = new Employee1("Egor", 12 , "str1" , "3321" , 3321 , List.of("Hello", "Hi"));

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
    }
}
