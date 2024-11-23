package com.demo.idea.ioDemo;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @Author: 史传正
 * @Create: 2024-11-07-11:25
 * -------------------------
 * className: ioSortDemo
 * Description:将txt文档中的文字变有序
 */
public class ioSortDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/com/demo/idea/ioDemo/aritcal.txt"));
        String str;
        TreeMap<Integer, String> tm = new TreeMap<>();
        while((str = br.readLine()) != null){
            int num = Integer.parseInt(str.split("\\.")[0]);
            String content = str.split("\\.")[1];
            tm.put(num, content);
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter("src/com/demo/idea/ioDemo/result.txt"));
        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            bw.write(entry.getValue());
            bw.newLine();
        }
        bw.close();


    }
}
