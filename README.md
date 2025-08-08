# Exercises OOP
## Exercises from https://www.geeksforgeeks.org/java/java-oop-exercises/  
1. Create a class MessagePrinter with a method printMessage(String name) which prints the message "hello <name>".  
2. Create a class Calculator with the following methods:  
   calculateSum(int number1, int number2) to calculate the sum of two numbers.  
   calculateDifference(int number1, int number2) to calculate the difference between two numbers.  
3. Create a class Employee with overloaded constructors to initialize employee details based on different combinations of arguments. Ensure the constructors support the creation of objects in various ways.  
4. Create a class SeriesCalculator with a method calculateSum(int n) to calculate the sum of the first n numbers in the series 1 + 3 + 5 + 7 + .... Use the formula Sum = (n/2) * [2*a + (n-1)*d], where "a" is the first term and "d" is the common difference.  
5. Create a class Biggest that contains a single-dimensional array as a data member and a method display() to find and display the largest element of the array.  
6. Create a class Rectangle with attributes length and width, each defaulting to 1. The class should include set and get methods for both attributes, and a method to calculate the area of the rectangle.  
7. Create a class Person with firstName and lastName as data members. Override the toString() method to return the full name of the person. Define constructors to take appropriate parameters.  
8. Create a Student class with name, rollNo, and marks as attributes. Write a method to calculate the grade based on the marks and display the grade. Create multiple instances of the Student class and print their grades.  
9. Write a program to accept three numbers and find the largest of the three using method overloading.  
10. Write a program to accept a number and display its last digit in words using a method in a class.  
11. Create a program that keeps track of the number of objects created and displays the count in a function called display().  
12. Write a program to accept a student’s name and three marks. Calculate the total and average, and display the result using a class and object.  
13. Create a class Car with attributes make, model, and year. The class should have a method displayDetails() that prints the details of the car. Include a constructor to initialize these attributes. Create an instance of the Car class and display its details.  
14. Create a class BankAccount with members AcctNo, balance, and AcctType. Implement the following operations:  
    - Deposit an amount of 10,000.  
    - Withdraw an amount of 5,000.  
    - Display account details.  
15. Create a program to accept three numbers and find the largest and second largest numbers using object-oriented principles.  
16. Write a program to store N elements in an array of integers. Display the elements, then accept a number to search for. Display whether the number is found using a linear search method within a class.  
17. Create a class Employee with members empNo, name, department, and salary. In main, create a reference variable of type Employee, allocate memory for the Employee object using the new operator, and initialize the data members using command line arguments. Display the data members.  
18. Create an Employee class with members empNo, name, department, and salary. Use a one-dimensional array of Employee objects (size 10) to read the data for 5 employees from command line arguments. Display the data and determine which employee has the highest salary.  
19. Create a class called AlphabetChecker with a method checkVowelOrConsonant(char letter). The method should accept a character (alphabet) and determine if it is a vowel (a, e, i, o, u) or a consonant. The program should display an appropriate message based on the input letter. Ensure the method handles both uppercase and lowercase letters.  
20. Create a class Book with data members Title, Author, Cost, and noOfBooks. Implement a function to display information about the book. Also:  
    Create 3 instances of the Book class and initialize the data members.  
    Accept a title and noOfBooks from the user. Check if the book exists and if sufficient copies are available. If so, calculate and display the total cost.  
