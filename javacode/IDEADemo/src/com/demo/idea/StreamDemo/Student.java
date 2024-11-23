package com.demo.idea.StreamDemo;

/**
 * @Author: 史传正
 * @Create: 2024-11-03-20:18
 * -------------------------
 * className: Student
 * Description:
 */
public class Student {
    String name;
    int age;

    public Student() {
    }

    //"张三-11"
    public Student(String s){
        this.name = s.split("-")[0];
        this.age = Integer.parseInt(s.split("-")[1]);
    }

    public Student(String name, int age) {
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

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }*/

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
