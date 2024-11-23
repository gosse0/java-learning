package com.demo.idea.stringDemo;

import java.util.Random;

/**
 * className: Captchar
 * Package: com.demo.idea.stringDemo
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-10 - 11:51
 */
public class Captchar {
    public static void main(String[] args) {
        String captchar = CreatCode(5);
        System.out.println("captchar = " + captchar);
    }
    public static String CreatCode(int n){
        String code = "";

        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random r = new Random();

        for (int i = 0; i < n; i++) {
            int index = r.nextInt(data.length());
            code += data.charAt(index);
        }
        return code;
    }
}