21. Create a class Employee with overloaded constructors to initialize employee details based on different combinations of arguments. Test method overloading in a class by creating methods with the same name but different parameter types, return types, or parameter orders, and identify which can coexist.  
22. Create a class Store with attributes StoreID, StoreName, ProductList, and Revenue. Implement methods to add a product to the list, calculate total revenue, and display store information.  
23. Write a program to perform matrix addition using classes and objects, and display the result.  
24. Create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). Then, implement two subclasses Rectangle and Circle. The Rectangle class should have attributes for length and width, and the Circle class should have an attribute for radius. Both subclasses should implement the abstract methods to calculate the area and perimeter. Write a program to create instances of both classes, set their attributes, and display their area and perimeter.
25. Create a class Customer with name, address, and phone as attributes. Implement polymorphism by overriding methods in a subclass VIPCustomer to apply discounts for VIP customers.  
## Some special exercises from https://www.w3resource.com/java-exercises/oop/index.php
1. Write a Java program to create a class called "BankAccount" with attributes for account number, account holder's name, and balance. Include methods for depositing and withdrawing money, as well as checking the balance. Create a subclass called "SavingsAccount" that adds an interest rate attribute and a method to apply interest.
2. Write a Java program to create a class called "Vehicle" with attributes for make, model, and year. Create subclasses "Car" and "Truck" that add specific attributes like trunk size for cars and payload capacity for trucks. Implement a method to display vehicle details in each subclass.
3. Write a Java program to create a class called "Customer" with attributes for name, email, and purchase history. Implement methods to add purchases to the history and calculate total expenditure. Create a subclass "LoyalCustomer" that adds a discount rate attribute and a method to apply the discount.
4. Write a Java program to create a class called "Course" with attributes for course name, instructor, and credits. Create a subclass "OnlineCourse" that adds attributes for platform and duration. Implement methods to display course details and check if the course is eligible for a certificate based on duration.
5.  Write a Java program to create a class called "ElectronicsProduct" with attributes for product ID, name, and price. Implement methods to apply a discount and calculate the final price. Create a subclass " WashingMachine" that adds a warranty period attribute and a method to extend the warranty.
6. Write a Java program to create a class called "Building" with attributes for address, number of floors, and total area. Create subclasses "ResidentialBuilding" and "CommercialBuilding" that add specific attributes like number of apartments for residential and office space for commercial buildings. Implement a method to calculate the total rent for each subclass.
7. Write a Java program to create a class called "Event" with attributes for event name, date, and location. Create subclasses "Seminar" and "MusicalPerformance" that add specific attributes like number of speakers for seminars and performer list for concerts. Implement methods to display event details and check for conflicts in the event schedule.
8. Write a Java program to create a class called "CustomerOrder" with attributes for order ID, customer, and order date. Create a subclass "OnlineOrder" that adds attributes for delivery address and tracking number. Implement methods to calculate delivery time based on the address and update the tracking status.
9. Write a Java program to create a class called "Reservation" with attributes for reservation ID, customer name, and date. Create subclasses "ResortReservation" and "RailwayReservation" that add specific attributes like room number for hotels and seat number for flights. Implement methods to check reservation status and modify reservation details.
10. Write a Java program to create a class called "Pet" with attributes for name, species, and age. Create subclasses "Dog" and "Bird" that add specific attributes like favorite toy for dogs and wing span for birds. Implement methods to display pet details and calculate the pet's age in human years.
11. Write a Java program to create a class called "GymMembership" with attributes for member name, membership type, and duration. Create a subclass "PremiumMembership" that adds attributes for personal trainer availability and spa access. Implement methods to calculate membership fees and check for special offers based on membership type.

# Патерни Проєктування (OOD)

---

## Creational Patterns

---

### Singleton – Конфігураційний Менеджер

#### Завдання
Реалізуй клас `ConfigurationManager`, який:
1. Зберігає конфіг-параметри в `Map<String, String>`
2. Дозволяє зчитувати та змінювати параметри
3. Повинен мати лише один екземпляр (Singleton) у всій програмі
4. Гарантує централізовану конфігурацію, що не дублюється

#### Питання для рефлексії
1. Коли в реальних програмах використовується Singleton?
2. Чи має цей підхід мінуси у тестуванні або багатопоточності?
3. Чим він кращий за static-методи?
4. Яка UML-структура цього патерну?
5. У яких ситуаціях Singleton може нашкодити?



### Factory Method – Фабрика Монет

#### Завдання
1. Створи інтерфейс `Coin`
2. Створи реалізації:
   - `Penny`
   - `Nickel`
   - `Dime`
   - `Quarter`
3. Створи `CoinFactory`, яка приймає номінал і повертає відповідну монету
4. Клієнт не повинен знати, який клас створюється
5. Це дозволяє легко додавати нові монети

#### Питання для рефлексії
1. У чому перевага Factory над прямим викликом `new`?
2. Як виглядає UML-структура цього патерну?
3. Чи легко масштабувати таку фабрику?
4. Коли Factory Method не варто використовувати?



### Abstract Factory – Система UI для Тем Оформлення

#### Завдання
Створи програму, яка підтримує декілька стилів оформлення інтерфейсу (наприклад: Windows, MacOS, Italy).  
Кожний стиль повинен мати **сімейство компонентів** (кнопка, чекбокс), які виглядають відповідно до обраної теми.

#### Кроки виконання
1. Створи інтерфейси для продуктів:
   - `Button` (метод `render()` – відображення кнопки)
   - `Checkbox` (метод `render()` – відображення чекбоксу)
