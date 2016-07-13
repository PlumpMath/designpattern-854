package com.zp.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ghw on 16/6/28.
 */
public class Composite extends Component {

    public List<Component> list = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public void foreach() {
        System.out.println("---composite name:"+this.name+"---");
        for (Component c: list) {
            c.foreach();
        }
    }
}
