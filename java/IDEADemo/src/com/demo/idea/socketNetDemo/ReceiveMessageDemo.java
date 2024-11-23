package com.demo.idea.socketNetDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @Author: 史传正
 * @Create: 2024-11-14-16:22
 * -------------------------
 * className: ReceiveMessageDemo
 * Description:
 */
public class ReceiveMessageDemo {
    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[1024];
        DatagramSocket ds = new DatagramSocket(10086);
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        ds.receive(dp);
        byte[] data = dp.getData();
        int len = dp.getLength();
        System.out.println(new String(data, 0,len));
        ds.close();


    }
}
