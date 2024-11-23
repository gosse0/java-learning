package com.demo.idea.APIDemo.cloneDemo;

import com.google.gson.Gson;

import java.util.Objects;

/**
 * className: Test
 * Package: com.demo.idea.APIDemo.cloneDemo
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-18 - 23:30
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] data = {1,2,3,4,5,6};
        User u1 = new User("aaa",12,data);
        //Object u2 = u1.clone();
        User u2 = (User) u1.clone();//浅拷贝->深拷贝
        //data[0]=9;
        System.out.println(u2);

        //第三方工具
        Gson gson = new Gson();
        String s = gson.toJson(u1);
        System.out.println(s);
        User user = gson.fromJson(s, User.class);
        data[0]=10;
        System.out.println(user);
        System.out.println(u2);

        //Objects
        System.out.println(Objects.equals(u2, user));//使用Objects的equals可以防止null的报错，比较的是地址值

    }
}
