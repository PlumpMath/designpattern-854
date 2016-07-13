package com.zp.designpattern.mememto;

/**
 * Created by ghw on 16/7/10.
 */
public class Client {

    public static void main(String[] args){
        Original original = new Original();
        original.setValue("before change");

        System.out.println("---Testing memento pattern, value before change is:"+original.getValue());

        //Memento memento = new Memento(original.c)
        Storage storage = new Storage();
        storage.setMemento(original.createMemento(original.getValue()));

        original.setValue("after change");
        System.out.println("---Testing memento pattern, value after change is:"+original.getValue());

        original.restoreMemento(storage.getMemento());
        System.out.println("---Testing memento pattern, value after restore is:"+original.getValue());
    }
}
