package com.zp.designpattern.state;

/**
 * Created by ghw on 16/7/10.
 */

/**
 * http://www.cnblogs.com/java-my-life/archive/2012/06/08/2538146.html
 */
public class Context {

    private State state;

    public Context(State state){
        this.state = state;
    }

    public void request(){
        if(state != null){
            state.handle();
        }
    }
}
