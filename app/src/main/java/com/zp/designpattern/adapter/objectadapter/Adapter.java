package com.zp.designpattern.adapter.objectadapter;

/**
 * Created by ghw on 16/6/24.
 */
public class Adapter implements Targetable {

    Source source = null;
    public Adapter(){
        source = new Source();
    }

    @Override
    public void method1(){
        if(source != null){
            source.method1();
        }
    }

    @Override
    public void method2() {
        System.out.println("Testing adapter...source method2...");
    }
}
