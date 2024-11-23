package com.demo.idea.socketNetDemo.practise.test3;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

/**
 * @Author: 史传正
 * @Create: 2024-11-16-22:21
 * -------------------------
 * className: MyRunnable
 * Description:
 */
public class MyRunnable implements Runnable{
    Socket socket;
    MyRunnable(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {

        try {
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
            String name = UUID.randomUUID().toString().replace("-","");
            String path = "src/com/demo/idea/socketNetDemo/practise/test3/"+ name +".png";
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path));
            int len;
            byte[] bytes = new byte[1024];
            while((len = bis.read(bytes)) != -1){
                bos.write(bytes, 0, len);
            }
            bos.close();
            //

            //回写
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("传输完成");
            bw.newLine();
            bw.write("已经结束辣");
            bw.flush();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }


        }

    }
}
