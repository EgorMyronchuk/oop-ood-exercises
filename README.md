# 🚀 ООП та Патерни Проєктування
## 📚 Зміст

- [🎯 Вправи з OOP (GeeksForGeeks)](#-вправи-з-oop-geeksforgeeks)
- [Some special exercises from https://www.w3resource.com/java-exercises/oop/index.php](#some-special-exercises-from-httpswwww3resourcecomjava-exercisesoopindexphp)
- [🏗 Породжувальні патерни](#-породжувальні-патерни)
   - [Singleton – Конфігураційний Менеджер](#singleton--конфігураційний-менеджер)
   - [Factory Method – Фабрика Монет](#factory-method--фабрика-монет)
   - [Abstract Factory – Система UI для Тем Оформлення](#abstract-factory--система-ui-для-тем-оформлення)
   - [Builder – Конструктор Піцци](#builder--конструктор-піцци)
   - [Prototype – Клонування космічних кораблів](#prototype--клонування-космічних-кораблів)
- [🧱 Структурні патерни](#-структурні-патерни)
   - [Facade – Єдина Точка Керування Бібліотекою](#facade--єдина-точка-керування-бібліотекою)
   - [Adapter – Адаптер для підтримки нових аудіо форматів у старому плеєрі](#adapter--адаптер-для-підтримки-нових-аудіо-форматів-у-старому-плеєрі)
   - [Bridge – Розділення абстракції та реалізації для рендерингу фігур](#bridge--розділення-абстракції-та-реалізації-для-рендерингу-фігур)
   - [Composite – Організація ієрархічної структури об’єктів для спільної роботи з окремими елементами і групами](#composite--організація-ієрархічної-структури-обєктів-для-спільної-роботи-з-окремими-елементами-і-групами)
   - [Decorator – Динамічне розширення функціональності об’єктів без зміни їхнього коду](#decorator--динамічне-розширення-функціональності-обєктів-без-зміни-їхнього-коду)
   - [Flyweight – Економія пам’яті за рахунок розділення спільного стану між об’єктами](#flyweight--економія-памяті-за-рахунок-розділення-спільного-стану-між-обєктами)
   - [Proxy – Контроль доступу та оптимізація запитів](#proxy--контроль-доступу-та-оптимізація-запитів)
- [🤝 Поведінкові патерни](#-поведінкові-патерни)
   - [Strategy – Розрахунок Тарифу на Парковці](#strategy--розрахунок-тарифу-на-парковці)
   - [State – Поведінка Торгового Автомата](#state--поведінка-торгового-автомата)
   - [Observer – Підписка на Нові Книги](#observer--підписка-на-нові-книги)
   - [Chain of Responsibility – Гнучка передача обробки між об’єктами](#chain-of-responsibility--гнучка-передача-обробки-між-обєктами)
   - [Command – Інкапсуляція запиту у вигляді об’єкта](#command--інкапсуляція-запиту-у-вигляді-обєкта)
   - [Iterator – Послідовний обхід колекцій фільмів](#iterator--послідовний-обхід-колекцій-фільмів)
   - [Visitor – Операції над елементами документу](#visitor--операції-над-елементами-документу)
   - [Mediator – Координація взаємодії між об’єктами](#mediator--координація-взаємодії-між-обєктами)
   - [Memento – Збереження і відновлення стану об’єкта](#memento--збереження-і-відновлення-стану-обєкта)
   - [Template Method – Шаблонний метод](#template-method--шаблонний-метод)
- [🏛 Архітектурні патерни](#-архітектурні-патерни)
   - [MVC – Консольна Бібліотека](#mvc--консольна-бібліотека)

---

# 🚀 ООП та Патерни Проєктування
## 🎯 Вправи з OOP (GeeksForGeeks)
<details>
## Some special exercises from https://www.geeksforgeeks.org/java/java-oop-exercises/ 
  <summary>Розгорнути розділ</summary>

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

</details>
## Some special exercises from https://www.w3resource.com/java-exercises/oop/index.php
<details>
  <summary>Розгорнути розділ</summary>

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

</details>
## 🏗 Породжувальні патерни
<details>
  <summary>Розгорнути розділ</summary>

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



### Builder – Конструктор Піцци

#### Завдання
Реалізуй систему для створення піци з різними інгредієнтами та параметрами, використовуючи патерн Builder.

#### Кроки виконання
1. Створи клас `Pizza`, який має такі поля:
   - `size` (наприклад, маленька, середня, велика)
   - `cheese` (boolean — чи є сир)
   - `pepperoni` (boolean)
   - `bacon` (boolean)
   - інші інгредієнти на вибір
2. Створи інтерфейс `PizzaBuilder` з методами для встановлення кожного параметра, наприклад:
   - `PizzaBuilder setSize(String size)`
   - `PizzaBuilder addCheese()`
   - `PizzaBuilder addPepperoni()`
   - `PizzaBuilder addBacon()`
   - `Pizza build()` — повертає готову піцу
3. Створи конкретного билдера `ConcretePizzaBuilder`, який реалізує `PizzaBuilder` і зберігає внутрішній об’єкт `Pizza`, який поступово збирається
4. Створи клас `Director`, який має методи для створення стандартних варіантів піци (наприклад, `buildVegetarianPizza()`, `buildMeatLoversPizza()`) використовуючи билдера
5. У клієнтському коді використай `Director` і `ConcretePizzaBuilder` для створення різних піц

#### Питання для рефлексії
1. Чому Builder краще, ніж конструктор з великою кількістю параметрів?
2. Як можна змінити внутрішню реалізацію будівельника, не змінюючи клієнтський код?
3. Яка UML-структура патерну Builder?
4. В яких випадках застосування Builder – зайве ускладнення?

### Prototype – Клонування космічних кораблів

#### Завдання
Реалізуй систему для створення та клонування різних типів космічних кораблів, використовуючи патерн Prototype.  
Мета – навчитися працювати з конструктором копіювання у базовому класі та підкласах, а також забезпечити повне незалежне клонування (deep copy при необхідності).

#### Кроки виконання
1. Створи абстрактний клас `SpaceShip`, який має такі поля:
   - `name` (String — назва корабля)
   - `speed` (int — максимальна швидкість у км/с)
   - `fuelCapacity` (int — ємність бака з паливом)
   - `color` (String — колір корпусу)
   - абстрактний метод `SpaceShip clone()`
   - конструктор копіювання `SpaceShip(SpaceShip target)` для копіювання даних з іншого об’єкта
2. Створи підклас `BattleShip`, який додатково має:
   - `weaponCount` (int — кількість гармат)
   - `shieldStrength` (int — міцність щита)
   - конструктор копіювання `BattleShip(BattleShip target)`
   - перевизначений метод `clone()`, який повертає `new BattleShip(this)`
3. Створи підклас `CargoShip`, який додатково має:
   - `cargoCapacity` (int — вантажопідйомність у тоннах)
   - `hasRefrigeration` (boolean — наявність холодильних камер)
   - конструктор копіювання `CargoShip(CargoShip target)`
   - перевизначений метод `clone()`, який повертає `new CargoShip(this)`
4. Створи клас `FleetRegistry`, який:
   - зберігає набір базових кораблів-прототипів у `Map<String, SpaceShip>`
   - має метод `SpaceShip get(String key)`, який повертає клон потрібного корабля
5. У клієнтському коді (`Application`):
   - створи базові об’єкти `BattleShip` та `CargoShip` і додай їх у `FleetRegistry`
   - створи кілька клонів з реєстру, зміни їм характеристики
   - переконайся, що зміни у клонах не впливають на оригінали

#### Питання для рефлексії
1. Навіщо Prototype з конструктором копіювання, якщо можна створити новий об’єкт через `new`?
2. Як зміниться реалізація, якщо у кораблів з’явиться складний об’єкт (наприклад, `Engine`), який теж потрібно клонувати?
3. Чому метод `clone()` у підкласах повертає конкретний тип, а не `SpaceShip`?
4. Як перевірити, що зміни у клонах не впливають на оригінали?
5. Яка UML-структура патерну Prototype?

---

</details>
## 🧱 Структурні патерни
<details>
  <summary>Розгорнути розділ</summary>

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

### Adapter – Адаптер для підтримки нових аудіо форматів у старому плеєрі

#### Завдання
Реалізуй систему, яка дозволить старому аудіо плеєру відтворювати різні формати аудіо файлів (MP3, VLC, MP4), використовуючи патерн Adapter.

#### Кроки виконання
1. Створи інтерфейс `AudioPlayer` з методом:
   - `void play(String audioType, String fileName)` — `audioType` — тип аудіо формату, який передається у вигляді рядка, наприклад: `"mp3"`, `"vlc"`, `"mp4"`.
2. Реалізуй клас `OldAudioPlayer`, який підтримує лише формат `"mp3"`:
   - Якщо метод `play` отримує `"mp3"`, він відтворює файл.
   - Для інших форматів виводить повідомлення, що формат не підтримується.
3. Створи інтерфейс `AdvancedAudioPlayer` з методами:
   - `void playVlc(String fileName)`
   - `void playMp4(String fileName)`
4. Реалізуй класи `VlcPlayer` і `Mp4Player`, які реалізують `AdvancedAudioPlayer` і відтворюють відповідні формати.
5. Створи клас `AudioPlayerAdapter`, який реалізує інтерфейс `AudioPlayer`:
   - В залежності від `audioType` у методі `play` викликає відповідний метод класів `VlcPlayer` або `Mp4Player`.
6. Змініть `OldAudioPlayer`, щоб при отриманні форматів `"vlc"` або `"mp4"` він використовував `AudioPlayerAdapter` для відтворення цих файлів.
7. У клієнтському коді продемонструй, як `OldAudioPlayer` відтворює файли форматів `"mp3"`, `"vlc"` і `"mp4"`.

#### Питання для рефлексії
1. Чому старий плеєр не підтримує нові формати без використання адаптера?
2. Як Adapter допомагає зберегти існуючий код плеєра незмінним?
3. Які переваги використання рядка `audioType` для визначення формату?
4. Чи можна додати підтримку інших форматів без зміни клієнтського коду?
5. Які альтернативи патерну Adapter у подібних ситуаціях?

### Bridge – Розділення абстракції та реалізації для рендерингу фігур

#### Завдання
Реалізуй систему для відображення геометричних фігур (наприклад, коло та квадрат), яка дозволяє змінювати спосіб рендерингу (2D або 3D) без зміни коду самих фігур, використовуючи патерн Bridge.

#### Кроки виконання
1. Створи інтерфейс `Renderer` з методами:
   - `void renderCircle(float radius)`
   - `void renderSquare(float side)`

2. Реалізуй два класи, які реалізують `Renderer`:
   - `TwoDRenderer` — відображає фігури у 2D стилі (виводить повідомлення з даними фігури та інформацією, що це 2D рендер).
   - `ThreeDRenderer` — відображає фігури у 3D стилі.

3. Створи абстрактний клас `Shape`, який зберігатиме посилання на об’єкт `Renderer` і матиме метод:
   - `abstract void draw()` — відображає фігуру за допомогою наданого рендерера.

4. Реалізуй два класи-форми, що наслідують `Shape`:
   - `Circle` — зберігає радіус та реалізує метод `draw()`.
   - `Square` — зберігає довжину сторони та реалізує метод `draw()`.

5. У клієнтському коді продемонструй:
   - Створення фігур з 2D рендерером та 3D рендерером.
   - Виклик методу `draw()` для кожної фігури, показуючи, що рендер можна змінювати незалежно від класу фігури.

#### Питання для рефлексії
1. Як патерн Bridge дозволяє змінювати спосіб рендерингу без зміни коду класів фігур?
2. Чим Bridge відрізняється від Adapter у цьому випадку?
3. Які переваги використання інтерфейсу `Renderer`?
4. Чи можна додати новий тип фігури або рендерера без зміни існуючого коду?
5. У яких ще сферах можна використати патерн Bridge?

### Composite – Організація ієрархічної структури об’єктів для спільної роботи з окремими елементами і групами

#### Завдання
Реалізуй систему, яка дозволяє працювати зі складними ієрархіями об’єктів, де окремі елементи (листя) і групи елементів (композити) мають однаковий інтерфейс і можуть оброблятися однаково, використовуючи патерн Composite.

#### Кроки виконання
1. Створи інтерфейс `Component` з методами:
   - `void showDetails()` — виводить інформацію про компонент.
   - Можна додати інші методи, які логічні для об’єктів і груп (наприклад, `getPrice()`, `add(Component c)`, `remove(Component c)` для композитів).

2. Реалізуй клас `Leaf`, який представляє простий елемент:
   - Має своє унікальне ім’я або властивості.
   - Реалізує методи інтерфейсу `Component`.

3. Реалізуй клас `Composite`, який представляє групу компонентів:
   - Має колекцію `List<Component>`.
   - Реалізує методи додавання, видалення ітерації по підкомпонентах.
   - Метод `showDetails()` виводить інформацію про себе і рекурсивно викликає `showDetails()` для всіх дочірніх компонентів.

4. У клієнтському коді створюй складну ієрархію:
   - Створи окремі листя (наприклад, товари).
   - Створи композити (наприклад, категорії товарів), які можуть містити листя або інші композити.
   - Використовуй єдиний інтерфейс для обходу всієї структури і виводу інформації.

#### Питання для рефлексії
1. Яку проблему допомагає вирішити патерн Composite?
2. Як патерн дозволяє працювати однаково з окремими об’єктами і групами об’єктів?
3. Які переваги надає використання єдиного інтерфейсу для листя і композитів?
4. Чи можна додати нові типи компонентів без зміни клієнтського коду?
5. У яких сферах або проєктах Composite буде особливо корисним?

### Decorator – Динамічне розширення функціональності об’єктів без зміни їхнього коду

#### Завдання
Реалізуй систему обробки текстових повідомлень для чату, де базове повідомлення можна доповнювати різними поведінками (наприклад, форматування, маркування часу, фільтрація) без зміни початкового класу. Використай патерн Decorator, щоб мати можливість динамічно комбінувати декоратори та застосовувати їх у довільному порядку.

#### Кроки виконання
1. Створи інтерфейс `Message` з методом:
   - `String getContent()` — повертає поточний вміст повідомлення.

2. Реалізуй клас `PlainMessage`, який представляє базове повідомлення:
   - Приймає текст у конструкторі.
   - Повертає текст без змін у `getContent()`.

3. Створи абстрактний клас `MessageDecorator`, який реалізує `Message`:
   - Містить посилання на інший об’єкт `Message` (який декорується).
   - Делегує виклик `getContent()` вкладеному об’єкту.
   - Слугує базою для конкретних декораторів.

4. Реалізуй щонайменше три конкретні декоратори:
   - `TimestampDecorator` — додає на початок рядка позначку часу у форматі `YYYY-MM-DDTHH:mm:ss` і пробіл перед оригінальним текстом.
   - `UppercaseDecorator` — перетворює вміст повідомлення у верхній регістр.
   - `CensorVowelsDecorator` — замінює всі голосні літери (`a, e, i, o, u, A, E, I, O, U`, а також `а, е, є, и, і, ї, о, у, ю, я, А, Е, Є, И, І, Ї, О, У, Ю, Я`) на символ `'*'`.

5. Перевір комбінації декораторів у клієнтському коді:
   - Створи базове повідомлення з текстом, наприклад: `Hello, Decorator!`.
   - Застосуй декоратори в різному порядку та виведи результати:
      - Лише `PlainMessage` → очікується оригінальний текст.
      - `UppercaseDecorator(PlainMessage)` → текст у верхньому регістрі.
      - `CensorVowelsDecorator(PlainMessage)` → замінені голосні.
      - `TimestampDecorator(CensorVowelsDecorator(UppercaseDecorator(PlainMessage)))` → ілюстрація роботи ланцюжка (порядок має впливати на результат).

6. Додай клас `Demo` (клієнтський код):
   - Створює кілька варіацій ланцюжків декораторів.
   - Виводить у консоль результати кожної варіації з підписами, щоб було видно відмінності між порядком застосування декораторів.

7. Забезпеч тестованість:
   - Для кожного декоратора наведи по 1–2 приклади вхідних рядків і очікуваних результатів (можна у вигляді коментарів або простих перевірок у `main`).
   - Переконайся, що декоратори не змінюють стан базового `PlainMessage`, а працюють лише з результатом `getContent()` вкладеного об’єкта.

#### Питання для рефлексії
1. Яку проблему вирішує патерн Decorator у порівнянні з наслідуванням?
2. Чому порядок застосування декораторів має значення та як це впливає на кінцевий результат?
3. Як за допомогою абстрактного декоратора спрощується додавання нових видів обробки?
4. Чим небезпечне надмірне ускладнення ланцюжків декораторів і як його уникнути?
5. Які ще декоратори можна додати до цієї системи (наприклад, обрізання пробілів, додавання підпису користувача, екранування спецсимволів) і як їх комбінувати?

### Flyweight – Економія пам’яті за рахунок розділення спільного стану між об’єктами

#### Завдання
Реалізуй систему відображення дерев у 2D-грі, де кожне дерево має унікальні координати, висоту та сезон, але всі дерева одного типу (наприклад, «дуб», «сосна») ділять між собою однакові важкі дані — текстуру та модель. Використай патерн Flyweight, щоб уникнути дублювання важкої інформації та зменшити використання пам’яті.

#### Кроки виконання
1. Створи інтерфейс `TreeType` з методом:
   - `void draw(int x, int y, String season)` — малює дерево на заданих координатах з урахуванням сезону.

2. Реалізуй клас `ConcreteTreeType`, який представляє тип дерева:
   - Зберігає **intrinsic** стан: текстуру (`texture`) та модель (`model`).
   - Ініціалізується через конструктор.
   - У методі `draw(...)` використовує intrinsic-дані та параметри з виклику (extrinsic).

3. Створи клас `TreeFactory` (фабрика flyweight-об’єктів):
   - Містить мапу для зберігання створених `ConcreteTreeType` (ключ — комбінація текстури та моделі).
   - Метод `getTreeType(String texture, String model)`:
      - Якщо об’єкт з таким ключем уже є в мапі — повертає його.
      - Якщо ні — створює новий `ConcreteTreeType`, зберігає в мапі та повертає.

4. Створи клас `Tree`:
   - Зберігає **extrinsic** стан: координати (`x`, `y`), сезон (`season`).
   - Має посилання на об’єкт `TreeType` (агрегація).
   - Метод `draw()` викликає метод `draw(...)` у свого `TreeType`, передаючи extrinsic.

5. Створи клас `Forest` (ліс):
   - Містить список дерев (`List<Tree>`).
   - Метод `plantTree(int x, int y, String season, String texture, String model)`:
      - Використовує `TreeFactory` для отримання `TreeType`.
      - Створює новий `Tree` з extrinsic станом і додає в список.
   - Метод `draw()` проходить по списку дерев і викликає `draw()` для кожного.

6. Додай клас `Demo` (клієнтський код):
   - Створює об’єкт `Forest`.
   - Засаджує його великою кількістю дерев, використовуючи повторювані типи (`texture` + `model`).
   - Виводить у консоль кількість створених унікальних `TreeType` та кількість посаджених дерев.
   - Для наочності можеш вивести хеш-коди або інші ідентифікатори flyweight-об’єктів, щоб підтвердити їх повторне використання.

7. Перевір тестовий сценарій:
   - Посади, наприклад, 1 000 000 дерев, але з 3-ма унікальними типами.
   - Переконайся, що кількість об’єктів `TreeType` у фабриці дорівнює 3.
   - Заміряй використання пам’яті до і після (опціонально).

#### Питання для рефлексії
1. Що таке intrinsic та extrinsic стан і як вони розподілені в цій системі?
2. Чому клієнт (`Tree`) зберігає посилання на flyweight, а не сам intrinsic стан?
3. Як фабрика допомагає уникнути дублювання даних і яка її роль у життєвому циклі flyweight-об’єктів?
4. Чому у Flyweight частіше використовується агрегація, а не композиція між клієнтом та flyweight-об’єктом?
5. Які ще приклади з життя або інших програм можна реалізувати через Flyweight (наприклад, відображення символів у текстовому редакторі, кэшування іконок у UI)?

### Proxy – Контроль доступу та оптимізація запитів

#### Завдання
Реалізуй систему завантаження документів у компанії. Уяви, що документи зберігаються у важкому віддаленому сховищі (наприклад, хмарний сервіс).  
Необхідно створити проксі, який:
- кешує вже завантажені документи;
- контролює права доступу (наприклад, лише менеджери можуть переглядати конфіденційні документи).

#### Кроки виконання
1. Створи інтерфейс `DocumentService` з методами:
   - `Document getDocument(String docId)` — повертає документ за його ідентифікатором.
   - `List<String> listDocuments()` — повертає список ідентифікаторів доступних документів.

2. Реалізуй клас `RemoteDocumentService`:
   - Імітує віддалений доступ до документів (можеш зробити затримку через `Thread.sleep()` для наочності).
   - Зберігає документи в `Map<String, Document>`.
   - Реалізує методи з інтерфейсу.

3. Створи клас `Document`:
   - Містить поля `id`, `title`, `content`.
   - Перевизнач метод `toString()`, щоб зручно відображати документ.

4. Реалізуй клас `DocumentProxy` (проксі):
   - Має посилання на `RemoteDocumentService`.
   - Зберігає кеш документів у `Map<String, Document>`.
   - При виклику `getDocument()`:
      - якщо документ є у кеші → повертає його з кеша;
      - якщо ні → завантажує з віддаленого сервісу, кладе у кеш і повертає.
   - Додай просту перевірку доступу:  
     якщо `role` користувача = `"manager"` → доступ до всіх документів;  
     якщо `"employee"` → доступ лише до публічних документів (наприклад, id починається з `"pub_"`).

5. Створи клас `ClientApp`:
   - Має метод `run(String role)`, який:
      - створює `DocumentProxy` з переданою роллю;
      - виводить список документів;
      - намагається завантажити кілька документів (один публічний і один конфіденційний);
      - викликає повторне завантаження того ж документа, щоб показати роботу кешу.

6. Створи клас `Demo`:
   - Запусти сценарій для ролей `"manager"` і `"employee"`.
   - Порівняй поведінку (для менеджера має показати всі документи, для працівника — обмеження доступу).
   - Переконайся, що повторне відкриття документа бере його з кеша.

#### Питання для рефлексії
1. У чому різниця між **Proxy** та **Decorator**? Чому тут використовується саме Proxy?
2. Які задачі виконує проксі у твоєму прикладі (оптимізація, контроль доступу)?
3. Чому ми кешуємо документи саме у проксі, а не у віддаленому сервісі?
4. Які ще реальні приклади можна реалізувати через Proxy (наприклад, віртуальна завантажка картинок у браузері, перевірка доступу до файлів у файловій системі)?
5. Як можна розширити приклад, щоб підтримати більше ролей або політику очищення кешу?

---

</details>
## 🤝 Поведінкові патерни
<details>
  <summary>Розгорнути розділ</summary>

---

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

### Chain of Responsibility – Гнучка передача обробки між об’єктами

#### Завдання
Реалізуй систему перевірки замовлення в інтернет-магазині.  
Уяви, що перед відправкою замовлення потрібно пройти кілька перевірок:
- чи зареєстрований користувач;
- чи є достатньо товарів на складі;
- чи сплачено замовлення;
- чи не перевищено ліміт вартості для безкоштовної доставки.

Кожна перевірка має виконуватися у власному обробнику, а ланцюжок обробників формується динамічно.  
Використай патерн **Chain of Responsibility**, щоб можна було легко додавати або прибирати перевірки без зміни клієнтського коду.

#### Кроки виконання
1. Створи клас `Order` з полями:
   - `String userId`
   - `boolean isPaid`
   - `int quantity`
   - `double totalPrice`
   - конструктор і гетери.

2. Створи абстрактний клас `OrderHandler`:
   - Містить посилання на наступний обробник (`next`).
   - Метод `setNext(OrderHandler next)` для побудови ланцюга.
   - Метод `handle(Order order)`:
      - Виконує перевірку (реалізується в нащадках).
      - Якщо перевірка пройдена і є наступний обробник → передає обробку далі.
      - Якщо перевірка не пройдена → завершує ланцюг і повідомляє про помилку.

3. Реалізуй щонайменше чотири конкретні обробники:
   - `UserValidationHandler` — перевіряє, що `userId` не порожній.
   - `StockValidationHandler` — перевіряє, що `quantity > 0`.
   - `PaymentValidationHandler` — перевіряє, що `isPaid = true`.
   - `DeliveryLimitHandler` — перевіряє, що `totalPrice >= 50` (наприклад, для безкоштовної доставки).

4. Створи клас `OrderProcessor`:
   - Має метод `process(Order order, OrderHandler chain)`.
   - Запускає обробку замовлення через початковий обробник у ланцюзі.
   - Виводить повідомлення у консоль про результат (успішно чи ні).

5. Створи клас `Demo` (клієнтський код):
   - Створи кілька різних замовлень:
      - некоректне (без користувача);
      - неоплачене;
      - з кількістю `0`;
      - валідне замовлення з оплатою і достатньою сумою.
   - Побудуй ланцюг із усіх перевірок:
     ```java
     OrderHandler chain = new UserValidationHandler()
         .setNext(new StockValidationHandler()
         .setNext(new PaymentValidationHandler()
         .setNext(new DeliveryLimitHandler())));
     ```
   - Пропусти замовлення через ланцюг і виведи результати.

#### Питання для рефлексії
1. У чому перевага Chain of Responsibility порівняно з умовними конструкціями `if-else`?
2. Що відбувається, якщо в середині ланцюга одна з перевірок провалюється?
3. Як можна змінити порядок обробників і що це дасть?
4. Як додати нову перевірку без зміни існуючих класів?
5. Які реальні системи використовують цей патерн (наприклад, обробка HTTP-запитів, логування, middleware у фреймворках)?

### Command – Інкапсуляція запиту у вигляді об’єкта

#### Завдання
Реалізуй систему керування текстовим редактором, яка підтримує виконання, скасування (Undo) та повтор (Redo) команд.  
Уяви, що в редакторі є такі базові дії:
- написання тексту;
- видалення тексту;
- копіювання та вставка;
- зміна регістру тексту (до верхнього/нижнього).

Кожна дія повинна бути оформлена у вигляді окремої команди, яку можна виконати, відкотити та при потребі повторити.

#### Кроки виконання
1. Створи клас `Editor` (Receiver), який містить:
   - поле `StringBuilder text` (поточний текст);
   - методи для виконання дій: `append(String str)`, `delete(int start, int end)`, `copy(int start, int end)`, `paste(int position)`, `toUpperCase(int start, int end)`, `toLowerCase(int start, int end)`;
   - поле `String clipboard` для збереження скопійованого тексту.

2. Створи інтерфейс `Command`:
   - метод `execute()` — виконує команду;
   - метод `undo()` — скасовує дію.

3. Реалізуй щонайменше п’ять конкретних команд:
   - `WriteCommand` — додає текст у кінець;
   - `DeleteCommand` — видаляє частину тексту;
   - `CopyCommand` — копіює виділений фрагмент у буфер (undo для копіювання не обов’язковий);
   - `PasteCommand` — вставляє текст із буфера у вказану позицію;
   - `ChangeCaseCommand` — змінює регістр тексту у вказаному діапазоні (з параметром `upper/lower`).

4. Створи клас `CommandHistory`:
   - Стек для збереження виконаних команд (для Undo);
   - Окремий стек для Redo (повтору скасованих команд).

5. Створи клас `EditorInvoker` (Invoker):
   - метод `executeCommand(Command cmd)` — виконує команду і додає її в історію;
   - метод `undo()` — відміняє останню команду;
   - метод `redo()` — повторює відмінену команду.

6. Створи клас `Demo` (клієнтський код):
   - продемонструй роботу з редактором: написання тексту, видалення, копіювання/вставки, зміни регістру;
   - виконай декілька команд і відмініть їх через `undo()`;
   - повтори скасовані команди через `redo()`;
   - виведи результат у консоль після кожної операції.

#### Питання для рефлексії
1. Яку перевагу дає інкапсуляція запиту в окремому об’єкті?
2. Чому Invoker не повинен знати деталей про те, як виконується команда?
3. Як реалізується Undo: через збереження знімку стану (Memento) чи через обернену операцію?
4. Як можна додати нову дію (наприклад, «замінити слово») без зміни існуючих класів?
5. У яких реальних програмах найчастіше зустрічається цей патерн (текстові редактори, графічні редактори, ігри)?

### Iterator – Послідовний обхід колекцій фільмів

#### Завдання
Реалізуй систему для перегляду колекцій фільмів у різних сервісах стрімінгу.  
Уяви, що у нас є два сервіси: `Netflix` та `Hulu`. Кожен сервіс має свій спосіб зберігання фільмів (масив, база даних тощо).  
Завдання — створити універсальний механізм обходу колекції фільмів, не розкриваючи внутрішню структуру кожного сервісу.

#### Кроки виконання

1. **Створи клас `Movie` (Element):**
   - поля: `String title`, `String genre`, `int year`;
   - конструктор та метод `toString()` для відображення інформації про фільм.

2. **Створи інтерфейс `MovieIterator` (Iterator):**
   - метод `boolean hasNext()` — перевіряє наявність наступного фільму;
   - метод `Movie getNext()` — повертає наступний фільм.

3. **Створи абстрактний клас або інтерфейс `StreamingService` (Aggregate):**
   - метод `MovieIterator createIterator(String genre)` — повертає ітератор для обходу фільмів певного жанру.

4. **Створи конкретні сервіси (ConcreteAggregate):**
   - `Netflix` та `Hulu`;
   - кожен має свій спосіб зберігання фільмів;
   - методи для отримання списку фільмів за жанром.

5. **Створи конкретні ітератори (ConcreteIterator):**
   - `NetflixIterator` та `HuluIterator`:
      - зберігають посилання на сервіс та список фільмів;
      - реалізують lazy load: фільм завантажується лише при виклику `getNext()`;
      - метод `hasNext()` перевіряє, чи є ще елементи;
      - метод `getNext()` повертає наступний фільм і підвантажує його при потребі.

6. **Створи клас `Demo` (клієнтський код):**
   - створює об’єкти `Netflix` та `Hulu`;
   - отримує ітератор через `createIterator("комедія")` або інший жанр;
   - обходить колекцію і виводить інформацію про кожний фільм у консоль.

#### Питання для рефлексії

1. Які переваги дає використання Iterator для обходу колекцій з різними структурами даних?
2. Чому клієнт не повинен знати внутрішню реалізацію зберігання фільмів?
3. У чому різниця між lazy loading та eager loading в ітераторах і коли що краще застосовувати?
4. Як додати новий сервіс стрімінгу, не змінюючи код клієнта?
5. У яких реальних програмах та системах часто використовується цей паттерн (медіа-сервіси, колекції файлів, бази даних)?

### Visitor – Операції над елементами документу

#### Завдання
Реалізуй систему для роботи з документами, яка дозволяє виконувати різні операції над елементами документу без зміни самих елементів.  
Уяви, що документ складається з різних елементів: `Text`, `Image`, `Table`.  
Завдання — реалізувати патерн Visitor, щоб додавати нові операції (наприклад, підрахунок слів, рендеринг у HTML, експорт у PDF) без зміни класів елементів.

#### Кроки виконання

1. Створи інтерфейс `DocumentElement` (Element):
   - метод `void accept(DocumentVisitor visitor)` — приймає відвідувача.

2. Створи конкретні елементи документу (ConcreteElement):
   - `Text` — поля: `String content`;
   - `Image` — поля: `String path`, `int width`, `int height`;
   - `Table` — поля: `int rows`, `int columns`;
   - кожен реалізує метод `accept(DocumentVisitor visitor)` і викликає відповідний метод у відвідувачі.

3. Створи інтерфейс `DocumentVisitor` (Visitor):
   - методи для відвідування кожного типу елементу:
      - `void visit(Text text)`;
      - `void visit(Image image)`;
      - `void visit(Table table)`.

4. Створи конкретних відвідувачів (ConcreteVisitor):
   - `WordCountVisitor` — підраховує кількість слів у тексті та таблицях;
   - `HtmlRenderVisitor` — генерує HTML-представлення документу;

5. Створи клас `Document` (ObjectStructure):
   - містить список елементів `List<DocumentElement>`;
   - метод `void accept(DocumentVisitor visitor)` обходить всі елементи та викликає `accept(visitor)` для кожного.

6. Створи клас `Demo` (клієнтський код):
   - створює документ із кількох елементів (`Text`, `Image`, `Table`);
   - створює відвідувачів (`WordCountVisitor`, `HtmlRenderVisitor`);
   - викликає `document.accept(visitor)` для кожного відвідувача;
   - виводить результати у консоль.

#### Питання для рефлексії

1. Чому патерн Visitor дозволяє додавати нові операції без зміни класів елементів?
2. Які обмеження є у Visitor (наприклад, важко додавати нові типи елементів)?
3. Як Visitor допомагає розділити логіку операцій та структуру даних?
4. У яких реальних системах часто використовується цей патерн (редактори документів, обробка AST, графи елементів)?
5. Які переваги та недоліки порівняно з простим додаванням методів у класи елементів?

### Mediator – Координація взаємодії між об’єктами

#### Завдання
Реалізуй систему чату, де користувачі можуть надсилати повідомлення один одному, але вони не взаємодіють напряму.  
Замість цього є **Посередник (Mediator)**, який керує передачею повідомлень між користувачами.  
Завдяки цьому користувачі не знають деталей один про одного, а лише взаємодіють із посередником.

#### Кроки виконання

1. Створи інтерфейс `ChatMediator` (Mediator):
   - методи:
      - `void sendMessage(String message, User sender)` — відправити повідомлення;
      - `void addUser(User user)` — додати користувача до чату.

2. Створи клас `ChatRoom` (ConcreteMediator):
   - зберігає список користувачів `List<User>`;
   - реалізує методи `sendMessage` та `addUser`;
   - при відправці повідомлення — розсилає його всім користувачам, окрім відправника.

3. Створи абстрактний клас `User` (Colleague):
   - поля: `String name`, `ChatMediator mediator`;
   - конструктор приймає `ChatMediator` і `name`;
   - методи:
      - `abstract void send(String message)` — відправити повідомлення через медіатор;
      - `abstract void receive(String message)` — отримати повідомлення.

4. Створи клас `ConcreteUser` (ConcreteColleague):
   - реалізує методи `send` та `receive`;
   - у `send` викликає `mediator.sendMessage(message, this)`;
   - у `receive` виводить повідомлення у консоль у форматі:  
     `User [name] отримав: message`.

5. Створи клас `Demo` (клієнтський код):
   - створює `ChatRoom` як медіатор;
   - створює кількох користувачів (`User user1 = new ConcreteUser(...);`);
   - додає користувачів у `ChatRoom` через `addUser`;
   - відправляє повідомлення від різних користувачів;
   - результати виводяться у консоль.


#### Питання для рефлексії

1. Чому патерн Mediator зменшує зв’язність між об’єктами?
2. У яких випадках варто використовувати Mediator, а коли краще напряму пов’язати об’єкти?
3. Які недоліки можуть з’явитися, якщо медіатор стає занадто складним (God Object)?
4. Де у реальних системах застосовується Mediator (GUI компоненти, чати, ігри)?
5. Як можна розширити систему (наприклад, зробити приватні повідомлення або історію чату)?

### Memento – Збереження і відновлення стану об’єкта

#### Завдання
Реалізуй систему текстового редактора, яка дозволяє скасовувати останні зміни (Undo).  
Для цього використай патерн **Memento**, щоб зберігати історію змін тексту без порушення інкапсуляції об’єкта.

#### Кроки виконання

1. Створи клас `TextEditor` (Originator):
   - поле: `String text`;
   - методи:
      - `void setText(String text)` — змінити текст;
      - `String getText()` — отримати поточний текст;
      - `Memento save()` — створити знімок поточного стану;
      - `void restore(Memento memento)` — відновити текст зі знімку.

2. Створи клас `Memento`:
   - приватно зберігає стан тексту (`String state`);
   - має конструктор і геттер;
   - доступ до стану має лише `TextEditor`.

3. Створи клас `History` (Caretaker):
   - зберігає список або стек знімків (`List<Memento>`);
   - методи:
      - `void saveState(Memento memento)` — додати знімок;
      - `Memento undo()` — повернути останній знімок.

4. Створи клас `Demo` (клієнтський код):
   - створює `TextEditor` і `History`;
   - змінює текст кілька разів, зберігає стан у `History`;
   - виконує кілька операцій `undo()` для відновлення попередніх версій тексту;
   - результати виводяться у консоль.


#### Питання для рефлексії

1. Чому важливо, що `Caretaker` не знає внутрішню структуру стану `Memento`?
2. Які системи у реальному житті використовують Memento (текстові редактори, ігри, IDE)?
3. У чому відмінність між збереженням усіх станів і використанням Memento лише для потрібних?
4. Які ризики можуть бути, якщо зберігати дуже багато знімків (наприклад, у пам’яті)?
5. Як можна розширити приклад (наприклад, додати Redo або зберігати кілька різних документів)?

### Template Method – Шаблонний метод

#### Завдання
Реалізуй систему приготування напоїв (наприклад, кави та чаю) за допомогою патерна **Template Method**.  
Шаблонний метод дозволяє визначити **скелет алгоритму** у базовому класі, а деталі реалізації залишити у підкласах.

#### Кроки виконання

1. Створи абстрактний клас `Beverage`:
   - метод `final void prepareRecipe()` — **шаблонний метод**, який описує послідовність кроків приготування:
      1. `boilWater()` — закип'ятити воду;
      2. `brew()` — заварити (реалізується у підкласах);
      3. `pourInCup()` — налити в чашку;
      4. `addCondiments()` — додати добавки (реалізується у підкласах).
   - абстрактні методи: `brew()`, `addCondiments()`.
   - конкретні методи: `boilWater()`, `pourInCup()` — реалізація спільна для всіх напоїв.

2. Створи клас `Tea` (підклас `Beverage`):
   - реалізує методи `brew()` та `addCondiments()` для чаю.

3. Створи клас `Coffee` (підклас `Beverage`):
   - реалізує методи `brew()` та `addCondiments()` для кави.

4. Створи клас `Demo` (клієнтський код):
   - створює об’єкти `Tea` та `Coffee`;
   - викликає метод `prepareRecipe()` для кожного напою;
   - результати виводяться у консоль, показуючи послідовність кроків приготування.

#### Питання для рефлексії

1. Чому шаблонний метод роблять `final` у базовому класі?
2. Які переваги дає виділення загальних кроків алгоритму у базовому класі?
3. У яких ситуаціях варто застосовувати Template Method у реальному житті (наприклад, при підготовці звітів, обробці даних, ігрові алгоритми)?
4. Чи можна використовувати Hook-методи для додаткової гнучкості? Як це зробити?
5. Які ризики виникають, якщо підкласи змінюють порядок кроків алгоритму?

---

</details>
## 🏛 Архітектурні патерни
<details>
  <summary>Розгорнути розділ</summary>

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
