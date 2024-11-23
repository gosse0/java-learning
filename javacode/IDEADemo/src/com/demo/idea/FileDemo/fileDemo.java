package com.demo.idea.FileDemo;

import java.io.File;

/**
 * @Author: 史传正
 * @Create: 2024-11-04-17:17
 * -------------------------
 * className: fileDemo
 * Description:
 */
public class fileDemo {
    public static void main(String[] args) {
        String path = "D:\\桌面\\test.txt";
        File file = new File(path);
        System.out.println(file.isFile());
        System.out.println(file.length());

        System.out.println(file.getAbsoluteFile());

        File file2 = new File("src/com/demo/idea/HelloWorld.java");
        System.out.println(file2.getAbsoluteFile());
        System.out.println(file2.length());
        System.out.println(file2.isFile());


    }
}
