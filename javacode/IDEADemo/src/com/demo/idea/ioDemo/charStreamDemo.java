package com.demo.idea.ioDemo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * @Author: 史传正
 * @Create: 2024-11-06-10:59
 * -------------------------
 * className: demo
 * Description:字符流复制
 */
public class charStreamDemo {
    public static void main(String[] args) throws IOException {
        char[] c = {'a','b'};
        System.out.println(Arrays.toString(c));

        FileWriter fw = new FileWriter("src/com/demo/idea/ioDemo/mytest.txt",true);
        fw.write("d为佛教撒旦");
        fw.write(c);
        fw.close();



    }
}
