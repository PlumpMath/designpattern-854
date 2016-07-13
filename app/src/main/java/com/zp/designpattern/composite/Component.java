package com.zp.designpattern.composite;

/**
 * Created by ghw on 16/6/28.
 */
public abstract class Component {

    String name;

    public Component(String name){
        this.name = name;
    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract void foreach();
}
