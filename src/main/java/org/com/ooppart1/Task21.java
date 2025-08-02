package org.com.ooppart1;

/**
 * Create a class Employee with overloaded constructors to initialize employee details based on different combinations of arguments.
 * Test method overloading in a class by creating methods with the same name but different parameter types,
 * return types, or parameter orders, and identify which can coexist.
**/
public class Task21 {

    static class Employee {
        int empNo;
        String name;
        String department ;
        double salary;

        public Employee(int empNo){
            this(empNo,"Undefined","Undefined",0.0);
            System.out.println(this);
        }

        public Employee(int empNo, String name){
            this(empNo,name,"Undefined",0.0);
            System.out.println(this);
        }

        public Employee(int empNo, String name, String department){
            this(empNo,name,department,0.0);
            System.out.println(this);
        }

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
        Employee e1 = new Employee(1);
        Employee e2 = new Employee(2 , "Egor");
        Employee e3 = new Employee(3 , "Alex" , "IT");
        Employee e4 = new Employee(4 , "Max" , "HR" , 20000.0);
        System.out.println(e4);
    }
}


