package com.zp.designpattern.bridge;

/**
 * Created by ghw on 16/6/27.
 */
public class SpeedWay implements Road {

    @Override
    public void offerRoad(Vehicle vehicle) {
        if (vehicle != null){
            System.out.println("Testing bridge design pattern...SpeedWay offerroad...");
            vehicle.run();
        }
    }
}
