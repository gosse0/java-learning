package com.demo.idea.socketNetDemo;

import java.io.IOException;
import java.net.*;

/**
 * @Author: 史传正
 * @Create: 2024-11-14-16:07
 * -------------------------
 * className: SendMessageDemo
 * Description:
 */
public class SendMessageDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        String str = "你好哇";
        byte[] bytes = str.getBytes();
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);
        ds.send(dp);
        ds.close();
    }
}
