package com.zp.designpattern.prototype;

/**
 * Created by ghw on 16/6/19.
 */
//http://www.mobile-open.com/2015/86267.html
//用原型实例指定创建对象的种类，并通过拷贝这些原型创建新的对象。
public class Client {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.age = 34;
        person1.name = "zp";
        person1.hobbies.add("kof97");

        System.out.println("person1:"+person1);

        Person person2 = (Person)person1.clone();
        person2.setName("Jan");
        person2.hobbies.add("basketball");

        System.out.println("person1:"+person1);

        System.out.println("person2:"+person2);


    }
}
