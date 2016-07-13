package com.zp.designpattern.responsibilitychain;

/**
 * Created by ghw on 16/7/10.
 */
public class MyHandler implements Handler {

    private String name;

    public MyHandler(String name){
        this.name = name;
    }

    private Handler handler;

    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void operate() {
        System.out.println("---Testing responsibility chain handler is:"+this.name);
        if(this.handler != null){
            this.handler.operate();
        }
    }
}
