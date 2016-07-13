package com.zp.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ghw on 16/7/7.
 */
public class Client {

    public static void main(String[] args){
        List<String> strList = new ArrayList<>();
        strList.add("zp");
        strList.add("jan");
        strList.add("hzx");

        Collection myCollection = new MyCollection(strList);
        Iterator iterator = myCollection.interator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
