package com.demo.idea.stringDemo;

import java.util.Scanner;

/**
 * className: StringExer
 * Package: com.demo.idea.stringDemo
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-09 - 22:43
 */
public class StringExer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字符串：");
        String userName = sc.next();
        for (int i = 0; i < userName.length(); i++) {
            System.out.println(userName.charAt(i));//charAt进行读取
        }

    }
}
