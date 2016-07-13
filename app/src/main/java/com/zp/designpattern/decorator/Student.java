package com.zp.designpattern.decorator;

/**
 * Created by ghw on 16/6/19.
 */
public class Student implements Person {

    @Override
    public void study() {
        System.out.println("Student study...");
    }
}
