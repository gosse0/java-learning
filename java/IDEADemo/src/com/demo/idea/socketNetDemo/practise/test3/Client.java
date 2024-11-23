package com.demo.idea.socketNetDemo.practise.test3;

import java.io.*;
import java.net.Socket;

/**
 * @Author: 史传正
 * @Create: 2024-11-16-19:46
 * -------------------------
 * className: Client
 * Description:
 */



public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",10086);
        String path = "src/com/demo/idea/socketNetDemo/practise/test3/img.png";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));

        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        byte[] bytes = new byte[1024];
        int len;
        while((len = bis.read(bytes)) != -1){
            bos.write(bytes,0 , len);
        }
        bos.flush();

        socket.shutdownOutput();
        bis.close();



        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String str;
        while((str = br.readLine()) != null){
            System.out.println(str);
        }
        br.close();
        bos.close();
        bis.close();

        socket.close();


    }
}