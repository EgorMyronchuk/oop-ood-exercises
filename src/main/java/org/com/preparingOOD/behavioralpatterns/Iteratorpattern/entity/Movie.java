package org.com.preparingOOD.behavioralpatterns.Iteratorpattern.entity;

public class Movie {
    public String title;
    public String genre;
    public int year;

    public Movie(String title, String genre, int year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Movie{title='%s', genre='%s', year=%d}".formatted(title, genre, year);
    }
}
