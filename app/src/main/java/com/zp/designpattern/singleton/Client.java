package com.zp.designpattern.singleton;

/**
 * Created by ghw on 16/6/22.
 */
public class Client {

    public static void main(String[] args){

        //for singleton
        /*for (int i=1; i<100; i++){
            final String iString = String.valueOf(i);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton singleton = Singleton.getInstance();
                    System.out.println("singleton:"+iString+":"+singleton);
                }
            }).start();
        }*/

        //for singleton1
        /*for (int i=1; i<100; i++){
            final String iString = String.valueOf(i);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton1 singleton1 = Singleton1.getInstance();
                    System.out.println("singleton1:"+iString+":"+singleton1);
                }
            }).start();
        }*/

        //for singleton2
        for (int i=1; i<100; i++){
            final String iString = String.valueOf(i);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton2 singleton2 = Singleton2.getInstance();
                    System.out.println("singleton2:"+iString+":"+singleton2);
                }
            }).start();
        }


    }
}