2. Створи реалізації продуктів для кожної теми оформлення:
   - **Windows**: `WindowsButton`, `WindowsCheckbox`
   - **MacOS**: `MacButton`, `MacCheckbox`
   - **Italy**: `ItalyButton`, `ItalyCheckbox` (унікальний стиль)
3. Створи **абстрактну фабрику** `GUIFactory` з методами:
   - `Button createButton()`
   - `Checkbox createCheckbox()`
4. Створи **конкретні фабрики** для кожної теми:
   - `WindowsFactory`
   - `MacFactory`
   - `ItalyFactory`
5. Створи клас `Application`, який приймає `GUIFactory`, створює елементи і відображає їх через `renderUI()`.
6. Реалізуй вибір теми оформлення через консоль (`Scanner`).

---

## Structural Patterns

---

### Facade – Єдина Точка Керування Бібліотекою

#### Завдання
Реалізуй клас `LibraryFacade`, який:
- Знаходить книгу
- Бронює її
- Сповіщає користувача

Використовуй підсистеми:
- `BookInventory`
- `ReservationService`
- `NotificationService`

Клієнт взаємодіє лише з `LibraryFacade`, який приховує складність.

#### Питання для рефлексії
1. Чим Facade відрізняється від Controller?
2. Яка UML-структура патерну Facade?
3. У яких випадках його використання корисне?
4. Коли цей підхід додає зайву складність?



## Behavioral Patterns



### Strategy – Розрахунок Тарифу на Парковці

#### Завдання
1. Реалізуй інтерфейс `FareStrategy`
2. Створи реалізації:
   - `BaseFareStrategy` – 10₴/год
   - `WeekendFareStrategy` – 15₴/год
3. Реалізуй клас `FareCalculator`, який приймає стратегію та рахує ціну
4. Дозволь змінювати стратегію "на льоту"

#### Питання для рефлексії
1. Чому Strategy краще, ніж if-else?
2. Як би ти додав нову стратегію?
3. Яка UML-структура Strategy?
4. Коли цей патерн – зайве ускладнення?



### State – Поведінка Торгового Автомата

#### Завдання
1. Створи інтерфейс `VendingMachineState`:
   - `insertCoin()`
   - `selectItem()`
2. Створи класи станів:
   - `IdleState`
   - `HasMoneyState`
   - `DispensingState`
3. Клас `VendingMachine` тримає поточний стан і делегує виклики

#### Питання для рефлексії
1. Чим State відрізняється від Strategy?
2. Як виглядає UML-подання цього патерну?
3. Коли цей патерн буде надто складним?
4. Чи можна реалізувати через `switch` або `enum`?



### Observer – Підписка на Нові Книги

#### Завдання
1. Створи інтерфейс `Observer` (наприклад, `LibraryUser`)
2. Створи клас `BookPublisher`, який:
   - Зберігає список підписників
   - Сповіщає їх про нові книги
3. Користувачі можуть підписуватися/відписуватись
4. При появі нової книги всі отримують повідомлення

#### Питання для рефлексії
1. Як виглядає UML-структура патерну Observer?
2. Де він використовується у реальних фреймворках (JavaFX, Spring)?
3. Переваги та недоліки?
4. Коли краще не використовувати Observer?

---

## Architectural Patterns

---

### MVC – Консольна Бібліотека

#### Завдання
Розділи логіку на 3 компоненти:
- **Model** – клас `Book`, дані користувача
- **View** – методи виводу в консоль
- **Controller** – обробка введення: додати/видалити/знайти

View не знає про модель напряму — лише через контролер.

#### Питання для рефлексії
1. Чому MVC корисний для підтримки коду?
2. Який UML-зв’язок між компонентами?
3. Чи є ризик, що Controller стане “збірною солянкою”?
4. Коли MVC – зайва абстракція?

---



# OOD exercises

