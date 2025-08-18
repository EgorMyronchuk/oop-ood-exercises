package org.com.preparingOOD.behavioralpatterns.Iteratorpattern.concreteiterator;

import org.com.preparingOOD.behavioralpatterns.Iteratorpattern.MovieIterator;
import org.com.preparingOOD.behavioralpatterns.Iteratorpattern.concreteaggregate.Hulu;
import org.com.preparingOOD.behavioralpatterns.Iteratorpattern.entity.Movie;

import java.util.ArrayList;

public class HuluIterator implements MovieIterator {
    private final Hulu hulu;
    private int currentPosition = 0;
    private String filterGenre;
    private final ArrayList<Movie> movies = new ArrayList<>();

    public HuluIterator(Hulu hulu, String genre) {
        this.hulu = hulu;
        this.filterGenre = genre;

    }

    private void lazyLoad() {
        while (movies.isEmpty() && currentPosition < hulu.size()) {
            Movie m = hulu.getMovie(currentPosition++);
            if (m.getGenre().equalsIgnoreCase(filterGenre)) {
                movies.add(m);
            }
        }
    }

    @Override
    public boolean hasNext() {
        lazyLoad();
        return !movies.isEmpty();
    }

    @Override
    public Movie getNext() {
        if (!hasNext()) return null;
        return movies.remove(0);
    }

}
