package com.zp.designpattern.responsibilitychain;

/**
 * Created by ghw on 16/7/10.
 */
public interface Handler {
    public void operate();
    public void setHandler(Handler handler);
}
