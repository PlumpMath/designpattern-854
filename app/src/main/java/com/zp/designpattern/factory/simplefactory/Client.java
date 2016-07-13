package com.zp.designpattern.factory.simplefactory;

/**
 * Created by ghw on 16/6/21.
 */
public class Client {

    public static void main(String[] args){
        SimpleSenderFactory simpleSenderFactory = new SimpleSenderFactory();
        Sender mailSender = simpleSenderFactory.produce("mail");
        mailSender.send();

        Sender smsSender = simpleSenderFactory.produce("sms");
        smsSender.send();
    }
}
