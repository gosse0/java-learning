package com.demo.idea.socketNetDemo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author: 史传正
 * @Create: 2024-11-14-18:55
 * -------------------------
 * className: Client
 * Description:
 */
public class Client {
    public static void main(String[] args) throws IOException {
        //socket对象链接服务器
        Socket socket = new Socket("127.0.0.1",10086);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("你好".getBytes());
        outputStream.close();
        socket.close();



    }
}
