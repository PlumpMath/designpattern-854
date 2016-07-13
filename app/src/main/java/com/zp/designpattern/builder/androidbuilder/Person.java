package com.zp.designpattern.builder.androidbuilder;

/**
 * Created by ghw on 16/6/19.
 */
public class Person {

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;

        return this;
    }

    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age;

        return this;
    }

    private String name;
    private int age;

    private Person(Builder builder){
        this.age = builder.age;
        this.name = builder.name;
    }

    static class Builder{
        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;

            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;

            return this;
        }

        private String name;
        private int age;

        Person build(){
            return new Person(this);
        }
    }

    void show(){
        System.out.println("This is a person");
    }

}