| Назва Задачі | Короткий Опис | Ключові Об'єкти/Класи | Застосовувані Принципи/Патерни | Посилання на Детальне Рішення (з UML та Кодом)                                                              |
|---|---|---|---|-------------------------------------------------------------------------------------------------------------|
| **Дизайн Парковки (Design Parking Lot)** | Система управління парковкою з поверхами, в'їздами/виїздами, різними ТЗ, квитками, оплатою, відображенням вільних місць. | `ParkingLot`, `ParkingFloor`, `ParkingSpot`, `Vehicle`, `ParkingTicket`, `EntrancePanel`, `ExitPanel`, `Payment`, `ParkingManager`, `FareCalculator`. | SOLID, Singleton, Strategy, Facade, Composition.| https://www.designgurus.io/course-play/grokking-the-object-oriented-design-interview/doc/design-a-parking-lot , https://bytebytego.com/courses/object-oriented-design-interview/design-a-parking-lot |
| **Дизайн Торгового Автомата (Design Vending Machine)** | Торговий автомат, що приймає монети, дозволяє вибирати продукти, повертає решту, має функції скасування/скидання. | `VendingMachine`, `Coin` (enum), `Item` (enum), `Inventory`, `Bucket`, `Exceptions`. | State, Strategy, Encapsulation, Abstraction. | https://javarevisited.blogspot.com/2016/06/design-vending-machine-in-java.html |
| **Дизайн Шахової Гри (Design Chess Game)** | Клас-структура для шахової гри: дошка, фігури, правила ходів, перевірка перемоги. | `Board`, `Piece` (з підкласами), `Spot`/`Cell`, `Player`, `Game`. | Strategy, State, Observer, Polymorphism, Inheritance. | https://medium.com/@kumar.atul.2122/design-chess-game-low-level-design-using-ood-3f15361403b1 |
| **Система Управління Бібліотекою (Design Library Management System)** | Система для управління книгами, користувачами, позиками, поверненнями. | `Book`, `Member`/`User`, `Loan`/`Borrowing`, `Library`, `Librarian`. | MVC, Strategy, Observer, Composition. | https://medium.com/@kumar.atul.2122/design-library-management-system-low-level-design-using-ood-a8eed1691e53     |
| **Гра "Змії та Драбини" (Snake and Ladder Game)** | Багатокористувацька гра з дошкою N x N, випадковим розміщенням змій та драбин, правилами ходів та перемоги. | `Board`, `Dice`, `Player`, `Game`, `SpecialEntity` (абстрактний), `Snake`, `Ladder`. | Strategy, State, Polymorphism, Inheritance. | https://www.geeksforgeeks.org/system-design/design-snake-and-ladder-game-using-python-oops/ |

## Details  
  
**Дизайн Парковки (Design Parking Lot)**  
&nbsp;&nbsp;&nbsp;&nbsp;Розробка системи управління парковкою є однією з найпопулярніших задач на LLD-співбесідах, що дозволяє оцінити здатність кандидата моделювати фізичні об'єкти та застосовувати принципи ООП. Система повинна підтримувати кілька поверхів, мати численні точки в'їзду та виїзду, обслуговувати різні типи транспортних засобів (наприклад, автомобілі, вантажівки, мотоцикли) та включати функціонал для видачі квитків, оплати та відображення доступних місць.   
&nbsp;&nbsp;&nbsp;&nbsp;Ключові об'єкти та класи, які слід розглянути, включають: ParkingLot (центральний компонент), ParkingFloor (для управління поверхами), ParkingSpot (з різними типами, такими як Handicapped, Compact, Large, Motorcycle, Electric), Vehicle (з підкласами для різних типів транспортних засобів), ParkingTicket, EntrancePanel та ExitPanel (для взаємодії з користувачами), Payment (для обробки транзакцій), ParkingManager (для управління розподілом місць) та FareCalculator (для розрахунку плати).   
&nbsp;&nbsp;&nbsp;&nbsp;При проектуванні цієї системи можна застосувати кілька патернів та принципів. Наприклад, патерн Singleton може бути використаний для класу ParkingLot, щоб забезпечити наявність лише одного екземпляра парковки. Патерн Strategy може бути застосований для інкапсуляції правил ціноутворення у    
FareStrategy (наприклад, BaseFareStrategy, PeakHoursFareStrategy), дозволяючи FareCalculator динамічно перемикатися між правилами. Патерн Facade може бути реалізований у класі    
ParkingLot для спрощення взаємодії клієнтів, делегуючи завдання підсистемам, таким як ParkingManager та FareCalculator. Композиція буде використовуватися для побудови відносин між    
ParkingLot, ParkingFloor та ParkingSpot.    
  
