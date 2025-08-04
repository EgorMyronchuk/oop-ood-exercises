package org.com.ooppart2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Task9 {
    /**
     * Write a Java program to create a class called "Reservation" with attributes for reservation ID, customer name, and date.
     * Create subclasses "ResortReservation" and "RailwayReservation" that add specific attributes like room number for hotels and seat number for flights.
     * Implement methods to check reservation status and modify reservation details.
     **/

    public static class Reservation {
        UUID id;
        String customerName;
        LocalDateTime date;
        boolean isActive;

        public Reservation(UUID id, String customerName, LocalDateTime date) {
            this.id = id;
            this.customerName = customerName;
            this.date = date;
            this.isActive = true;
        }

        public void cancelReservation() {
            isActive = false;
            System.out.println("Cancelling reservation for " + id);
        }

        public void checkReservationStatus() {
            if (isActive) System.out.println("Reservation is active");
            else System.out.println("Reservation was canceled");
        }

        public void modifyReservationDetails(String customerName, LocalDateTime date) {
            this.customerName = customerName;
            this.date = date;
            System.out.println("Now your reservation look like :");
            System.out.println(this);
        }

        @Override
        public String toString() {
            return "Reservation{id=%s, customerName='%s', date=%s}".formatted(id, customerName, date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        }
    }

    public static class ResortReservation extends Reservation {
        int roomNumber;

        public ResortReservation(UUID id, String customerName, LocalDateTime date, int roomNumber) {
            super(id, customerName, date);
            this.roomNumber = roomNumber;
        }

        public void modifyReservationDetails(String customerName, LocalDateTime date, int roomNumber) {
            super.modifyReservationDetails(customerName, date);
            this.roomNumber = roomNumber;
        }

        @Override
        public String toString() {
            return "ResortReservation{roomNumber=%d, id=%s, customerName='%s', date=%s}".formatted(roomNumber, id, customerName, date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        }
    }

    public static class RailwayReservation extends Reservation {
        String seatNumber;

        public RailwayReservation(UUID id, String customerName, LocalDateTime date, String seatNumber) {
            super(id, customerName, date);
            this.seatNumber = seatNumber;
        }

        public void modifyReservationDetails(String customerName, LocalDateTime date, String seatNumber) {
            super.modifyReservationDetails(customerName, date);
            this.seatNumber = seatNumber;
        }

        @Override
        public String toString() {
            return "RailwayReservation{seatNumber='%s', id=%s, customerName='%s', date=%s}".formatted(seatNumber, id, customerName, date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        }
    }

    public static void main(String[] args) {
        UUID id1 = UUID.randomUUID();
        UUID id2 = UUID.randomUUID();

        ResortReservation resort = new ResortReservation(id1, "Alice Johnson", LocalDateTime.of(2025, 9, 10, 14, 0), 301);
        RailwayReservation railway = new RailwayReservation(id2, "Bob Smith", LocalDateTime.of(2025, 9, 12, 9, 30), "A12");

        System.out.println(resort);
        System.out.println(railway);

        resort.checkReservationStatus();
        railway.checkReservationStatus();

        resort.modifyReservationDetails("Alice Cooper", LocalDateTime.of(2025, 9, 11, 16, 0), 305);
        railway.modifyReservationDetails("Bob Marley", LocalDateTime.of(2025, 9, 13, 11, 45), "B7");

        System.out.println(resort);
        System.out.println(railway);

        resort.cancelReservation();
        railway.cancelReservation();

        resort.checkReservationStatus();
        railway.checkReservationStatus();
    }

}
