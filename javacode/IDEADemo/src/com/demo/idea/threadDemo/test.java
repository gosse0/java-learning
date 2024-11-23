package com.demo.idea.threadDemo;

/**
 * @Author: 史传正
 * @Create: 2024-11-10-12:13
 * -------------------------
 * className: test
 * Description:
 */
public class test {
    public static void main(String[] args) {
        /*

        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        thread1.start();
        thread2.start();*/



        /*
        MyRunnable mr1 = new MyRunnable();
        MyRunnable mr2 = new MyRunnable();
        Thread thread1 = new Thread(mr1,"壹");
        Thread thread2 = new Thread(mr2,"贰");

        thread1.start();
        thread2.start();
        System.out.println(thread1.getPriority());
        System.out.println(thread2.getPriority());*/

/*
        MyLock thread1 = new MyLock();
        MyLock thread2 = new MyLock();
        MyLock thread3 = new MyLock();
        thread1.setName("a");
        thread2.setName("b");
        thread3.setName("c");
        thread1.start();
        thread2.start();
        thread3.start();*/

        MyFood myFood = new MyFood();
        MyCook myCook = new MyCook();
        myCook.start();
        myFood.start();


    }
}
