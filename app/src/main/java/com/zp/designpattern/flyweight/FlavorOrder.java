package com.zp.designpattern.flyweight;

/**
 * Created by ghw on 16/6/29.
 */
public class FlavorOrder implements Order {

    private String name = null;
    public FlavorOrder(String name){
        this.name = name;
    }

    @Override
    public void sell() {
        System.out.println("---Testing flyweight...flavororder...---name:"+this.name);
    }
}
