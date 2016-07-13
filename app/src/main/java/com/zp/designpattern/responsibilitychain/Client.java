package com.zp.designpattern.responsibilitychain;

/**
 * Created by ghw on 16/7/10.
 */

/**
 * http://www.cnblogs.com/maowang1991/archive/2013/04/15/3023236.html
 */

public class Client {

    public static void main(String[] args){
        Handler myHandler1 = new MyHandler("H1");
        Handler myHandler2 = new MyHandler("H2");
        Handler myHandler3 = new MyHandler("H3");

        myHandler1.setHandler(myHandler2);
        myHandler2.setHandler(myHandler3);

        myHandler1.operate();
    }
}
