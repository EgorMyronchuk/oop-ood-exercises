package org.com.ooppart1;
/**
 * Create a class Person with firstName and lastName as data members.
 * Override the toString() method to return the full name of the person. Define constructors to take appropriate parameters.
**/
public class Task7 {

    public static class Person {
        String firsName ;
        String lastName ;

        public Person(String firsName, String lastName) {
            this.firsName = firsName;
            this.lastName = lastName;
        }

        @Override
        public String toString() {
            return "Person{ FirsName = '%s', LastName = '%s'}".formatted(firsName, lastName);
        }
    }

    public static void main(String[] args) {
        Person person = new Person("John", "Smith");
        System.out.println(person);
    }

}
