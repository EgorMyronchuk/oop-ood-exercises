package org.com.preparingOOD.behavioralpatterns;

/**
 * 1. Створи інтерфейс `VendingMachineState` з методами:
 * - `insertCoin()`
 * - `selectItem()`
 * 2. Створи класи станів:
 * - `IdleState` – очікує монету
 * - `HasMoneyState` – очікує вибір товару
 * - `DispensingState` – видає товар
 * 3. Клас `VendingMachine` тримає поточний стан і делегує виклики
 * 4. Поведінка змінюється залежно від стану (без if-else)
 *
 * **Питання для рефлексії:**
 * 1. Чим State відрізняється від Strategy?
 *   Головна різниця між ними що стан нашого контексту у стайте змінюється у середені контексту та стайтів , є певний рівень інкапсуліцяї ,
 *   а от у патерні Strategy зміни регулюються з ззвоні.
 * 2. Як виглядає UML-подання цього патерну?
 * 3. Коли цей патерн буде надто складним?
 *    Напевно тоді коли станів може бути бага-то і ми створемо велику павутину яка буде майже не читабельна
 *    , коли буде роширення станів і це потрібно буде хендлити багато де .
 *
 * 4. Чи можна було реалізувати це через switch або enum?
 *      Можно реалізвати,але це значено зменшить цитабельність нашого коду , та майже знищить зручність ооп що черевато можливими помилками.
 **/



public class StatePatern {
    public interface VendingMachineState {
        public void insertCoin(VendingMachine vm);

        public void selectItem(VendingMachine vm);
    }

    public static class IdleState implements VendingMachineState {
        @Override
        public void insertCoin(VendingMachine vm) {
            System.out.println("Починаю приймати копійки");
            vm.setState(new HasMoneyState());
        }

        @Override
        public void selectItem(VendingMachine vm) {
            System.out.println("Починаю видавати вам покупку");
            vm.setState(new DispensingState());
        }
    }

    public static class HasMoneyState implements VendingMachineState {
        @Override
        public void insertCoin(VendingMachine vm) {
            System.out.println("Вже приймаю гроші");;
        }

        @Override
        public void selectItem(VendingMachine vm) {
            System.out.println("Переходжу на видачу предмету");
            vm.setState(new DispensingState());
        }
    }

    public static class DispensingState implements VendingMachineState {
        @Override
        public void insertCoin(VendingMachine vm) {
            System.out.println("Перехожу на оплату");
            vm.setState(new HasMoneyState());
        }

        @Override
        public void selectItem(VendingMachine vm) {
            System.out.println("Вже видаю вам покупку");
        }
    }

    public static class VendingMachine {
        private VendingMachineState state;

        public VendingMachine(VendingMachineState state) {
            this.state = new IdleState();
        }

        public void setState(VendingMachineState state) {
            this.state = state;
        }

        public void insertCoin() {
            state.insertCoin(this);
        }

        public void selectItem() {
            state.selectItem(this);
        }

    }

    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine(new IdleState());

        vm.insertCoin();
        vm.insertCoin();
        vm.selectItem();
        vm.selectItem();
        vm.insertCoin();
        vm.insertCoin();
        vm.selectItem();


    }
}

