package com.zp.designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ghw on 16/7/11.
 */
public class ObjectStructure {

    private List<Node> nodeList = new ArrayList<>();

    public void action(Visitor visitor){
        for (Node node:nodeList) {
            node.accept(visitor);
        }
    }

    public void addNode(Node node){
        nodeList.add(node);
    }
}
