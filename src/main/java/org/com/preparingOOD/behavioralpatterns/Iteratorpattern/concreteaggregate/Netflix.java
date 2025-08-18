package org.com.preparingOOD.behavioralpatterns.Iteratorpattern.concreteaggregate;

import org.com.preparingOOD.behavioralpatterns.Iteratorpattern.concreteiterator.NetflixIterator;
import org.com.preparingOOD.behavioralpatterns.Iteratorpattern.entity.Movie;
import org.com.preparingOOD.behavioralpatterns.Iteratorpattern.MovieIterator;
import org.com.preparingOOD.behavioralpatterns.Iteratorpattern.StreamingService;

import java.util.ArrayList;
import java.util.List;

public class Netflix implements StreamingService {
     public List<Movie> movieList = new ArrayList<Movie>();


    @Override
    public MovieIterator createIterator(String genre) {
        return new NetflixIterator(this, genre);
    }

    public Movie getMovie(int index) {
       return movieList.get(index);
    }

    public int size (){
        return movieList.size();
    }
}
