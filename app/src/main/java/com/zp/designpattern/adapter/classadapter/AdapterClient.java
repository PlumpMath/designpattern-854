package com.zp.designpattern.adapter.classadapter;

/**
 * Created by ghw on 16/6/24.
 */

/**
 * http://www.cnblogs.com/maowang1991/archive/2013/04/15/3023236.html
 */
public class AdapterClient {
    public static void main(String[] args){
        Targetable adapter = new Adapter();
        adapter.method1();
        adapter.method2();
    }
}
