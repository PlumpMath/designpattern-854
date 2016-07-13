package com.zp.designpattern.bridge;

/**
 * Created by ghw on 16/6/27.
 */

/**
 * http://blog.csdn.net/jason0539/article/details/22568865
 */
public class Street implements Road {

    @Override
    public void offerRoad(Vehicle vehicle) {
        if (vehicle != null){
            System.out.println("Testing bridge design pattern...Street offerroad...");
            vehicle.run();
        }
    }
}
