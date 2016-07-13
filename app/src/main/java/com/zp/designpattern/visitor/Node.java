package com.zp.designpattern.visitor;

/**
 * Created by ghw on 16/7/11.
 */
public interface Node {

    public void accept(Visitor visitor);
}
