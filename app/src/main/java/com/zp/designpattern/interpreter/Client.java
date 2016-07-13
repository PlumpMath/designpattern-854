package com.zp.designpattern.interpreter;

/**
 * Created by ghw on 16/7/13.
 */

/**
 * http://www.cnblogs.com/maowang1991/archive/2013/04/15/3023236.html
 */
public class Client {

    public static void main(String[] args){

        int result = new Plus().interpre(new Context(4,5));

        System.out.println("---Testing interpreter pattern, result after plus is:"+result+"---");

        result = new Minus().interpre(new Context(19, result));
        System.out.println("---Testing interpreter pattern, result after minus is:"+result+"---");
    }
}
