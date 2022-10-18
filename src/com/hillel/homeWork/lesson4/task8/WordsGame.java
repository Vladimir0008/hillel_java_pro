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
        Boolean isGuessed = false; //Variable for exit from loop
        char[] guessedLetters = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};

        //We start an endless loop until the word is guessed.
        //Define a word that is shorter so as not to go beyond the nested loop
        while (!isGuessed) {
            String inputWord = scanner.nextLine();
            int count = 0;
            if (randomWord.length() >= inputWord.length()) {
                count = inputWord.length();
            } else {
                count = randomWord.length();
            }

            //Loop for comparing the entered word with the guessed one and writing the guessed letters
            for (int i = 0; i < count; i++) {
                if (inputWord.toCharArray()[i] == randomWord.toCharArray()[i]) {
                    guessedLetters[i] = inputWord.toCharArray()[i];
                }
            }

            //Check the guessed letters. In case, if the word is guessed we finish the loop and congratulate the winner)
            if (inputWord.equals(randomWord)) {
                System.out.println("Поздравляю, Вы угадали слово! Это слово - " + randomWord);
                isGuessed = true; //Assign to a variable isGuessed value for exit from the loop. There is the end of our program
            } else {
                System.out.println("Угаданные буквы:");
                System.out.println(Arrays.toString(guessedLetters));
            }
        }
    }
}
