package com.zp.designpattern.factory.simplefactory;

/**
 * Created by ghw on 16/6/21.
 */
public class SMSSender implements Sender {
    @Override
    public void send(){
        System.out.println("Testing SimpleFactory...this is SMSSender");
    }
}
