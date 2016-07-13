package com.zp.designpattern.visitor;

/**
 * Created by ghw on 16/7/11.
 */
public class NodeA implements Node {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitNodeA(this);
    }

    public void operation(){
        System.out.println("---Testing pattern visitor, this is NodeA...---");
    }
}
