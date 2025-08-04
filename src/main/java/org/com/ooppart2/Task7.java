package org.com.ooppart2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task7 {
    /**
     * Write a Java program to create a class called "Event" with attributes for event name, date, and location.
     * Create subclasses "Seminar" and "MusicalPerformance" that add specific attributes like number of speakers for seminars and performer list for concerts.
     * Implement methods to display event details and check for conflicts in the event schedule.
     **/

    public static class Event {
        String name;
        LocalDateTime date;
        String location;

        public Event(String name, LocalDateTime date, String location) {
            this.name = name;
            this.date = date;
            this.location = location;
        }

        public LocalDate getDateOnly() {
            return date.toLocalDate();
        }

        public void displayEvent () {
            System.out.println("Event{name='%s', date=%s, location='%s'}".formatted(name, date, location));
        }

    }

    public static class Seminar extends Event {
        int numberOfSpeakers;

        public Seminar(String name, LocalDateTime date, String location, int numberOfSpeakers) {
            super(name, date, location);
            this.numberOfSpeakers = numberOfSpeakers;
        }

        @Override
        public void displayEvent () {
            super.displayEvent();
            System.out.println("Number of speakers: "+numberOfSpeakers);
        }

    }

    public static class MusicalPerformance extends Event {
       List<String> performerList;

        public MusicalPerformance(String name, LocalDateTime date, String location, List<String> performerList) {
            super(name, date, location);
            this.performerList = performerList;
        }

        @Override
        public void displayEvent () {
            super.displayEvent();
            System.out.println("Performer List: "+performerList.toString());
        }

    }


    public static class Schedule {
        Map<LocalDate, Event> schedule = new HashMap<>();

        public Map<LocalDate, Event> getSchedule() {
            return schedule;
        }

        public void addEvent(Event event) {
            LocalDate dateKey = event.getDateOnly();
            if (schedule.containsKey(dateKey)) {
                System.out.println("There is already an event for this date.");
            } else {
                schedule.put(dateKey, event);
                System.out.println("Event added.");
            }
        }

    }

    public static void main(String[] args) {
        Schedule schedule = new Schedule();

        Event seminar = new Seminar(
                "Tech Innovations 2025",
                LocalDateTime.of(2025, 1, 25, 10, 0),
                "Kyiv Tech Hub",
                5
        );

        Event concert = new MusicalPerformance(
                "Rock Fest",
                LocalDateTime.of(2025, 1, 26, 20, 0),
                "Lviv Stadium",
                List.of("The Rolling Bones", "Electric Tigers")
        );

        Event conflictSeminar = new Seminar(
                "AI Conference",
                LocalDateTime.of(2025, 1, 25, 14, 0),
                "Online",
                3
        );

        System.out.println("\n--- All Events in Schedule ---");
        for (Event event : schedule.getSchedule().values()) {
            event.displayEvent();
            System.out.println("---------------------------");
        }
    }
}
