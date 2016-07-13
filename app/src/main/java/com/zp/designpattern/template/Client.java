package com.zp.designpattern.template;

/**
 * Created by ghw on 16/6/30.
 */

/**
 * http://www.cnblogs.com/maowang1991/archive/2013/04/15/3023236.html
 */
public class Client {

    public static void main(String[] args){
        AbstractCalculator plus = new Plus();
        int result = plus.calculate("8+8", "\\+");
        System.out.println("Testing template...plus result...:"+result);

        AbstractCalculator minor = new Minor();
        int result1 = minor.calculate("10-4", "\\-");
        System.out.println("Testing template...minor result...:"+result1);
    }



}
