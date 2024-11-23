package com.demo.idea.socketNetDemo.practise.test2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: 史传正
 * @Create: 2024-11-15-22:21
 * -------------------------
 * className: Server
 * Description:
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10086);
        Socket socket = serverSocket.accept();

        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/com/demo/idea/socketNetDemo/practise/test2/copy.png"));
        int x;
        while((x = bis.read()) != -1){
            bos.write(x);
            //System.out.print((char)x);
        }
        //socket.shutdownOutput();
        bos.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("传完了");
        bw.newLine();
        bw.flush();


        socket.close();
        serverSocket.close();


    }
}
