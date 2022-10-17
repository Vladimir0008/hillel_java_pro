package com.hillel.homeWork.lesson4.task7_Primitive_and_reference;

/**
 * 1. ������� ������ ������ � IntelliJ IDEA, ������� ����� HomeWorkApp, � ��������� � ��� ����� main().
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
     * 2.�������� ����� printThreeWords(),
     * ������� ��� ������ ������ ���������� � ������� ��� �����: Orange, Banana, Apple.
     */

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    /**
     * 3. �������� ����� checkSumSign(), � ���� �������� �������� ��� int ���������� a � b,
     * � ��������������� �� ������ ����������, �������� ��������.
     * ����� ����� ������ �������������� ��� ����������, � ���� �� ����� ������ ��� ����� 0,
     * �� ������� � ������� ��������� ������ ��������������, � ��������� ������ - ������ ��������������;
     */

    public static void checkSumSign() {
        int a = 1;
        int b = 2;
        int result = a + b;
        if (result >= 0) {
            System.out.println("����� �������������");
        } else {
            System.out.println("����� �������������");
        }
    }

    /**
     * 4. �������� ����� printColor() � ���� �������� ������� int ���������� value � ��������������� �� ����� ���������.
     * ���� value ������ 0 (0 ������������), �� � ������� ����� ������ ������� ��������� ��������,
     * ���� ����� � �������� �� 0 (0 �������������) �� 100 (100 ������������),
     * �� �������, ���� ������ 100 (100 �������������) - ��������;
     */

    public static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("��������");
        } else if (value > 0 && value <= 100) {
            System.out.println("������");
        } else {
            System.out.println("�������");
        }
    }

    /**
     * 5. �������� ����� compareNumbers(), � ���� �������� �������� ��� int ���������� a � b,
     * � ��������������� �� ������ ����������, �������� ��������. ���� a ������ ��� ����� b,
     * �� ���������� ������� � ������� ��������� �a >= b�, � ��������� ������ �a < b�;
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
     * 6. �������� �����, ����������� �� ���� ��� ����� ����� � �����������,
     * ��� �� ����� ����� � �������� �� 10 �� 20 (������������),
     * ���� �� � ������� true, � ��������� ������ � false.
     */

    public static Boolean checkingNumInterval(int a) {
        return (a >= 10 && a <= 20);
    }

    /**
     * 7. �������� �����, �������� � �������� ��������� ���������� ����� �����, ����� ������ ���������� � �������,
     * ������������� �� ����� �������� ��� �������������. ���������: ���� ������� ������������� ������.
     */

    public static void positiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("����� �������� �������������");
        } else {
            System.out.println("����� �������� �������������");
        }
    }

    /**
     * 8. �������� �����, �������� � �������� ��������� ���������� ����� �����.
     * ����� ������ ������� true, ���� ����� �������������, � ������� false ���� �������������.
     */

    public static Boolean isNegative(int a) {
        return (a < 0);
    }

    /**
     * 9. �������� �����, �������� � �������� ���������� ���������� ������ � �����,
     * ����� ������ ���������� � ������� ��������� ������, ��������� ���������� ���;
     */

    public static void stringPrinter(String string, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(string);
        }
    }

    /**
     * 10. * �������� �����, ������� ����������, �������� �� ��� ����������, � ���������� boolean (���������� - true,
     * �� ���������� - false). ������ 4-� ��� �������� ����������, ����� ������� 100-��,
     * ��� ���� ������ 400-� � ����������.
     */
    public static Boolean isLeap(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));

    }
}
