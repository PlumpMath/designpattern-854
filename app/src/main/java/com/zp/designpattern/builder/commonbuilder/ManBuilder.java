package com.zp.designpattern.builder.commonbuilder;

/**
 * Created by ghw on 16/6/24.
 */
public class ManBuilder implements PersonBuilder {

    Person man = null;

    public ManBuilder(){
        man = new Person();
    }

    @Override
    public void buildHead() {
        man.setHead("Setting man head...");
        System.out.println("Common builder...building man head...");
    }

    @Override
    public void buildBody() {
        man.setBody("Setting man body...");
        System.out.println("Common builder...building man body...");
    }

    @Override
    public void buildFoot() {
        man.setFoot("Setting man foot...");
        System.out.println("Common builder...building man foot...");
    }

    @Override
    public Person getPerson() {
        return man;
    }
}
