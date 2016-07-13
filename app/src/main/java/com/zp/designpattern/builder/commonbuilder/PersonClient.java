package com.zp.designpattern.builder.commonbuilder;

/**
 * Created by ghw on 16/6/24.
 */

/**
 * http://www.2cto.com/kf/201301/184777.html
 * 建造者模式（Builder），将一个复杂对象的构造与他的表示分离，使得同样的构造过程可以创建不同的表示
 * 如果你需要将一个复杂对象的构建于他的表示分离，使得构建过程可以创建不同的表示意图时，我们需要应用“建造者模式”，又叫“生成器模式”
 *
 * 适用性
 *
 * 1.当创建复杂对象的算法应该独立于该对象的组成部分以及它们的装配方式时。
 *
 * 2.当构造过程必须允许被构造的对象有不同的表示时。
 * 3.用户创建一些复杂的对象，这些对象内部构建建的建造顺序通常的稳定的，但对象内部的构建通常面临着复杂的变化（比如画一个人）。www.2cto.com
 * 优点：使得建造代码与表示代码分离，由于建造者隐藏了该产品是如何组装的，所以若需要改变一个产品的内部表示，只需要在定义一个具体的建造者就可以了
 * 如果建造者模式，那么用户就只需要指定需要创建的类型就可以得到它们，而具体建造的过程和细节就不需知道了
 * Builder类：是为创建一个product对象的各个部件指定的抽象接口
 * ConcreteBuilder类：他是具体建造者，实现Builder接口，构造和装配各个部件
 * Director类：他是构建一个使用Builder接口的对象
 */
public class PersonClient {

    public static void main(String[] args){
        PersonDirector personDirector = new PersonDirector();

        PersonBuilder manBuilder = new ManBuilder();
        Person man = personDirector.PersonDirector(manBuilder);
        System.out.println(man);

        PersonBuilder womenBuilder = new WomanBuilder();
        Person women = personDirector.PersonDirector(womenBuilder);
        System.out.println(women);
    }
}
