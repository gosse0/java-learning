package com.demo.idea.innerclassDemo;

/**
 * className: TEst
 * Package: com.demo.idea.innerclassDemo
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-15 - 11:01
 */
public class Test {
    public static void main(String[] args) {

        method(
                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("1111");
                    }
                }
        );

        new Swim(){
            @Override
            public void swim(){
                System.out.println("swing的匿名内部类");
            }
        }.swim();

        //lambda表达式形式
        method2(
                ()->{
                    System.out.println("sss");
                }
        );


    }

    public static void method(Animal a) {
        a.eat();
    }

    public static void method2(Swim a) {
        a.swim();
    }

}
