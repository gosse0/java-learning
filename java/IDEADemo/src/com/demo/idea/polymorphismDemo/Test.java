package com.demo.idea.polymorphismDemo;

/**
 * className: Test
 * Package: com.demo.idea.polymorphismDemo
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-10 - 21:55
 */
public class Test {
    public static void main(String[] args) {

        People p1 = new Student();
        p1.run();
        People p2 = new Teacher();
        p2.run();
        mygo(p1);
        mygo(p2);
    }

    public static void mygo(People p)
    {
        if(p instanceof Student)
        {
            Student stu = (Student) p;
            stu.school();
        }
        else if(p instanceof Teacher){
            Teacher teach = (Teacher) p;
            teach.teach();
        }
    }

}
