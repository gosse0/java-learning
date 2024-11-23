package com.demo.idea.practice;

/**
 * className: Test1
 * Package: com.demo.idea.practice
 * Description:将字符串转换为整数，最少一位，最多十位，0不能开头
 *
 * @Author: 史传正
 * @Create: 2024-10-22 - 19:03
 */
public class Test1 {
    public static void main(String[] args) {
        String str = "123456"; //"011211"、"a1213"

        if (!str.matches("[1-9]\\d{0,9}")) {
            System.out.println("format is incorrect");
        } else {
            int num = Integer.parseInt(str);
            System.out.println(num);
        }

    }
}
