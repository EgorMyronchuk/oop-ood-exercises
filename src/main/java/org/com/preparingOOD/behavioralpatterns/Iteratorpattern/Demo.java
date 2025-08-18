package org.com.preparingOOD.behavioralpatterns.Iteratorpattern;

import org.com.preparingOOD.behavioralpatterns.Iteratorpattern.concreteaggregate.Hulu;
import org.com.preparingOOD.behavioralpatterns.Iteratorpattern.concreteaggregate.Netflix;
import org.com.preparingOOD.behavioralpatterns.Iteratorpattern.entity.Movie;

public class Demo {

    public static void main(String[] args) {
        Netflix netflix = new Netflix();
        Hulu hulu = new Hulu();

        netflix.movieList.add(new Movie("Назад у майбутнє", "фантастика", 1985));
        netflix.movieList.add(new Movie("Один вдома", "комедія", 1990));
        netflix.movieList.add(new Movie("Темний лицар", "екшн", 2008));
        netflix.movieList.add(new Movie("Шрек", "комедія", 2001));
        netflix.movieList.add(new Movie("Зелена миля", "драма", 1999));
        netflix.movieList.add(new Movie("Джуманджі", "комедія", 1995));



        hulu.movieList.add(new Movie("Шрек", "комедія", 2001));
        hulu.movieList.add(new Movie("Зелена миля", "драма", 1999));
        hulu.movieList.add(new Movie("Джуманджі", "комедія", 1995));

        MovieIterator netflixIterator = netflix.createIterator("комедія");
        MovieIterator huluIterator = hulu.createIterator("комедія");

        System.out.println("Комедии на Netflix:");
        while (netflixIterator.hasNext()) {
            Movie m = netflixIterator.getNext();
            System.out.println(m);
        }

        System.out.println("\nКомедии на Hulu:");
        while (huluIterator.hasNext()) {
            Movie m = huluIterator.getNext();
            System.out.println(m);
        }
    }
}
