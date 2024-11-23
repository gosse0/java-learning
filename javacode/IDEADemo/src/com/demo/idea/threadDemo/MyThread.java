package com.demo.idea.threadDemo;

/**
 * @Author: 史传正
 * @Create: 2024-11-10-12:12
 * -------------------------
 * className: MyThread
 * Description:
 */
public class MyThread extends Thread{

    static int ticket = 1;


    @Override
    public void run() {
        while (true){

            //在这里等
            synchronized (MyThread.class)
            {
                if(ticket>=10000) break;

                /*try {
                    sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }*/
                System.out.println(getName()+":" + ticket);
                ticket++;
            }


        }

    }
}
