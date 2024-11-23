package com.demo.idea.collectionsDemo;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

/**
 * @Author: 史传正
 * @Create: 2024-10-30-22:29
 * -------------------------
 * className: TreeSetDemo
 * Description:
 */
public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(4);
        ts.add(1);
        ts.add(3);
        ts.add(2);
        ts.add(5);
        System.out.println(ts);

        Iterator<Integer> it = ts.iterator();
        while(it.hasNext())
        {
            int i = it.next();
            System.out.print(i+" ");
        }
        System.out.println();

        ts.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        ts.forEach(integer -> System.out.println(integer));

        System.out.println("-----------自定义对象排序-------------");

        TreeSet<st> ts2 = new TreeSet<>();
        st s1 = new st(23,"zhangsan");
        st s2 = new st(44,"zhanssan");
        st s3 = new st(24,"lisi");
        st s4 = new st(24,"l");
        ts2.add(s1);
        ts2.add(s2);
        ts2.add(s3);
        ts2.add(s4);
        System.out.println(ts2);

        System.out.println("-----------自定义排序方法-------------");
        TreeSet<String> ts3 = new TreeSet<>((o1,o2)->{
                if(o1.length() == o2.length()) return o1.compareTo(o2);
                return o1.length() - o2.length();
            });
        ts3.add("d");
        ts3.add("abc");
        ts3.add("abb");
        System.out.println(ts3);


    }
}
class st implements Comparable<st>{
    private int age;
    private String name;

    public st(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "st{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(st o) {
        if(this.age == o.age)
            return this.name.compareTo(o.name);
        return this.age - o.age;
    }
}