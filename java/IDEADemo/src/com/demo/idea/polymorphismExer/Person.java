package com.demo.idea.polymorphismExer;

/**
 * className: Person
 * Package: com.demo.idea.polymorphismExer
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-14 - 10:41
 */
public class Person {
    private int age;
    private String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void keepCat(Animal animal, String something)
    {
        String typeName = "";
        if(animal instanceof Dog) typeName = "狗";
        else if(animal instanceof Cat) typeName = "猫";
        else System.out.println("查无此动物");
        System.out.println(getAge()+"岁的"+getName()+"养了" + animal.getAge() + "岁的" + animal.getColor() + "颜色的"+typeName);
        animal.eat(something);
    }

}
