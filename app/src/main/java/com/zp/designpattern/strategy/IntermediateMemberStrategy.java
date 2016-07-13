package com.zp.designpattern.strategy;

/**
 * Created by ghw on 16/6/30.
 */
public class IntermediateMemberStrategy implements MemberStrategy {
    @Override
    public double calPrice(double bookPrice) {
        System.out.println("Testing strategy...Intermediate member strategy...price:"+bookPrice*0.9);
        return bookPrice*0.9;
    }
}
