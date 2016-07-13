package com.zp.designpattern.interpreter;

/**
 * Created by ghw on 16/7/13.
 */
public class Minus implements Expression{
    @Override
    public int interpre(Context context) {
        return context.getInt1() - context.getInt2();
    }
}
