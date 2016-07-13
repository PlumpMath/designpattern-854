package com.zp.designpattern.adapter.interfaceadapter;

/**
 * Created by ghw on 16/6/24.
 */
public class Client {
    public static void main(String[] args){
        Sourceable sourceable1 = new SourceSub1();
        sourceable1.method1();
        sourceable1.method2();

        Sourceable sourceable2 = new SourceSub2();
        sourceable2.method1();
        sourceable2.method2();

    }
}
