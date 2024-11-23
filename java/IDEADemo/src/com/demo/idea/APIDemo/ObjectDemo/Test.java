package com.demo.idea.APIDemo.ObjectDemo;

/**
 * className: Test
 * Package: com.demo.idea.APIDemo.ObjectDemo
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-18 - 13:24
 */
public class Test {
    public static void main(String[] args) {
        People p = new People("zhangsan",20);

        System.out.println(p);

        People p2 = new People("zhangsan",20);
        boolean flag = p.equals(p2);
        System.out.println(flag);

        String s1 = new String("1111");
        StringBuilder s2 = new StringBuilder("1111");
        System.out.println(s1.equals(s2));//string的equals是先比较是不是一个类型，其次才是内容

        System.out.println(s2.equals(s1));//StringBuilder是继承Object，直接比较地址


        System.out.println(p.info);

    }
}
