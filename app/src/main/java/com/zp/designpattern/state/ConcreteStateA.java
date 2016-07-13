package com.zp.designpattern.state;

/**
 * Created by ghw on 16/7/10.
 */
public class ConcreteStateA implements State {
    @Override
    public void handle() {
        System.out.println("---Testing state pattern, this is concrete stateA---");
    }
}
