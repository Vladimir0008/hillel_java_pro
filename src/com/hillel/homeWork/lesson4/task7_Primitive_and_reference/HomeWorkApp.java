package com.hillel.homeWork.lesson4.task7_Primitive_and_reference;

/**
 * 1. Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().
 */

public class HomeWorkApp {
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(checkingNumInterval(9));
        positiveOrNegative(0);
        System.out.println(isNegative(-10));
        stringPrinter("aaa", 2);
        System.out.println(isLeap(2000));
    }

    /**
     * 2.Создайте метод printThreeWords(),
     * который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
     */

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    /**
     * 3. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b,
     * и инициализируйте их любыми значениями, которыми захотите.
     * Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
     * то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
     */

    public static void checkSumSign() {
        int a = 1;
        int b = 2;
        int result = a + b;
        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    /**
     * 4. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
     * Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
     * если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно),
     * то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;
     */

    public static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Крассный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    /**
     * 5. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
     * и инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b,
     * то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
     */

    public static void compareNumbers() {
        int a =100;
        int b = 101;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    /**
     * 6. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно),
     * если да – вернуть true, в противном случае – false.
     */

    public static Boolean checkingNumInterval(int a) {
        return (a >= 10 && a <= 20);
    }

    /**
     * 7. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
     * положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     */

    public static void positiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Число является положительным");
        } else {
            System.out.println("Число является отрицательным");
        }
    }

    /**
     * 8. Написать метод, которому в качестве параметра передается целое число.
     * Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
     */

    public static Boolean isNegative(int a) {
        return (a < 0);
    }

    /**
     * 9. Написать метод, которому в качестве аргументов передается строка и число,
     * метод должен отпечатать в консоль указанную строку, указанное количество раз;
     */

    public static void stringPrinter(String string, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(string);
        }
    }

    /**
     * 10. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
     * не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го,
     * при этом каждый 400-й – високосный.
     */
    public static Boolean isLeap(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));

    }
}
