package com.hillel.homeWork.Lesson23.patterns.decorator;

public abstract class TextDecorator implements TextEditor {

    private final TextEditor textEditor;

    protected TextDecorator(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public String edit(String sourceText) {
        return textEditor.edit(sourceText);
    }


}
