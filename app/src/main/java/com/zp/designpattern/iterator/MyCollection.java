package com.zp.designpattern.iterator;

import java.util.List;

/**
 * Created by ghw on 16/7/7.
 */
public class MyCollection implements Collection {

    List list = null;

    public MyCollection(List<String> list){
        this.list = list;
    }

    @Override
    public Iterator interator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        Object obj = null;
        if (this.list != null && this.list.size()>0){
            obj = this.list.get(i);
        }

        return obj;
    }

    @Override
    public int size() {
        int size = 0;
        if (this.list != null && this.list.size()>0){
            size = this.list.size();
        }

        return size;
    }
}
