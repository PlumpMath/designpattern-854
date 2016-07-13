package com.zp.designpattern.interpreter;

/**
 * Created by ghw on 16/7/13.
 */
public class Context {

    private int int1;
    private int int2;

    public Context(int int1, int int2){
        this.int1 = int1;
        this.int2 = int2;
    }

    public int getInt1() {
        return int1;
    }

    public int getInt2() {
        return int2;
    }

}
