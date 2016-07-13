package com.zp.designpattern.observer;

/**
 * Created by ghw on 16/7/6.
 */
public interface Subject {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void setTemperature(float temperature);
    public void notifyObserver();
}
