package org.com.preparingOOD.architecturalpatterns.mvc.Model;

import java.util.ArrayList;
import java.util.List;

public class BookHolder {
    List<Book> books ;

    public BookHolder(ArrayList<Book> books) {
        this.books = books;
    }

    public BookHolder(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook (Book book) {
        books.remove(book);
    }

}
