package com.demo.idea.practice;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * className: Test
 * Package: com.demo.idea.practice
 * Description:整行输入，包装的parseInt进行转化
 *
 * @Author: 史传正
 * @Create: 2024-10-22 - 18:48
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int sumNum = 0;
        while (true) {
            System.out.println("输入数字0-100");
            String numString = sc.nextLine();
            int num = Integer.parseInt(numString); //包装类
            if (num < 0 || num > 100) {
                System.out.println("输入出错");
                continue;
            }
            list.add(num);
            sumNum += num;
            if(sumNum >300) {
                System.out.println("可以输出了");
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
