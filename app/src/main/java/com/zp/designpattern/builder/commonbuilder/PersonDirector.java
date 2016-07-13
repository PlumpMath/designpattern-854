package com.zp.designpattern.builder.commonbuilder;


/**
 * Created by ghw on 16/6/24.
 */
public class PersonDirector {
    public Person PersonDirector(PersonBuilder personBuilder){

        Person person = null;
        if(personBuilder != null){
            personBuilder.buildHead();
            personBuilder.buildBody();
            personBuilder.buildFoot();

            person = personBuilder.getPerson();
        }

        return person;
    }
}
