package com.zp.designpattern.iterator;

/**
 * Created by ghw on 16/7/7.
 */
public interface Collection {

    public Iterator interator();
    public Object get(int i);
    public int size();
}
