package com.hillel.homeWork.Lesson23.patterns.decorator;

public class LavrovHorseDecorator extends TextDecorator {

    public LavrovHorseDecorator(TextEditor textEditor) {
        super(textEditor);
    }

    @Override
    public String edit(String sourceText) {
        return super.edit(sourceText.replaceAll("Лавров", "Коняка"));
    }
}
