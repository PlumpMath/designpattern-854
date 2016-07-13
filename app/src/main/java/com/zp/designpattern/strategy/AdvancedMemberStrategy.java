package com.zp.designpattern.strategy;

/**
 * Created by ghw on 16/6/30.
 */
public class AdvancedMemberStrategy implements MemberStrategy {
    @Override
    public double calPrice(double bookPrice) {
        System.out.println("Testing strategy...advanced member strategy...price:"+bookPrice*0.8);
        return bookPrice*0.8;
    }
}
