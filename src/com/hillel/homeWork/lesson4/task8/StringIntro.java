package com.hillel.homeWork.lesson4.task8;

/**
 * 1. ������� ������ ������ � IntelliJ
 */
public class StringIntro {
    public static void main(String[] args) {

        System.out.println(findSymbolOccurrence("maman", 'n'));
        System.out.println(findWordPosition("apple", "pf"));
        System.out.println(stringReverse("mama"));
        System.out.println(isPalindrome("nagan"));
    }

    /**
     * 2. ������� ����� findSymbolOccurance. ����� ��������� � �������� ���������� ������ � ������.
     * ���������� ���������, ������� ��� ������ ����������� � ���������� ������ � ������� ��� �������� ��������.
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
     * 3. ������� ����� findWordPosition. ����� ��������� � �������� ���������� ��� ������ (source, target).
     * ���������� ��������, �������� �� target (���������) ������ ������ source.
     * ���� ��, ����� ������� ����� ������� (������) ������� �������� ��������� � ������, ����� ������� -1.
     */

    public static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    /**
     * 4. ������� ����� stringReverse. ����� ��������� � �������� ��������� ������.
     * ���������� �� ���������� � ������� ���������� �������.
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
     * 5. ������� ����� isPalindrome. ����� ��������� � �������� ��������� ������.
     * ���������� ��������� �������� �� ���������� ������ �����������. ���� ��, ����� ������ true, ����� false.
     */

    public static Boolean isPalindrome(String string) {
        String reverseString = stringReverse(string);
        return reverseString.equals(string);
    }
}
