package com.demo.idea.socketNetDemo.practise.test2;

import java.io.*;
import java.net.Socket;

/**
 * @Author: 史传正
 * @Create: 2024-11-15-22:21
 * -------------------------
 * className: Client
 * Description:
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",10086);
        //读取文件，inputstream
        String path = "src/com/demo/idea/socketNetDemo/practise/test2/img.png";
        BufferedInputStream bis = new BufferedInputStream( new FileInputStream(path));
        //上传文件至服务器
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        int x;


        while((x = bis.read()) != -1){
            bos.write(x);
        }
        bos.flush();
        socket.shutdownOutput();

        //接收回传信息
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = br.readLine();
        System.out.println(s);
        br.close();

        bis.close();
        socket.close();


    }
}
