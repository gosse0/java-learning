package com.demo.idea.stringDemo;

/**
 * className: StringApi
 * Package: com.demo.idea.stringDemo
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-10 - 12:01
 */
public class StringApi {
    public static void main(String[] args) {
        String s = "myTest";
        //1  s.length()
        System.out.println("s.length() = " + s.length());
        //2  s.charAt
        System.out.println("s.charAt(2) = " + s.charAt(2));
        //3  s.toCharArray
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println("chars[" + i + "] = " + chars[i]);
        }
        //4  s.substring
        String s1 = s.substring(2);
        String s2 = s.substring(2, 4);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        //5 s.replace
        String info = "aabbccaaffaaffaarraa";
        String s3 = info.replace("aa", "dd");
        System.out.println("s3 = " + s3);

        //6 s.split
        String[] s4 = info.split("aa");
        for (int i = 0; i < s4.length; i++) {
            System.out.println("s4[" + i + "] = " + s4[i]);
        }

    }
}
