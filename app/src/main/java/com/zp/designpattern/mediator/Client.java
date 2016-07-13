package com.zp.designpattern.mediator;

/**
 * Created by ghw on 16/7/1.
 */
public class Client {

    public static void main(String[] args){
        Mediator mediator = new ConcreteMediator();

        mediator.workAll();
    }
}
