package com.demo.idea.abstructDemo;

/**
 * className: Animal
 * Package: com.demo.idea.abstructDemo
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-12 - 15:30
 */
public abstract class Animal {

    //多态实现的时候，上下相同，中间内容必须自己写的时候，使用抽象函数，使用户强制override
    public void write(){
        System.out.println("撞到石头");
        cry();
        System.out.println("balabala");
    }

    public abstract void cry();//类似纯虚函数
}
