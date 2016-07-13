package com.zp.designpattern.builder.androidbuilder;

/**
 * Created by ghw on 16/6/19.
 */
/*
 *http://blog.csdn.net/jie1991liu/article/details/49640725
 *定义一个静态内部类Builder，内部的成员变量和外部类一样
 *Builder类通过一系列的方法用于成员变量的赋值，并返回当前对象本身（this）
 *Builder类提供一个build方法或者create方法用于创建对应的外部类，该方法内部调用了外部类的一个私有构造函数，该构造函数的参数就是内部类Builder
 *外部类提供一个私有构造函数供内部类调用，在该构造函数中完成成员变量的赋值，取值为Builder对象中对应的值
 */
//http://www.tuicool.com/articles/Z77juae
public class Client {
    public static void main(String[] args){
        Person.Builder builder = new Person.Builder();
        Person person = builder.setAge(35)
                .setName("zp")
                .build();
        person.show();
    }
}
