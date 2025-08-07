package org.com.preparingOOD.factorymethod;

import org.com.preparingOOD.factorymethod.concretecreater.CoinFactory;
import org.com.preparingOOD.factorymethod.product.Coin;
import org.com.preparingOOD.factorymethod.product.CoinType;

/**
 * 1. Створи інтерфейс `Coin`
 * 2. Створи реалізації:
 *     - `Penny`, `Nickel`, `Dime`, `Quarter`
 * 3. Створи `CoinFactory`, яка приймає номінал і повертає відповідну монету
 * 4. Клієнт не повинен знати, який клас створюється
 * 5. Це дозволяє легко додавати нові монети
 *
 * **Питання для рефлексії:**
 * 1. У чому перевага Factory над прямим викликом `new`?
 *    Пеперше це велика гнучкість коду , ми можемо його розширювати не змінючи бага-то реалізацій інших класів , але леше змінючий код в 1 методі фарики.
 *    По друге поліморфізм у всій красі , коли ми отримауємо потрібний нам обект лише передаючи 1 аргумент.
 *    Ми контролюємо велику кількість entity лише у 1-му клссі і вся логіка створення знаходиться лише у 1-му класі.
 * 2. Як виглядає UML-структура цього патерну?
 * 3. Чи легко масштабувати таку фабрику?
 *    В цілом легко , ми приймаемо як аргумент тип інтерфейсу , що дає нам змогу створити новий клас просто який буде імплементувати цей інтерфейс. і додати трошки коду у фабрику.
 *    Також ми Можемо створювати нові фабрики збираючи нову логіку там.
 * 4. Коли Factory Method не варто використовувати?
 *    Напевно тоді коли не великйи шанс роширення цього кількості сущностей лімітована, та нам не потрібна вся логіка лише у 1 фабриці. та Коли ієрархія класів стає занадто глибокою.
**/
public class App {

    public static void main(String[] args) {
        CoinFactory cf = new CoinFactory();

       Coin coin1 = cf.getCoin(CoinType.QUARTER);
       Coin coin2 = cf.getCoin(CoinType.DIME);
       Coin coin3 = cf.getCoin(CoinType.NICKEL);
       Coin coin4 = cf.getCoin(CoinType.PENNY);

        System.out.println(coin1.coinDenomination());
        System.out.println(coin2.coinDenomination());
        System.out.println(coin3.coinDenomination());
        System.out.println(coin4.coinDenomination());
    }
}
