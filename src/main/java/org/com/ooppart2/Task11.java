package org.com.ooppart2;

import java.time.LocalDateTime;
import java.util.TreeMap;

public class Task11 {
    /**
     * Write a Java program to create a class called "GymMembership" with attributes for member name, membership type, and duration.
     * Create a subclass "PremiumMembership" that adds attributes for personal trainer availability and spa access.
     * Implement methods to calculate membership fees and check for special offers based on membership type.
     **/

    public static class GymMembership {
        String memberName;
        String membershipType;
        int week;
        boolean spaAccess;
        boolean trainerAvailability;

        public GymMembership(String memberName, String membershipType, int week) {
            this.memberName = memberName;
            this.membershipType = membershipType;
            this.week = week;
            this.spaAccess = false;
            this.trainerAvailability = false;
        }

        public int calculateMembershipPrice() {
            return week * 5;
        }

        public String specialOffer() {
            return "Standard offer: 1 free guest pass per month.";
        }

        @Override
        public String toString() {
            return "GymMembership{" +
                    "memberName='" + memberName + '\'' +
                    ", membershipType='" + membershipType + '\'' +
                    ", week=" + week +
                    ", spaAccess = No" +
                    ", trainerAvailability = No" +
                    '}';
        }
    }

    public static class PremiumMembership extends GymMembership {
        public PremiumMembership(String memberName, String membershipType, int week) {
            super(memberName, membershipType, week);
            this.spaAccess = true;
            this.trainerAvailability = true;
        }

        @Override
        public int calculateMembershipPrice() {
            return week * 15;
        }

        @Override
        public String specialOffer() {
            return "Premium offer: Free spa access, 1 personal training session weekly, and unlimited guest passes.";
        }

        @Override
        public String toString() {
            return "PremiumMembership{" +
                    "memberName='" + memberName + '\'' +
                    ", membershipType='" + membershipType + '\'' +
                    ", week=" + week +
                    ", spaAccess= Yes" +
                    ", trainerAvailability= Yes" +
                    '}';
        }
    }


    public static void main(String[] args) {
        GymMembership standardMember = new GymMembership("Alice", "Standard", 8);
        PremiumMembership premiumMember = new PremiumMembership("Bob", "Premium", 8);

        System.out.println("=== Standard Membership ===");
        System.out.println(standardMember);
        System.out.println(standardMember.calculateMembershipPrice());

        System.out.println("\n=== Premium Membership ===");
        System.out.println(premiumMember);
        System.out.println(premiumMember.calculateMembershipPrice());
    }



}
