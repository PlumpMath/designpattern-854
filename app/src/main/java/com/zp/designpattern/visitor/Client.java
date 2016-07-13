package com.zp.designpattern.visitor;

/**
 * Created by ghw on 16/7/11.
 */

/**
 * http://www.cnblogs.com/java-my-life/archive/2012/06/14/2545381.html
 * 访问者模式是对象的行为模式。访问者模式的目的是封装一些施加于某种数据结构元素之上的操作。
 * 一旦这些操作需要修改的话，接受这个操作的数据结构则可以保持不变。
 */
public class Client {

    public static void main(String[] args){
        ObjectStructure objectStructure = new ObjectStructure();

        Node nodeA = new NodeA();
        objectStructure.addNode(nodeA);

        Node nodeB = new NodeB();
        objectStructure.addNode(nodeB);

        Visitor visitorA = new VisitorA();
        objectStructure.action(visitorA);

        Visitor visitorB = new VisitorB();
        objectStructure.action(visitorB);
    }
}
