package com.zp.designpattern.strategy;

/**
 * Created by ghw on 16/6/30.
 */
public class Price {

    private MemberStrategy memberStrategy;

    public Price(MemberStrategy memberStrategy){
        this.memberStrategy = memberStrategy;
    }

    public double getPrice(double bookPrice){
        return this.memberStrategy.calPrice(bookPrice);
    }
}
