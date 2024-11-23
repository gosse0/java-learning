package com.demo.idea.polymorphismExer;

/**
 * className: Test
 * Package: com.demo.idea.polymorphismExer
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-14 - 10:47
 */
public class Test {
    public static void main(String[] args) {
        Person p1 = new Person(40,"老王");
        Dog d1 = new Dog(2,"黑");
        Cat c1 = new Cat(3,"白");
        p1.keepCat(d1,"骨头");
        p1.keepCat(c1,"🐟");
    }
}
