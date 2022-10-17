package com.hillel.homeWork.lesson4.task8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class WordsGame {
    public static void main(String[] args) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String randomWord = words[random.nextInt(words.length)];
        System.out.println("��������� ������� �����, �������� �������� ���!");
        Boolean isGuessed = false; //���������� ��� ������ �� �����
        char[] guessedLetters = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};

        //��������� ����������� ���� �� ��� ��� ���� ����� �� ����� ��������.
        //���������� �����, ������� ������, ����� �� ����� �� ����� ���������� �����
        while (!isGuessed) {
            String inputWord = scanner.nextLine();
            int count = 0;
            if (randomWord.length() >= inputWord.length()) {
                count = inputWord.length();
            } else {
                count = randomWord.length();
            }

            //���� ��� ��������� ���������� ����� � ���������� � ������ ��������� ����
            for (int i = 0; i < count; i++) {
                if (inputWord.toCharArray()[i] == randomWord.toCharArray()[i]) {
                    guessedLetters[i] = inputWord.toCharArray()[i];
                }
            }

            //��������� ��������� �����. � ������, ��� ����� ���������, �� ������� �� ����� � ����������� ����������)
            if (inputWord.equals(randomWord)) {
                isGuessed = true;
                System.out.println("����������, �� ������� �����! ��� ����� - " + randomWord);
            } else {
                System.out.println("��������� �����:");
                System.out.println(Arrays.toString(guessedLetters));
            }
        }
    }
}
