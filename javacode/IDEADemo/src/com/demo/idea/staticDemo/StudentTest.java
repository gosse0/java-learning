package com.demo.idea.staticDemo;

/**
 * className: StudentTest
 * Package: com.demo.idea.staticDemo
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-10 - 14:42
 */
public class StudentTest {
    public static void main(String[] args) {
        //共享。修饰的变量叫类变量/静态成员变量
        Student s1 = new Student();
        Student s2 = new Student();
        Student.num = 8;
        s1.num = 9;
        System.out.println(s1.num);
        s2.num = 10;
        System.out.println(s1.num);

        Student.myPrint();
        s1.myPrint();

        myUtil.myFun();

    }
}
