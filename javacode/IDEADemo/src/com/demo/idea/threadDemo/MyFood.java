package com.demo.idea.threadDemo;

/**
 * @Author: 史传正
 * @Create: 2024-11-11-21:12
 * -------------------------
 * className: MyFood
 * Description:
 */
public class MyFood extends Thread{
    @Override
    public void run() {
        while(true){
            synchronized (Desk.lock){
                if(Desk.count==0) break;
                if(Desk.foodFlag==0){
                    try {
                        Desk.lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                else{
                    Desk.count--;
                    System.out.println("吃！还剩"+Desk.count);
                    Desk.foodFlag = 0;
                    Desk.lock.notifyAll();
                }
            }



        }
    }
}
