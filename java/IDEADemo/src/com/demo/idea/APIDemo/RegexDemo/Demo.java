package com.demo.idea.APIDemo.RegexDemo;

/**
 * className: Demo
 * Package: com.demo.idea.APIDemo.RegexDemo
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-21 - 19:19
 */
public class Demo {
    public static void main(String[] args) {
        //a1212sdiofjsdfa
        String regex1 = "(.).+\\1";
        System.out.println("a7538645645672a".matches(regex1));
        System.out.println("ac45345345454ac".matches(regex1));
        System.out.println("aa12345322134aa".matches(regex1));
        System.out.println("1dfsfsdfsdfeees".matches(regex1));

        //1122werwrwe1122
        System.out.println("----------------------");

        String regex2 = "(.+).+\\1";
        System.out.println("a7538645645672a".matches(regex2));
        System.out.println("ac45345345454ac".matches(regex2));
        System.out.println("aa12345322134aa".matches(regex2));
        System.out.println("1dfsfsdfsdfeees".matches(regex2));

        System.out.println("----------------------");

        String regex3 = "((.)\\2*).+\\1";
        System.out.println("a7538645645672a".matches(regex3));
        System.out.println("ac45345345454ac".matches(regex3));
        System.out.println("aa12345322134aa".matches(regex3));
        System.out.println("1dfsfsdfsdfeees".matches(regex3));

    }
}
