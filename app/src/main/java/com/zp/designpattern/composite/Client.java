package com.zp.designpattern.composite;

/**
 * Created by ghw on 16/6/28.
 */

/**
 * http://www.cnblogs.com/draem0507/p/3794844.html
 *《JAVA与模式》之组合模式
 * 定义(GoF《设计模式》)：
 * 将对象组合成树形结构以表示“部分整体”的层次结构。组合模式使得用户对单个对象和使用具有一致性。
 * 及角色：
 * 1.Component 是组合中的对象声明接口，在适当的情况下，实现所有类共有接口的默认行为。声明一个接口用于访问和管理Component
 * 子部件。
 * 2.Leaf 在组合中表示叶子结点对象，叶子结点没有子结点。
 * 3.Composite 定义有枝节点行为，用来存储子部件，在Component接口中实现与子部件有关操作，如增加(add)和删除
 * (remove)等。
 */
public class Client {

    public static void main(String[] args){
        Component root = new Composite("根节点");
        Component firstNode1 = new Composite("一级节点1");
        Component firstNode2 = new Composite("一级节点2");
        root.add(firstNode1);
        root.add(firstNode2);

        Component secondNode1 = new Leaf("二级节点1");
        Component secondNode2 = new Leaf("二级节点2");
        firstNode1.add(secondNode1);
        firstNode2.add(secondNode2);

        root.foreach();
    }

}
