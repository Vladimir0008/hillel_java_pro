package com.hillel.homeWork.lesson10.task13.task13_lists;

public class WordOccurrence {
    private String name;
    private int occurrenceCount;

    public WordOccurrence(String name, int occurrenceCount) {
        this.name = name;
        this.occurrenceCount = occurrenceCount;
    }

    @Override
    public String toString() {
        return "\n{" +
                "name='" + name + '\'' +
                ", occurrenceCount=" + occurrenceCount +
                "}";
    }
}
