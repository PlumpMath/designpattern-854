package com.zp.designpattern.prototype;

import java.util.ArrayList;

/**
 * Created by ghw on 16/6/19.
 * http://www.mobile-open.com/2015/86267.html
 * 用原型实例指定创建对象的种类，并通过拷贝这些原型创建新的对象。
 */
public class Person implements Cloneable{
    int age;
    String name;
    ArrayList hobbies = new ArrayList();

    public ArrayList getHobbies() {
        return hobbies;
    }

    public void setHobbies(ArrayList hobbies) {
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Object clone(){
        Person person = null;
        try {
            person = (Person)super.clone();
            person.age = this.age;
            person.name = this.name;

            person.hobbies = (ArrayList)this.hobbies.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return person;
    }

    @Override
    public String toString(){
        return "Person{age:"+age+";name:"+name+";hobbies:"+hobbies+"}";

    }
}
