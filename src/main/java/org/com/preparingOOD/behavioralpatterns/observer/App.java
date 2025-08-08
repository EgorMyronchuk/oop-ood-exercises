package org.com.preparingOOD.behavioralpatterns.observer;
/**
 *  1. Створи інтерфейс `Observer` (наприклад, `LibraryUser`)
 * 2. Створи клас `BookPublisher`, який:
 *     - Зберігає список підписників
 *     - Сповіщає їх про нові книги
 * 3. Користувачі можуть підписуватися/відписуватись
 * 4. Коли з’являється нова книга — всі отримують повідомлення
 *
 * **Питання для рефлексії:**
 * 1. Як виглядає UML-структура патерну Observer?
 * 2. Де він використовується в реальних фреймворках (наприклад, JavaFX, Spring)?
 * Технологія JavaBeans також використовує подібний механізм. Властивості можуть бути «спостережуваними»
 * 3. Які переваги/недоліки має такий підхід?
 *  Слабка зв'язаність , Дотримання принципу відкритості/закритості .
 *  Недоліки це Порушення принципу єдиної відповідальності , та якщо великий список мала продуктивність.
 * 4. Коли краще не використовувати Observer?
 * Коли ми не знаємо чи часто взагалі будуть новини , потенційна втрата данних якщо у якомусть спостерегачі буде помилка .
**/
public class App {
    public static void main(String[] args) {
        BookPublisher bookPublisher = new BookPublisher();

        User user = new User("Anton");
        User user1 = new User("Artem");
        User user2 = new User("Egor");
        User user3 = new User("Lev");
        User user4 = new User("Alex");

        bookPublisher.subscribe(user);
        bookPublisher.subscribe(user1);
        bookPublisher.subscribe(user2);
        bookPublisher.subscribe(user3);
        bookPublisher.subscribe(user4);

        bookPublisher.makeNewTitle("Observer Pattern, Helooooo");
        bookPublisher.unsubscribe(user1);
        bookPublisher.unsubscribe(user2);
        bookPublisher.makeNewTitle("Observer Pattern, HI");
        bookPublisher.unsubscribe(user3);
        bookPublisher.makeNewTitle("Observer Pattern, Title");
    }
}
