package com.zp.designpattern.strategy;

/**
 * Created by ghw on 16/6/30.
 */
public class PrimaryMemberStrategy implements MemberStrategy {

    @Override
    public double calPrice(double bookPrice) {
        System.out.println("Testing strategy...primary member strategy...price:"+bookPrice);
        return bookPrice;
    }
}
