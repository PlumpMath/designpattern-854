package com.zp.designpattern.builder.commonbuilder;

/**
 * Created by ghw on 16/6/24.
 */
public interface PersonBuilder {

   public void buildHead();
   public void buildBody();
   public void buildFoot();
   public Person getPerson();

}
