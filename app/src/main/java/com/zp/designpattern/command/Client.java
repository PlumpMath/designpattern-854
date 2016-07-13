package com.zp.designpattern.command;

/**
 * Created by ghw on 16/7/10.
 */
public class Client {

    public static void main(String[] args){
        Commander commander = new Commander();

        Receiver receiver = new Receiver();
        Command command = new Command(receiver);

        commander.order(command);
    }
}
