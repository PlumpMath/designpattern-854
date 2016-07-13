package com.zp.designpattern.bridge;

/**
 * Created by ghw on 16/6/27.
 */
public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("Testing bridge....bus is runing...");
    }
}
