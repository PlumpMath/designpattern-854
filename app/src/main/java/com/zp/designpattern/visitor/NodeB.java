package com.zp.designpattern.visitor;

/**
 * Created by ghw on 16/7/11.
 */
public class NodeB implements Node {

    @Override
    public void accept(Visitor visitor){
        visitor.visitNodeB(this);
    }

    public void operation(){
        System.out.println("---Testing pattern visitor, this is NodeB...---");
    }
}
