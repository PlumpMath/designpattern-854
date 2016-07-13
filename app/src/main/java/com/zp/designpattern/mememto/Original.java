package com.zp.designpattern.mememto;

/**
 * Created by ghw on 16/7/10.
 */
public class Original {

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private String value;

    public Memento createMemento(String value){
        return new Memento(value);
    }

    public void restoreMemento(Memento memento){
        this.value = memento.getValue();
    }


}
