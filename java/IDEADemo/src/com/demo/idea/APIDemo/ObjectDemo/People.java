package com.demo.idea.APIDemo.ObjectDemo;

import java.util.Objects;

/**
 * className: People
 * Package: com.demo.idea.APIDemo.ObjectDemo
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-18 - 13:23
 */
public class People {
    String name;
    int age;
    protected int info;

    //重写输出，因为sout一个类，内部调用的是toString
    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //重写equals，因为默认比较的是Object的地址值


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return age == people.age && Objects.equals(name, people.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
