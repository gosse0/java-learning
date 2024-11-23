package com.demo.idea.socketNetDemo.practise.test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: 史传正
 * @Create: 2024-11-14-22:11
 * -------------------------
 * className: Server
 * Description:
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(10086);
        Socket accept = socket.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        int x;
        while((x = br.read()) != -1){
            System.out.print((char)x);
        }
        br.close();
        socket.close();




    }

}
