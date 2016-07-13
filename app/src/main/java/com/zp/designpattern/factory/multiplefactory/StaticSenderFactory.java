package com.zp.designpattern.factory.multiplefactory;

/**
 * Created by ghw on 16/6/21.
 */
public class StaticSenderFactory {

    public static Sender produceSMSSender(){
        return new SMSSender();
    }

    public static Sender produceMailSender(){
        return new MailSender();
    }
}
