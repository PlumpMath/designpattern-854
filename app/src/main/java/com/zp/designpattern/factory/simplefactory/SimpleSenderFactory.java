package com.zp.designpattern.factory.simplefactory;

/**
 * Created by ghw on 16/6/21.
 */
public class SimpleSenderFactory {

    public Sender produce(String type){
        Sender sender = null;
        if("mail".equalsIgnoreCase(type)){
            sender = new MailSender();
        }else if("sms".equalsIgnoreCase(type)){
            sender = new SMSSender();
        }

        return sender;
    }
}
