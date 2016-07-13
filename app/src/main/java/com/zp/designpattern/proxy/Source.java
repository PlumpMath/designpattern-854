package com.zp.designpattern.proxy;

/**
 * Created by ghw on 16/6/27.
 */
public class Source implements Sourceable {
    @Override
    public void method1() {
        System.out.println("---Testing proxy design pattern...Source...---");
    }
}
