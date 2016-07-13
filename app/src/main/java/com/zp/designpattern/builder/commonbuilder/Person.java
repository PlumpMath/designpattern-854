package com.zp.designpattern.builder.commonbuilder;

/**
 * Created by ghw on 16/6/24.
 */
public class Person {

    private String head;
    private String body;
    private String foot;

    public String getFoot() {
        return foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String toString(){
        return "Person:head="+head+",body="+body+",foot="+foot;
    }
}
