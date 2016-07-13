package com.zp.designpattern.iterator;

/**
 * Created by ghw on 16/7/7.
 */
public class MyIterator implements Iterator {

    private Collection collection;
    private int pos = -1;

    public MyIterator(Collection collection){
        this.collection = collection;
    }

    @Override
    public Object previous() {
        Object object = null;
        if(pos > 0 && this.collection != null && this.collection.size() > 0){
            object = collection.get(pos-1);
            pos--;
        }

        return object;

    }

    @Override
    public Object next() {
        Object object = null;
        if(this.collection != null && this.collection.size() > 0){
            object = collection.get(pos+1);
            pos++;
        }

        System.out.println("---Testing design pattern, iterator next:"+object+"---");

        return object;
    }

    @Override
    public boolean hasNext() {
        boolean hasNext = false;
        if(this.collection != null && this.collection.size() > 0){
            if(this.collection.size() - 1 > pos){
                hasNext = true;
            }
        }

        return hasNext;
    }

    @Override
    public Object first() {
        Object object = null;
        if(this.collection != null && this.collection.size() > 0){
            object = this.collection.get(0);
        }

        return object;
    }
}
