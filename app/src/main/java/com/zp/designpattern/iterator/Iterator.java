package com.zp.designpattern.iterator;

/**
 * Created by ghw on 16/7/7.
 */
public interface Iterator {

    public Object previous();
    public Object next();
    public boolean hasNext();
    public Object first();
}
