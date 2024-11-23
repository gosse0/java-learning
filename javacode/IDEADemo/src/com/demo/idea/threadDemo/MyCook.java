package com.demo.idea.threadDemo;

/**
 * @Author: 史传正
 * @Create: 2024-11-11-21:59
 * -------------------------
 * className: MyCook
 * Description:
 */
public class MyCook extends Thread {
    @Override
    public void run() {
        while(true){
            synchronized(Desk.lock){
                if(Desk.count == 0) break;
                if(Desk.foodFlag==1){
                    try {
                        Desk.lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                else {
                    System.out.println("做了碗面");
                    Desk.foodFlag = 1;
                    Desk.lock.notifyAll();
                }
            }
        }
    }
}
