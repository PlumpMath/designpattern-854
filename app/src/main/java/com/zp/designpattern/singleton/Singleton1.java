package com.zp.designpattern.singleton;

/**
 * Created by ghw on 16/6/22.
 */
public class Singleton1 {

    private Singleton1(){}

    private static Singleton1 singleton1 = null;

    public static Singleton1 getInstance(){
        return initSingleton1();
    }

    public static synchronized Singleton1 initSingleton1(){
        if(singleton1 == null){
            singleton1 = new Singleton1();
        }

        return singleton1;
    }
}