**Дизайн Торгового Автомата (Design Vending Machine)**  
&nbsp;&nbsp;&nbsp;&nbsp;Задача проектування торгового автомата є класичним прикладом для демонстрації розуміння ООП та патернів дизайну. Основні вимоги включають: прийом різних монет (наприклад, 1, 5, 10, 25 центів), можливість вибору продуктів (наприклад, Coke, Pepsi, Soda), повернення решти, функція скасування запиту та можливість скидання для постачальника.   
&nbsp;&nbsp;&nbsp;&nbsp;Ключові об'єкти та класи можуть включати: VendingMachine (основний інтерфейс), перелічення (enum) для Coin та Item (для представлення підтримуваних монет та продуктів), класи для управління інвентарем (Inventory), а також спеціалізовані класи винятків (NotFullPaidException, NotSufficientChangeException, SoldOutException).   
&nbsp;&nbsp;&nbsp;&nbsp;При проектуванні торгового автомата можуть бути використані патерни State для управління станами автомата (наприклад, Idle, ProcessingPayment, DispensingItem) та Strategy для обробки платежів або видачі решти. Принципи інкапсуляції та абстракції будуть застосовані для приховування внутрішніх деталей реалізації та надання чистого інтерфейсу.
  
**Дизайн Шахової Гри (Design Chess Game)**  
&nbsp;&nbsp;&nbsp;&nbsp;Проектування шахової гри — це ще одна поширена задача, яка перевіряє здатність кандидата структурувати складну логіку за допомогою ООП. Необхідно розробити клас-структуру, яка включає дошку, різні шахові фігури, правила ходів для кожної фігури та механізми для перевірки перемоги.   
&nbsp;&nbsp;&nbsp;&nbsp;Основні об'єкти та класи: Board (для представлення шахової дошки), Piece (абстрактний базовий клас для всіх фігур) з підкласами, такими як Pawn, Knight, Bishop, Rook, Queen, King (кожен з яких реалізує свою унікальну логіку ходів), Spot або Cell (для представлення окремих клітинок на дошці), Player та Game (для управління загальним ігровим процесом).   
&nbsp;&nbsp;&nbsp;&nbsp;Принципи поліморфізму та успадкування є центральними для цієї задачі, оскільки різні фігури (підкласи Piece) мають спільну поведінку, але відрізняються у своїх правилах ходів. Патерн Strategy може бути використаний для інкапсуляції логіки можливих ходів для кожної фігури, дозволяючи динамічно змінювати або додавати нові правила. Патерн State може відстежувати стан гри або окремих фігур. Патерн Observer може бути корисним для оновлення користувацького інтерфейсу при зміні стану гри.
  
**Система Управління Бібліотекою (Design Library Management System)**  
&nbsp;&nbsp;&nbsp;&nbsp;Проектування системи управління бібліотекою є поширеною задачею, що дозволяє продемонструвати розуміння відносин між об'єктами та управління колекціями. Система повинна дозволяти управління книгами, користувачами, процесами позики та повернення книг.   
&nbsp;&nbsp;&nbsp;&nbsp;Ключові об'єкти та класи включають: Book (з атрибутами, такими як назва, автор, ISBN), Member або User (для представлення користувачів бібліотеки), Loan або Borrowing (для відстеження позичених книг), Library (як центральний клас, що управляє колекціями книг та членів) та Librarian (для адміністративних функцій).   
&nbsp;&nbsp;&nbsp;&nbsp;Ця задача може використовувати архітектурний патерн Model-View-Controller (MVC) для розділення даних, інтерфейсу користувача та обробки вхідних даних. Патерн Strategy може бути застосований для різних типів пошуку книг (за автором, назвою, ISBN), а патерн Observer — для сповіщень про прострочені книги або нові надходження. Композиція буде використовуватися для представлення колекцій книг та користувачів у класі    
  
**Гра "Змії та Драбини" (Snake and Ladder Game)**  
&nbsp;&nbsp;&nbsp;&nbsp;Проектування багатокористувацької гри "Змії та Драбини" — це задача, яка дозволяє продемонструвати навички моделювання ігрової логіки та застосування ООП. Гра передбачає дошку розміром N x N з випадково розміщеними зміями та драбинами, правила ходів за допомогою кубика та умови перемоги.   
&nbsp;&nbsp;&nbsp;&nbsp;Основні об'єкти та класи: Board (для представлення ігрового поля), Dice (для імітації кидка кубика), Player (для кожного гравця), Game (для управління ігровим циклом), а також абстрактний клас SpecialEntity з підкласами Snake та Ladder (для представлення спеціальних клітинок, що змінюють позицію гравця).   
&nbsp;&nbsp;&nbsp;&nbsp;Принципи поліморфізму та успадкування будуть ключовими для обробки SpecialEntity, де Snake та Ladder успадковують спільну поведінку, але мають різні ефекти. Патерн Strategy може бути використаний для реалізації різних правил гри або механізмів ходів. Патерн State може відстежувати стан гри або кожного гравця.