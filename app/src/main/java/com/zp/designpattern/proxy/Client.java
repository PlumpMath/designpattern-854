package com.zp.designpattern.proxy;

/**
 * Created by ghw on 16/6/27.
 */
//个人理解：与装饰者模式的区别是：代理模式可以隐藏被代理类的调用，装饰者只是在被装饰者上添加一些功能，不会屏蔽对被装饰者的调用
public class Client {
    public static void main(String[] args){
        Proxy proxy = new Proxy(new Source());
        proxy.method1();
    }
}
