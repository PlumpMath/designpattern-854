package com.zp.designpattern.factory.multiplefactory;

/**
 * Created by ghw on 16/6/21.
 */
public class MailSender implements Sender {
    @Override
    public void send(){
        System.out.println("Testing SimpleFactory...this is MailSender");
    }
}
