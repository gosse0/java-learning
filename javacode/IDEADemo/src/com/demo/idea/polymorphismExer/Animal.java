package com.demo.idea.polymorphismExer;

/**
 * className: Animal
 * Package: com.demo.idea.polymorphismExer
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-14 - 10:31
 */
public class Animal {
    private int age;
    private String color;

    public Animal() {
    }

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void eat(String something) {
        System.out.println("动物们在吃" + something);
    }
}
