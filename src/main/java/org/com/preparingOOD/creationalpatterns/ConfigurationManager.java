package org.com.preparingOOD.creationalpatterns;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Реалізуй клас `ConfigurationManager`, який:
 * 2. Зберігає конфіг-параметри в `Map<String, String>`
 * 3. Дозволяє зчитувати та змінювати параметри
 * 4. Повинен мати лише один екземпляр (Singleton) у всій програмі
 * 5. Гарантує централізовану конфігурацію, що не дублюється
 *
 * **Питання для рефлексії:**
 * 1. Коли в реальних програмах використовується Singleton?
 * Ми 2 ключові причини такого використання , коли нам потібно тільки 1 еклземляр классу,щоб не було дублікатів які моглиби спотворити функціонал классу.
 * 2 Коли нам потрібна глобална точка доступу для класу у всьому додатку.
 * 2. Чи має цей підхід мінуси у тестуванні або багатопоточності?
 * Так такий класс дуже важко тестувати через те що ми маємо лише можливість створити 1 екземляр у програмі , і це неуможливлю створення умовной заглушки для тестування .
 * також це створює проблему якщо ми будемо змінювати стан обєкту під час тестування його стан буде змінюватися у всіх тестах .
 * 3. Чим він краще за static-методи?
 *      Поперше що він може зберігати стан , може зберегати у собі якусь інформацію
 *      Подруге , що він створюється тоді коли він дійсно потрібний
 *      По трете , що в ньому ми можемо використовувати принципи ооп як приклад поліморфізм ,ми можемо виконати потрібні інтерфейси .
 * 4. Яка UML-структура цього патерну?
 * 5. У яких ситуаціях Singleton може нашкодити?
 *    По перше якщо використовувати не потокахищений варіант ми можемо спотворити інформацію , або створити 2 різні обекти на двух різних потоках.
 *    По друге с використання потокозахищености ми платимо часом на використання цього клссу.
 *    По третє напевно це проблема тестування таких класів.
 *
 *    // Проблеми з серіалізацією та клонуванням потрібно більше з цим ознайомитись !!!
**/
//we have 2 ways to implements that lazy and eager
// we write lazy version and we have 3 different ways to implements this part.
public class ConfigurationManager {
    private static volatile ConfigurationManager instance;
    private Map<String , String> configMap;

    private ConfigurationManager() {
        configMap = new HashMap<String , String>();
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }

    public void setParameter(String key, String value) {
        configMap.put(key, value);
    }

    public String getParameter(String key) {
        return configMap.get(key);
    }


}
