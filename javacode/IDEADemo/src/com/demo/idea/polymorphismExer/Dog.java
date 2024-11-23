package com.demo.idea.polymorphismExer;

/**
 * className: Dog
 * Package: com.demo.idea.polymorphismExer
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-14 - 10:34
 */
public class Dog extends Animal {
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的"+getColor()+"的狗抱着" + something +"吃");
    }
}
