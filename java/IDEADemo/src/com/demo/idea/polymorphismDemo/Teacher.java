package com.demo.idea.polymorphismDemo;

/**
 * className: Teacher
 * Package: com.demo.idea.polymorphismDemo
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-10 - 21:54
 */
public class Teacher extends People {
    @Override
    public void run(){
        System.out.println("teacher's run");
    }
    public void teach(){
        System.out.println("教学");
    }
}
