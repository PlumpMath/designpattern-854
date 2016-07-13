package com.zp.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ghw on 16/6/29.
 */
public class FlavorFactory {

    private Map<String, Order> orderMap = new HashMap<>();

    /*private Order order;

    public FlavorFactory(Order order){
        this.order = order;
    }*/

    public Order createOrder(String orderName){
        Order order = null;
        if (orderMap.containsKey(orderName)){
            order = orderMap.get(orderName);
        }else{
            order = new FlavorOrder(orderName);
        }

        return order;
    }
}
