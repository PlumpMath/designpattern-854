package com.zp.designpattern.bridge;

/**
 * Created by ghw on 16/6/27.
 */
/**
 * http://blog.csdn.net/jason0539/article/details/22568865
 */
public class Client {

    public static void main(String[] args){
        Vehicle bus = new Bus();
        Road street = new Street();
        street.offerRoad(bus);

        Vehicle car = new Car();
        Road speedWay = new SpeedWay();
        speedWay.offerRoad(car);
    }
}
