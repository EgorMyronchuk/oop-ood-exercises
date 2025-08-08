package org.com.preparingOOD.architecturalpatterns.mvc.Controller;

import org.com.preparingOOD.architecturalpatterns.mvc.Model.Book;
import org.com.preparingOOD.architecturalpatterns.mvc.Model.BookService;

import java.util.Optional;

public class BookController {

    BookService bookService ;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    public void getBookByUsername (String username) {
        Optional<Book> book = bookService.getBookByUsername(username);
        if (book.isPresent()) {
            System.out.println(book.get());
        }
        else System.out.println("Book not found");
    }

    public void removeBook (Book book) {
        bookService.removeBook(book);
    }

    public void getBooks () {
        System.out.println(bookService.getBooks());
    }
}
