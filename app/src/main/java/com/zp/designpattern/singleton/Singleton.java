package com.zp.designpattern.singleton;

/**
 * Created by ghw on 16/6/22.
 */
public class Singleton {

    /* 私有构造方法，防止被实例化 */
    private Singleton(){};

    private static class SingletonFactory{
        private static Singleton singleton = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonFactory.singleton;
    }
}
