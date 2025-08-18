package org.com.preparingOOD.behavioralpatterns.Iteratorpattern;

import org.com.preparingOOD.behavioralpatterns.Iteratorpattern.entity.Movie;

public interface MovieIterator {
    public boolean hasNext();

    public Movie getNext();

}
