package com.demo.idea;

import com.demo.idea.APIDemo.ObjectDemo.People;

public class Hello {
    public static void main(String[] args) {
        P2 p = new P2();
        //System.out.println(p.info);//报错
    }
}

class P2 extends People{
    public void fun(){
        System.out.println(this.info);//可以
    }
}
