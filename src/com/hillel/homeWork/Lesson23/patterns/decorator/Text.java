package com.hillel.homeWork.Lesson23.patterns.decorator;

public class Text implements TextEditor {

    @Override
    public String edit(String stringSource) {
        return stringSource;
    }
}
