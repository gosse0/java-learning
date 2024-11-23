package com.demo.idea.APIDemo.bigDigitDemo;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * className: BigIntergerDemo
 * Package: com.demo.idea.APIDemo.bigIntegerDemo
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-19 - 17:08
 */
public class BigDigitDemo {
    public static void main(String[] args) {
        //获取指定大数
        BigInteger bg1 = new BigInteger("5");
        //静态方法获取
        BigInteger bg2 = BigInteger.valueOf(3L);

        BigInteger[] mod2 = bg1.divideAndRemainder(bg2);
        System.out.println(mod2[1]);

        BigDecimal bd1 = new BigDecimal("1.25");
        BigDecimal bd2 = new BigDecimal("1.75");
        //内部储存方式：ASCII，以数组的方式存储
        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd1 +" "+ bd2 +" "+ bd3);

        int[] x= new int[10];



    }
}
