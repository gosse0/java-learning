package com.demo.idea.threadDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: 史传正
 * @Create: 2024-11-11-12:39
 * -------------------------
 * className: MyLock
 * Description:
 */
public class MyLock extends Thread {
    static int ticket = 0;
    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while(true)
        {
            lock.lock();
            try {
                if (ticket == 200) break;
                Thread.sleep(10);
                ticket++;
                System.out.println(getName() + ticket);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }

        }
    }
}
