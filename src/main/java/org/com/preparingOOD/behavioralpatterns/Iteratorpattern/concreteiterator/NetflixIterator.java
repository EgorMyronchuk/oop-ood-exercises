package org.com.preparingOOD.behavioralpatterns.Iteratorpattern.concreteiterator;

import org.com.preparingOOD.behavioralpatterns.Iteratorpattern.MovieIterator;
import org.com.preparingOOD.behavioralpatterns.Iteratorpattern.concreteaggregate.Netflix;
import org.com.preparingOOD.behavioralpatterns.Iteratorpattern.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class NetflixIterator implements MovieIterator {

    private final Netflix netflix;
    private final String filterGenre;
    private int currentPosition = 0;
    private final List<Movie> buffer = new ArrayList<>();

    public NetflixIterator(Netflix netflix, String genre) {
        this.netflix = netflix;
        this.filterGenre = genre;
    }


    private void lazyLoad() {
        while (buffer.isEmpty() && currentPosition < netflix.size()) {
            Movie m = netflix.getMovie(currentPosition++);
            if (m.getGenre().equalsIgnoreCase(filterGenre)) {
                buffer.add(m);
            }
        }
    }

    @Override
    public boolean hasNext() {
        lazyLoad();
        return !buffer.isEmpty();
    }

    @Override
    public Movie getNext() {
        if (!hasNext()) return null;
        return buffer.remove(0);
    }
}
