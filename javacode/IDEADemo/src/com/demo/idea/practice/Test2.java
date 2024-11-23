package com.demo.idea.practice;

/**
 * className: Test2
 * Package: com.demo.idea.practice
 * Description:十进制转化为二进制
 *
 * @Author: 史传正
 * @Create: 2024-10-22 - 19:16
 */
public class Test2 {
    public static void main(String[] args) {
        int num = 8;
        String ans = myToBinaryString(num);
        System.out.println(ans);
    }

    private static String myToBinaryString(int num) {
        //创建StringBuilder来拼接余数
        StringBuilder sb = new StringBuilder();
        while(num != 0){
            int remainder = num % 2;
            sb.insert(0,remainder);
            num /= 2;
        }
        return sb.toString();
    }
}
