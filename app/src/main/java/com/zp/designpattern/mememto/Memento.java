package com.zp.designpattern.mememto;

/**
 * Created by ghw on 16/7/10.
 */
public class Memento {

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private String value;

    public Memento(String value){
        this.value = value;
    }


}
