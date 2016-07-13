package com.zp.designpattern.command;

/**
 * Created by ghw on 16/7/10.
 */
public class Command {

    private Receiver receiver;

    public Command(Receiver receiver){
        this.receiver = receiver;
    }

    public void send2Receiver(){
        if(receiver != null){
            receiver.operate();
        }
    }
}
