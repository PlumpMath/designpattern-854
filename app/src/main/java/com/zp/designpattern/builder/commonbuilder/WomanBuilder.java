package com.zp.designpattern.builder.commonbuilder;

/**
 * Created by ghw on 16/6/24.
 */
public class WomanBuilder implements PersonBuilder {

    Person women = null;

    public WomanBuilder(){
        women = new Person();
    }

    @Override
    public void buildHead() {
        women.setHead("Setting women head...");
        System.out.println("Common builder...building women head...");
    }

    @Override
    public void buildBody() {
        women.setBody("Setting women head...");
        System.out.println("Common builder...building women body...");
    }

    @Override
    public void buildFoot() {
        women.setFoot("Setting women head...");
        System.out.println("Common builder...building women foot...");
    }

    @Override
    public Person getPerson() {
        return women;
    }
}
