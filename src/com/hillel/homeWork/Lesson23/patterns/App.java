package com.hillel.homeWork.Lesson23.patterns;

import com.hillel.homeWork.Lesson23.patterns.decorator.DeadRussianDecorator;
import com.hillel.homeWork.Lesson23.patterns.decorator.LavrovHorseDecorator;
import com.hillel.homeWork.Lesson23.patterns.decorator.Text;
import com.hillel.homeWork.Lesson23.patterns.decorator.TextEditor;

public class App {
    public static void main(String[] args) {

        TextEditor textEditor =
                new DeadRussianDecorator(
                        new LavrovHorseDecorator(
                                new Text()));

        String test = textEditor.edit("Хороший русский Лавров test");

        System.out.println(test);

    }
}
