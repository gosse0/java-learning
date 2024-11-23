package com.demo.idea.APIDemo;

/**
 * className: MathDemo
 * Package: com.demo.idea.APIDemo
 * Description:数组的拷贝
 *
 * @Author: 史传正
 * @Create: 2024-10-16 - 22:22
 */
public class MathDemo {
    public static void main(String[] args) {

        //arraycopy，数组拷贝
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = new int[10];

        System.arraycopy(arr1,2,arr2,1,3);
        arr1[2] = 4;
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+", ");
        }
        System.out.println("-----------------------------");

        Student student1 = new Student("张三",18);
        Student student2 = new Student("李四",12);
        Student student3 = new Student("王五",17);
        Student[] students = {student1, student2, student3};

        Person[] people = new Person[3];
        System.arraycopy(students, 0, people, 0, 3);
        for (int i = 0; i < students.length; i++) {
            Person temP = people[i];
            System.out.println(temP.getName()+", "+ temP.getAge());
        }

        System.out.println("-----------------------------");

        //runtime：Java 应用程序与其运行环境之间的桥梁，程序与JVM之间的交互
        //线程数
        System.out.println(Runtime.getRuntime().availableProcessors());
        //内存大小
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024+"MB");
        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024+"MB");




    }
}

class Person{
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
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

class Student extends Person{
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }
}
