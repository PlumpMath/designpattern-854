package com.zp.designpattern.command;

/**
 * Created by ghw on 16/7/10.
 */
public class Commander {

    public void order(Command command){
        command.send2Receiver();
    }
}
