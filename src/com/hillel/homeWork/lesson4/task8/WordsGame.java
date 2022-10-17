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
        System.out.println("Компьютер загадал слово, попробуй отгадать его!");
        Boolean isGuessed = false; //Переменная для выгода из цыкла
        char[] guessedLetters = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};

        //Запускаем бесконечный цикл до тех пор пока слово не будет отгадано.
        //Определяем слово, которое короче, чтобы не выйти за рамки вложенного цикла
        while (!isGuessed) {
            String inputWord = scanner.nextLine();
            int count = 0;
            if (randomWord.length() >= inputWord.length()) {
                count = inputWord.length();
            } else {
                count = randomWord.length();
            }

            //Цикл для сравнения введенного слова с загаданным и записи угаданных букв
            for (int i = 0; i < count; i++) {
                if (inputWord.toCharArray()[i] == randomWord.toCharArray()[i]) {
                    guessedLetters[i] = inputWord.toCharArray()[i];
                }
            }

            //Проверяем угаданные буквы. В случае, еси слово угаданное, то выходим из цикла и поздравляем победителя)
            if (inputWord.equals(randomWord)) {
                isGuessed = true;
                System.out.println("Поздравляю, Вы угадали слово! Это слово - " + randomWord);
            } else {
                System.out.println("Угаданные буквы:");
                System.out.println(Arrays.toString(guessedLetters));
            }
        }
    }
}
