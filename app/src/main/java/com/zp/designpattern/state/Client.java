package com.zp.designpattern.state;

/**
 * Created by ghw on 16/7/10.
 */

/**
 * http://www.cnblogs.com/java-my-life/archive/2012/06/08/2538146.html
 * 大家可能会发现状态模式的结构和策略模式的结构完全一样，但是，它们的目的、实现、本质却是完全不一样的。
 * 还有行为之间的特性也是状态模式和策略模式一个很重要的区别，状态模式的行为是平行性的，不可相互替换的；
 * 而策略模式的行为是平等性的，是可以相互替换的。
 */
public class Client {

    public static void main(String[] args){
        State concreteB = new ConcreteStateB();

        Context context = new Context(concreteB);
        context.request();
    }


}
