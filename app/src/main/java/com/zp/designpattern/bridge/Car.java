package com.zp.designpattern.bridge;

/**
 * Created by ghw on 16/6/27.
 */
public class Car implements Vehicle{

    @Override
    public void run(){
        System.out.println("Testing bridge....car is runing...");
    }
}
