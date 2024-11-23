package com.demo.idea.ioDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: 史传正
 * @Create: 2024-11-05-20:48
 * -------------------------
 * className: test
 * Description:字节流复制
 */
public class bytestreamDemo {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("src/com/demo/idea/ioDemo/mytest.txt",true);
        byte[] bytes = "\r\nsadfasfsdf".getBytes();
        fos.write(bytes);
        fos.close();

        FileInputStream fis = new FileInputStream("src/com/demo/idea/ioDemo/mytest.txt");
        int x = fis.read();
        while(x!=-1){
            System.out.print((char)x);
            x = fis.read();
        }
        fis.close();


    }
}
