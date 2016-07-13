package com.zp.designpattern.flyweight;

/**
 * Created by ghw on 16/6/29.
 */

/**
 * http://blog.sina.com.cn/s/blog_458918d90100ru6b.html
 * GoF对享元模式的描述是：运用共享技术有效地支持大量细粒度的对象。
 * Flyweight模式是构造型模式之一，它通过与其他类似对象共享数据来减小内存占用。也就是说在一个系统中如果有多个相同的对象，那么只共享一份就可以了，不必每个都去实例化一个对象。在Flyweight模式中，由于要产生各种各样的对象，所以在Flyweight(享元)模式中常出现Factory模式。Flyweight的内部状态是用来共享的,Flyweight factory负责维护一个对象存储池（Flyweight Pool）来存放内部状态的对象。为了调用方便，FlyweightFactory类一般使用Singleton模式实现。Flyweight模式是一个提高程序效率和性能的模式,会大大加快程序的运行速度。
 * Flyweight模式的有效性很大程度上取决于如何使用它以及在何处使用它。当以下情况成立时使用Flyweight模式：
 * 1 一个应用程序使用了大量的对象。
 * 2 完全由于使用大量的对象，造成很大的存储开销。
 * 3 对象的大多数状态都可以变为外部状态。
 * 4 如果删除对象以外的状态那么可以用相对较少的共享对象取代很多组对象。
 * 5 应用程序不依赖于对象标识。
 */
public class Client {

    public static void main(String[] args){
        FlavorFactory flavorFactory = new FlavorFactory();

        Order order1 = flavorFactory.createOrder("拿铁");
        order1.sell();

        Order order2 = flavorFactory.createOrder("星冰乐");
        order2.sell();

        Order order3 = flavorFactory.createOrder("卡布奇诺");
        order3.sell();
    }

}
