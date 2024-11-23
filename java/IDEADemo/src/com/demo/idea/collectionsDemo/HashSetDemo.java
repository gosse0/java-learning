package com.demo.idea.collectionsDemo;

import java.util.HashSet;
import java.util.Objects;

/**
 * @Author: 史传正
 * @Create: 2024-10-30-21:58
 * -------------------------
 * className: HashSetDemo
 * Description:
 */
public class HashSetDemo {
    public static void main(String[] args) {
        Student p1 = new Student(23,"zhangsan");
        Student p2 = new Student(24,"lisi");
        Student p3 = new Student(25,"wangwu");

        Student p4 = new Student(23,"zhangsan");

        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(p1);
        hashSet.add(p2);
        System.out.println(hashSet);
        hashSet.add(p3);
        System.out.println(hashSet);
        hashSet.add(p4);
        System.out.println(hashSet);

        for(Student s:hashSet)
        {
            System.out.println(s);
        }




    }
}

class Student{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
