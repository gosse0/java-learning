package com.demo.idea.staticDemo;

/**
 * className: Student
 * Package: com.demo.idea.staticDemo
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-10 - 14:39
 */
public class Student {
    //静态代码块，只会执行一次，类的初始化，构造多个类对象也只会执行一次
    static {
        System.out.println("静态代码块，完成类的初始化");
    }

    //实例代码块，对实例对象new的时候初始化，在构造器之前
    {
        System.out.println("实例代码块");
    }

    //常量
    static final int x = 6;

    static int num;
    private String name;




    public static void setNum(int num) {
        Student.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public static void myPrint(){
        System.out.println(num);
    }
}
