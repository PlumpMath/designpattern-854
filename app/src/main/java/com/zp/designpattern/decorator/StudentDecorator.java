package com.zp.designpattern.decorator;

/**
 * Created by ghw on 16/6/19.
 */
public class StudentDecorator implements Person {

    private Student student;

    public StudentDecorator(Student student){
        this.student = student;
    }

    @Override
    public void study() {
        System.out.println("StudentDecorator pre-study...");
        if(student != null){
            student.study();
        }
        System.out.println("StudentDecorator post-study...");
    }
}
