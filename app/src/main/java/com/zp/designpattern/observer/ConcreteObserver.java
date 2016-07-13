package com.zp.designpattern.observer;

/**
 * Created by ghw on 16/7/6.
 */

/**
 * http://www.cnblogs.com/itTeacher/archive/2012/12/03/2800129.html
 * 观察者模式定义了对象间的一种一对多依赖关系，使得每当一个对象改变状态，则所有依赖于它的对象都会得到通知并被自动更新。
 它将观察者和被观察者的对象分离开。提高了应用程序的可维护性和重用性。
 实现观察者模式有很多形式，一种是“注册---通知---撤销注册”的形式。
 观察者Observer：所有潜在的观察者必须实现观察者接口，这个接口只有update方法，当主题改变时，它被调用。
 具体观察者ConcreteObserver: 具体观察者可以是任何实现了Observer接口的类。观察者必须注册具体主题，一边接收更新。
 可观察者Subject: 主题接口，即可观察者Observable，对象使用此接口注册为观察者，或者把自己从观察者中删除，每个主题可以有多个观察者。
 具体可观察者ConcreteSubject: 一个具体主题实现了主题接口，除了注册和撤销之外，具体主题还实现了notifyObservers()方法，
 这个方法用来在主题状态改变时更新所有观察者。具体主题也可能有设置和获取状态的方法。
 */
public class ConcreteObserver implements Observer {

    private float temperature;

    public ConcreteObserver(float temperature){
        this.temperature = temperature;
    }

    @Override
    public void update(float temperature) {
        System.out.println("---Testing observer, observer is updated...temperature:"+temperature+"---");
        this.temperature = temperature;
    }

}
