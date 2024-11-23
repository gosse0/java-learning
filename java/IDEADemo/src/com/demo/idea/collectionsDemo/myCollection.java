package com.demo.idea.collectionsDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * @Author: 史传正
 * @Create: 2024-10-29-19:24
 * -------------------------
 * className: myCollection
 * Description:集合详解
 */
public class myCollection {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        //添加
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll);

        //清空
        //coll.clear();
        //System.out.println(coll);

        //移除：第一个找到的
        coll.add("aaa");
        coll.remove("aaa");
        System.out.println(coll);

        //是否包含
        System.out.println(coll.contains("aaa"));
        System.out.println(coll.contains("ddd"));


        System.out.println("---------------");

        Collection<Person> coll2 = new ArrayList<>();
        Person s1 = new Person(10,"zhangsan");
        Person s2 = new Person(20,"lisi");
        Person s3 = new Person(10,"wangwu");
        coll2.add(s1);
        coll2.add(s2);
        coll2.add(s3);

        Person s4 = new Person(10,"zhangsan");

        //需要重写equal函数
        System.out.println(coll2.contains(s4));


        System.out.println("------迭代器遍历-----------");

        //迭代器遍历：iterator
        Iterator<String> it = coll.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        it = coll.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        System.out.println("-----增强for--------");

        //增强for 简化循环
        for(String s:coll){
            System.out.println(s);
        }


        System.out.println("-----匿名内部类--------");
        //匿名内部类
        coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("-----lambda--------");
        coll.forEach(s->System.out.println(s));

    }
}

class Person{
    int age;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    public Person() {
    }

    public Person(int age, String name) {
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
}

