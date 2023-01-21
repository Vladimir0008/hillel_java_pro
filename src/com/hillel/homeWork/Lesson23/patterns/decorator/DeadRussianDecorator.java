package com.hillel.homeWork.Lesson23.patterns.decorator;

public class DeadRussianDecorator extends TextDecorator {


    public DeadRussianDecorator(TextEditor textEditor) {
        super(textEditor);
    }

    public String edit(String sourceText) {
        return super.edit(sourceText.replaceFirst("Хороший русский", "Мертвый русский"));
    }
}
