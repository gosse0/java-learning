package com.demo.idea.socketNetDemo.practise.test1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author: 史传正
 * @Create: 2024-11-14-22:13
 * -------------------------
 * className: Client
 * Description:
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",10086);
        OutputStream os = socket.getOutputStream();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            String str = sc.next();
            os.write(str.getBytes());
            if("886".equals(str)){
                break;
            }
        }
        os.close();
        socket.close();
    }
}
