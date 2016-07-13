package com.zp.designpattern.decorator;

/**
 * Created by ghw on 16/6/19.
 *
 * http://www.cnblogs.com/maowang1991/archive/2013/04/15/3023236.html
 * 装饰器模式的应用场景：
 * 1、需要扩展一个类的功能。
 * 2、动态的为一个对象增加功能，而且还能动态撤销。（继承不能做到这一点，继承的功能是静态的，不能动态增删。）
 * 缺点：产生过多相似的对象，不易排错！
 */
public class Client {

    public static void main(String[] args){
        Student student = new Student();
        Person person = new StudentDecorator(student);
        person.study();
    }
}
