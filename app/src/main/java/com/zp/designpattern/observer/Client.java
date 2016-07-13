package com.zp.designpattern.observer;

/**
 * Created by ghw on 16/7/6.
 */
public class Client {

    public static void main(String[] args){
        Observer concreteObserver = new ConcreteObserver(10.0f);

        Subject concreteSubject = new ConcreteSubject();
        concreteSubject.addObserver(concreteObserver);

        concreteSubject.setTemperature(20.0f);
        concreteSubject.setTemperature(30.0f);

    }
}
