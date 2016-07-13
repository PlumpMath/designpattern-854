package com.zp.designpattern.composite;

/**
 * Created by ghw on 16/6/28.
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public void foreach() {
        System.out.println("---leaf name:"+this.name+"---");
    }
}
