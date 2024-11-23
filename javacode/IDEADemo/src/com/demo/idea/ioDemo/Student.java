package com.demo.idea.ioDemo;

import java.io.Serializable;

/**
 * @Author: 史传正
 * @Create: 2024-11-07-19:43
 * -------------------------
 * className: Student
 * Description:
 */
public class Student implements Serializable {


    int age;
    String name;

    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
