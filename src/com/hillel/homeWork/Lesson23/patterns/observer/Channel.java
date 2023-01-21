package com.hillel.homeWork.Lesson23.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Observable {

    private final List<Observer> observers;
    private final  List<Video> videoList;

    public Channel(List<Observer> observers, List<Video> videoList) {
        this.videoList = new ArrayList<>();
        this.observers = new ArrayList<>();
    }


    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    public void addVideo (Video video) {}
}
