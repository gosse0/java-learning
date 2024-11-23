package com.demo.idea.threadDemo;

/**
 * @Author: 史传正
 * @Create: 2024-11-10-15:40
 * -------------------------
 * className: MyRunnable
 * Description:
 */
public class MyRunnable implements Runnable{

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 0; i < 100; i++) {
            System.out.println(t.getName()+"hello");
        }
    }
}
