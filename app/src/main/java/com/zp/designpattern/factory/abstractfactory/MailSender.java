package com.zp.designpattern.factory.abstractfactory;

/**
 * Created by ghw on 16/6/22.
 */
public class MailSender implements Sender {

    @Override
    public void send(){
        System.out.println("Testing abstract factory...mail sender...");
    }
}
