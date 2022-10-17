package com.hillel.homeWork.lesson4.task8;

/**
 * 1. Создать пустой проект в IntelliJ
 */
public class StringIntro {
    public static void main(String[] args) {

        System.out.println(findSymbolOccurrence("maman", 'n'));
        System.out.println(findWordPosition("apple", "pf"));
        System.out.println(stringReverse("mama"));
        System.out.println(isPalindrome("nagan"));
    }

    /**
     * 2. Создать метод findSymbolOccurance. Метод принимает в качестве параметров строку и символ.
     * Необходимо вычислить, сколько раз символ встречается в переданной строке и вернуть это числовое значение.
     */

    public static int findSymbolOccurrence(String string, char ch) {
        int result = 0;
        char[] charArray = string.toCharArray();
        for (char c : charArray) {
            if (c == ch) {
                result++;
            }
        }
        return result;
    }

    /**
     * 3. Создать метод findWordPosition. Метод принимает в качестве параметров две строки (source, target).
     * Необходимо выяснить, является ли target (подстрока) частью строки source.
     * Если да, тогда вернуть номер позиции (индекс) первого элемента подстроки в строке, иначе вернуть -1.
     */

    public static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    /**
     * 4. Создать метод stringReverse. Метод принимает в качестве параметра строку.
     * Необходимо ее развернуть и вернуть измененный вариант.
     */

    public static String stringReverse(String string) {
        char[] chars = string.toCharArray();
        String res = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            res = res + chars[i];
        }
        return res;
    }

    /**
     * 5. Создать метод isPalindrome. Метод принимает в качестве параметра строку.
     * Необходимо Проверить является ли переданная строка палиндромом. Если да, тогда вернут true, иначе false.
     */

    public static Boolean isPalindrome(String string) {
        String reverseString = stringReverse(string);
        return reverseString.equals(string);
    }
}
