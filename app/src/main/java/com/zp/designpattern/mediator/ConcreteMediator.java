package com.zp.designpattern.mediator;

/**
 * Created by ghw on 16/7/1.
 */

/**
 * http://www.jeepshoe.org/206614812.htm
 * 外观模式PK中介者模式：

 1.外观模式是结构型模式，中介者模式是行为型模式。
 2.外观模式是对子系统提供统一的接口，中介者模式是用一个中介对象来封装一系列同事对象的交互行为。
 3.外观模式协议是单向，中介者模式协议是双向。
 4.外观模式所有的请求处理都委托给子系统完成，而中介者模式则由中心协调同事类和中心本身共同完成业务。

 外观模式PK代理模式：

 1.代理模式中的代理角色和真实角色都继承于同一类。而外观模式是多个类的集合。

 2.代理角色与真实角色接口相同，功能一致，代理角色实现的是真实角色的功能。外观者模式的子系统功能不同，根据用户不同需要与外观类统一配置。

 代理模式PK中介者模式：

 1.代理模式是一对一，一个代理只能代表一个对象。中介者模式则是多对多，中介者的功能多样，客户也可以多个。

 2.只能代理一方。如果PB是A的代理，那么C可以通过PB访问A，但是A不能通过PB访问B。对于中介者模式而言，A可以通过中介访问B，B也可以通过中介访问A。


 */
public class ConcreteMediator implements Mediator {

    User user1 = null;
    User user2 = null;

    @Override
    public void createMediator() {
        user1 = new User1();
        user2 = new User2();
    }

    @Override
    public void workAll() {
        if (user1 == null || user2 == null){
            createMediator();
        }

        user1.work();
        user2.work();
    }
}
