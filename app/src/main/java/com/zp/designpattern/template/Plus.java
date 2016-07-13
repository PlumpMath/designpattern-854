package com.zp.designpattern.template;

/**
 * Created by ghw on 16/6/30.
 */
public class Plus extends AbstractCalculator {
    @Override
    public int calculate(int num1, int num2) {
        return num1+num2;
    }
}
