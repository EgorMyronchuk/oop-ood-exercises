package org.com.OOD.mvc;

import org.com.preparingOOD.mvc.Controller.BookController;
import org.com.preparingOOD.mvc.Model.Book;
import org.com.preparingOOD.mvc.Model.BookHolder;
import org.com.preparingOOD.mvc.Model.BookService;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Розділи логіку на 3 компоненти:
 *     - `Model` – клас `Book`, дані користувача
 *     - `View` – методи виводу в консоль (список книг, меню)
 *     - `Controller` – обробка введення: додати/видалити/знайти
 * 2. Вся логіка в контролері
 * 3. Вся бізнес-логіка в моделі
 * 4. View не знає про модель напряму — лише через контролер
 *
 * **Питання для рефлексії:**
 * 1. Чому MVC корисний для підтримки коду?
 *  Він зручний до розширення так як гарно дотримується правила Single-Responsibility
 *  також гарно слідкує за правилом Open/Close
 *  Кожний блок працює зі своїми залежностями не чіпаючи інші.
 * 2. Який UML-зв’язок між трьома компонентами?
 * 3. Чи є ризик, що Controller стане “збірною солянкою”?
 *    Звісно є , залежить від дизайну додатку , але якщо слідкувати і писати кожний функціонал в окремих слоях та классах цього не буде.
 * 4. У яких випадках MVC – зайва абстракція?
 *    Коли скоріш за все ми не будемо розришювати наш додаток і він має не велку кількість шарів , але в цілом
 *    якщо нам потрбіно розділити бізнес логіку від відображення і в більше ніж 2 умовних моделі , то це гарний підхід.
**/
public class App {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("Java" , "Alex"));
        books.add(new Book("Scala" , "Jim"));
        books.add(new Book("PHP" , "Thomas"));
        books.add(new Book("Ruby" , "Egor"));
        books.add(new Book("C" , "Harry Potter"));
        books.add(new Book("C++" , "Super Man"));

        BookService bookService = new BookService(new BookHolder(books));
        BookController bc = new BookController(bookService);
        Book book = new Book("PHP" , "Thomas");
        bc.getBookByUsername("Alex");
        System.out.println("--------------------------------------");
        bc.getBooks();
        System.out.println("--------------------------------------");
        bc.removeBook(book);
        System.out.println("--------------------------------------");
        bc.getBooks();
    }
}
