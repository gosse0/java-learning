package com.demo.idea.stringDemo;

/**
 * className: StringDemo1
 * Package: com.demo.idea.stringDemo
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-09 - 20:31
 */
public class StringDemo1 {
    public static void main(String[] args) {
        //直接赋值，会复用，所以String无法修改
        String s0 = "abc";
        String s1 = "abc";//地址相同，串池（字符串常量池）中的


        //使用char数组进行初始化
        char[] chars = {'a', 'b', 'c', 'd'};
        String s2 = new String(chars);
        System.out.println(s2);
        //字符串不能修改：s1[1]='c';错误，需要先变为字符数组，修改后再初始化拼接
//验证码

        //使用byte
        byte[] bytes = {97, 98, 99, 100};
        String s3 = new String(chars);
        System.out.println(s3);
    }
}
