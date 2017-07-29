package com.example.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ko-aoki on 2017/07/24.
 */
public abstract class NumberGenerator {

    private List<Observer> observers = new ArrayList();

    public void addObserver(Observer observer) {

        this.observers.add(observer);
    }

    public void deleteObserver(Observer observer) {

        this.observers.remove(observer);
    }

    public void notifyObservers() {

        this.observers.stream().forEach(o -> o.update(this));
    }

    public abstract int getNumber();

    public abstract void execute();
}
