package com.zp.designpattern.state;

/**
 * Created by ghw on 16/7/10.
 */
public class ConcreteStateB implements State {
    @Override
    public void handle() {
        System.out.println("---Testing state pattern, this is concrete stateB---");
    }
}
