package org.com.ooppart2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Task4 {
    /**
     * Write a Java program to create a class called "Course" with attributes for course name, instructor, and credits.
     * Create a subclass "OnlineCourse" that adds attributes for platform and duration.
     * Implement methods to display course details and check if the course is eligible for a certificate based on duration.
     **/

    public static class Course {
        String name;
        String instructor;
        int credits;

        public Course(String name, String instructor, int credits) {
            this.name = name;
            this.instructor = instructor;
            this.credits = credits;
        }

        public void displayCourseDetail() {
            System.out.printf("Name: %s, instructor: %s credits: %d%n", name, instructor, credits);
        }
    }

    public static class OnlineCourse extends Course {
        String platform;
        int duration;

        public OnlineCourse(String name, String instructor, int credits, String platform, int duration) {
            super(name, instructor, credits);
            this.platform = platform;
            this.duration = duration;
        }

        public void getСertificate() {
            if (duration > 20)
                System.out.println("\nThank for pass our course , you can see your certificate on your profile");
            else System.out.print("Sorry, you need watch more than 20 hour of our video to her certificate");
        }

        @Override
        public void displayCourseDetail() {
            super.displayCourseDetail();
            System.out.printf("Platform: %s , duration: %d ", platform, duration);
        }
    }

    public static void main(String[] args) {
        Course course = new Course("Java Developer", "Alex Smitovich", 50);
        OnlineCourse onlineCourse = new OnlineCourse("Java Developer", "Alex Smitovich", 50, "Yotube", 24);
        OnlineCourse onlineCourse1 = new OnlineCourse("Java", "Artem Smitovich", 540, "Yotube", 18);

        course.displayCourseDetail();
        onlineCourse.displayCourseDetail();

        onlineCourse.getСertificate();
        onlineCourse1.getСertificate();


    }
}
