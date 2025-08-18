package org.com.preparingOOD.behavioralpatterns.strategypattern;

/**
 * 1. Реалізуй інтерфейс `FareStrategy`
 * 2. Створи реалізації:
 *     - `BaseFareStrategy` – базовий тариф: 10₴/год
 *     - `WeekendFareStrategy` – у вихідні: 15₴/год
 * 3. Реалізуй клас `FareCalculator`, який приймає стратегію та рахує ціну
 * 4. Дозволь змінювати стратегію "на льоту"
 * 5. Патерн дозволяє змінювати логіку, не змінюючи сам калькулятор
 *
 * **Питання для рефлексії:**
 * 1. Чому Strategy краще, ніж if-else у класі?
 * Він не спотрворює читабельність коду великою кількістью перевірок і якщо нам порібна нова стратегія нам не потрібно додавти
 * if яким можно булоб зламати код , а ми можемо створити новий клас який імплементує інтерфейс і ми передамо його новою старетиією.
 * 2. Як би ти додав нову стратегію?
 *    Створив новий класс який імплеменує інтерфейм та переписав там метод інтерфейсу.
 * 3. Яка UML-структура Strategy?
 * 4. Коли цей патерн – зайве ускладнення?
 *    Нпавено тоді коли ми знаємо що у нас може бути лише 1 стратегія , або тоді коли її напевно не більше двох і ми точно знаеє що ця кількість не збілшиться.
 *
**/

public class StrategyPatern {

    public interface FareStrategy {
        public int calculateFinalFare (int hour);
    }
    static public class BaseFareStrategy implements FareStrategy {

        @Override
        public int calculateFinalFare(int hour) {
            return hour * 10;
        }
    }

    static public class WeekendFareStrategy implements FareStrategy {

        @Override
        public int calculateFinalFare(int hour) {
            return hour * 15;
        }
    }

    static public class FareCalculator {
        public FareStrategy fareStrategy ;

        public FareCalculator(FareStrategy fareStrategy) {
            this.fareStrategy = fareStrategy;
        }

        public void setStrategy(FareStrategy fareStrategy) {
            this.fareStrategy = fareStrategy;
        }

        public int calculateFinalFare(int hours) {
            return fareStrategy.calculateFinalFare(hours);
        }
    }

    public static void main(String[] args) {
        FareStrategy baseFareStrategy = new BaseFareStrategy();
        FareStrategy weekendFareStrategy = new WeekendFareStrategy();

        FareCalculator fareCalculator = new FareCalculator(baseFareStrategy);

        fareCalculator.calculateFinalFare(12);
        System.out.println(fareCalculator.calculateFinalFare(12));
        fareCalculator.setStrategy(weekendFareStrategy);
        fareCalculator.calculateFinalFare(12);
        System.out.println(fareCalculator.calculateFinalFare(12));
    }
}
