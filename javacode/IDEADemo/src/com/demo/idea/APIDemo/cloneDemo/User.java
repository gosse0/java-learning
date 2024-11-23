package com.demo.idea.APIDemo.cloneDemo;

import java.util.StringJoiner;

/**
 * className: User
 * Package: com.demo.idea.APIDemo.cloneDemo
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-18 - 23:28
 */
public class User implements Cloneable{
    String name;
    int age;
    int[] arr;


    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }


    public User(String name, int age, int[] arr) {
        this.name = name;
        this.age = age;
        this.arr = arr;
    }

    public User() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                //  ", arr=" + Arrays.toString(arr) +
                ", arr=" + arrToString(arr) +
                '}';

    }

    public String arrToString(int[] arr){
        StringJoiner sj = new StringJoiner(",","[","]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i] + "");
        }
        return sj.toString();
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {

        int[] arr = this.arr;
        int[] data = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            data[i] = arr[i];
        }

        User u = (User) super.clone();
        u.arr = data;


        return u;
    }
}
