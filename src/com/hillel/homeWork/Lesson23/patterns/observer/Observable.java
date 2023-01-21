package com.hillel.homeWork.Lesson23.patterns.observer;

public interface Observable {

    void add(Observer observer);

    void remove(Observer observer);

    void notifyObservers();

}
