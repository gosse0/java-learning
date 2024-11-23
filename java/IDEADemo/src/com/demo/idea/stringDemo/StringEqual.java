package com.demo.idea.stringDemo;

/**
 * className: StringEqual
 * Package: com.demo.idea.stringDemo
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-09 - 22:30
 */
public class StringEqual {
    public static void main(String[] args) {
        String s1 = new String("str");//堆区
        String s2 = "Str"; //串池中
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));//只看内容
        System.out.println(s1.equalsIgnoreCase(s2));//忽略大小写


    }
}
