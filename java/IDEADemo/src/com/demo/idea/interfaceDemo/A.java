package com.demo.idea.interfaceDemo;

/**
 * className: A
 * Package: com.demo.idea.interfaceDemo
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-12 - 15:53
 */
public interface A {
    //接口就是定义的一种规范
    //弥补单继承的不足，一个类可以同时实现多个接口
    //成员变量，默认就是常量
    String name="aaa";
    //成员方法，默认为抽象方法
    void testA();
}
