package com.zp.designpattern.adapter.classadapter;

/**
 * Created by ghw on 16/6/24.
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method1(){
        super.method1();
    }

    @Override
    public void method2() {
        System.out.println("Testing adapter...source method2...");
    }
}
