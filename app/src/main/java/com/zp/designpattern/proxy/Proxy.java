package com.zp.designpattern.proxy;

/**
 * Created by ghw on 16/6/27.
 */
public class Proxy implements Sourceable {
    public Source source;

    public Proxy(Source source){
        this.source = source;
    }

    @Override
    public void method1(){
        System.out.println("---before...---");
        if(source != null){
            source.method1();
        }
        System.out.println("---after...---");
    }
}
