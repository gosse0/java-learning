package com.demo.idea.polymorphismDemo;

/**
 * className: Student
 * Package: com.demo.idea.polymorphismDemo
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-10 - 21:55
 */
public class Student extends People {
    @Override
    public void run(){
        System.out.println("student's run");
    }
    public void school(){
        System.out.println("升学");
    }
}
