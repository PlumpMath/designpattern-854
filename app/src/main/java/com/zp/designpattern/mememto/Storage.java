package com.zp.designpattern.mememto;

/**
 * Created by ghw on 16/7/10.
 */
public class Storage {
    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    private Memento memento;

    public void storeMemento(Memento memento){
        this.memento = memento;
    }

}
