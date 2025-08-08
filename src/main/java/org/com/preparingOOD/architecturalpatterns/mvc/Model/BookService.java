package org.com.preparingOOD.architecturalpatterns.mvc.Model;

import java.util.List;
import java.util.Optional;

public class BookService {
    BookHolder bookHolder;

    public BookService(BookHolder bookHolder) {
        this.bookHolder = bookHolder;
    }



    public List<Book> getBooks() {
        return bookHolder.getBooks();
    }
    public void removeBook(Book book) {
        bookHolder.removeBook(book);
    }
    public Optional<Book> getBookByUsername(String username) {
        return bookHolder.getBooks().stream().filter(x -> x.getAuthor().equals(username)).findFirst();
    }
}
