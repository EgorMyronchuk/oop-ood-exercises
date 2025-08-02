package org.com.ooppart1;

/**
 * Create a class Book with data members Title, Author, Cost, and noOfBooks. Implement a function to display information about the book. Also:
 * Create 3 instances of the Book class and initialize the data members.
 * Accept a title and noOfBooks from the user. Check if the book exists and if sufficient copies are available. If so, calculate and display the total cost.
**/
public class Task20 {

   static class Book {
       String title;
       String author;
       double cost;
       int noOfBooks;

       public Book(String title, String author, double cost, int noOfBooks) {
           this.title = title;
           this.author = author;
           this.cost = cost;
           this.noOfBooks = noOfBooks;
       }

       public void display (){
           System.out.println(this.toString());
       }

       @Override
       public String toString() {
           return "Book{title='%s', author='%s', cost=%s, noOfBooks='%s'}".formatted(title, author, cost, noOfBooks);
       }
   }

   static class Library {
        Book[] books;

       public Library(Book[] books) {
           this.books = books;
       }

       public void buyBook(String title, int noOfBooks) {
           for (Book book : books) {
               if (book.title.equals(title)) {
                   if (book.noOfBooks > noOfBooks) {
                       System.out.printf("You have already bought this book.It will cost you %.2f\n" , book.cost * noOfBooks);
                       return;
                   }
                   System.out.printf("Sorry, we don`t have enough quantity of this books we have only %d\n" , book.noOfBooks);
                   return;
               }
           }
           System.out.println("Sorry we don`t have this book");
       }


   }


    public static void main(String[] args) {
        Book book1 = new Book("Java" , "Jim" , 200.0 , 4);
        Book book2 = new Book("Scala" , "Jack" ,150.0 , 5);
        Book book3 = new Book("C#" , "Alex" , 100.0 , 6);
        Book book4 = new Book("Python" , "Sergei" , 50.0 , 2);
        Book book5 = new Book("PHP" , "Thomas" , 40.0 , 1);
        Book book6 = new Book("Ruby" , "Alexandro" , 30.0 , 5);

        Library library = new Library(new Book[]{book1, book2, book3, book4, book5});
        library.buyBook("Java", 3);
        library.buyBook("Scala", 3);
        library.buyBook("Scrap", 3);
        library.buyBook("C#", 10);

   }
}


