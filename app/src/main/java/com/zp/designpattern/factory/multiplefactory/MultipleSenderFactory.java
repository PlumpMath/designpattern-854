package com.zp.designpattern.factory.multiplefactory;

/**
 * Created by ghw on 16/6/21.
 */
public class MultipleSenderFactory {

    public Sender produceSMSSender(){
        return new SMSSender();
    }

    public Sender produceMailSender(){
        return new MailSender();
    }
}
