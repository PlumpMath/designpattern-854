package com.zp.designpattern.factory.abstractfactory;

/**
 * Created by ghw on 16/6/22.
 */
public class MailFactory implements Provider {
    @Override
    public Sender produce(){
        return new MailSender();
    }
}
