package com.demo.idea.polymorphismExer;

/**
 * className: Cat
 * Package: com.demo.idea.polymorphismExer
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-14 - 10:39
 */
public class Cat extends Animal{
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的"+getColor()+"的猫抱着" + something +"吃");
    }
}
