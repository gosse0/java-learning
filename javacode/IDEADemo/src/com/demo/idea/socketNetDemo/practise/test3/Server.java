package com.demo.idea.socketNetDemo.practise.test3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: 史传正
 * @Create: 2024-11-16-19:46
 * -------------------------
 * className: Server
 * Description:
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);
        while(true){
            Socket socket = ss.accept();
            new Thread(new MyRunnable(socket)).start();
        }


    }
}
