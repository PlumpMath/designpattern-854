package com.zp.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ghw on 16/7/6.
 */
public class ConcreteSubject implements Subject {

    private List<Observer> list = new ArrayList<>();

    private float temperature;

    @Override
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (list.contains(observer)){
            list.remove(observer);
        }
    }

    @Override
    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObserver();
    }

    @Override
    public void notifyObserver() {
        for (Observer observer:list) {
            observer.update(this.temperature);
        }
    }
}
