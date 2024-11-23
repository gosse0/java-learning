package com.demo.idea.socketNetDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: 史传正
 * @Create: 2024-11-14-19:42
 * -------------------------
 * className: Server
 * Description:
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);

        Socket accept = ss.accept();
/*        InputStream is = accept.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);//缓冲流
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));

        int b;
        while((b = br.read()) != -1)
        {
            System.out.println((char)b);
        }
        br.close();
        ss.close();

    }
}
