package com.atgosse;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * className: ATM
 * Package: com.atgosse
 * Description:ATM系统
 *
 * @Author: 史传正
 * @Create: 2024-10-12 - 9:53
 */
public class ATM {
    private ArrayList<Account> accounts = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    //启动界面
    public void start() {
        while (true) {
            System.out.println("欢迎来到ATM系统");
            System.out.println("1、用户登录");
            System.out.println("2、用户开户");
            System.out.println("选择：");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //登录
                    login();
                    break;
                case 2:
                    //开户
                    creatAccount();
                    break;
                default:
                    System.out.println("输入错误");
            }
        }

    }

    private void creatAccount() {
        Account acc = new Account();
        System.out.println("输入用户名：");
        String name = sc.next();
        acc.setUserName(name);

        System.out.println("输入性别：");
        char sex = sc.next().charAt(0);//注意输入char的方式
        acc.setSex(sex);

        while (true) {
            System.out.println("输入密码：");
            String passWord = sc.next();
            System.out.println("输入确认密码：");
            String okPassWord = sc.next();
            if (passWord.equals(okPassWord)) {
                acc.setPassWord(passWord);
                break;
            } else {
                System.out.println("两次密码不一致，重新输入");
            }
        }

        System.out.println("输入每次取现额度：");
        double limit = sc.nextDouble();
        acc.setLimit(limit);

        //设置唯一卡号，重要
        String cardId = creatCardId();
        acc.setCardId(cardId);

        accounts.add(acc);
        System.out.println("恭喜" + acc.getUserName() + "开户完成，卡号是" + acc.getCardId());

        System.out.println();

    }

    private String creatCardId() {
        while (true) {
            String cardId = "";
            Random r = new Random();
            for (int i = 1; i <= 8; i++) {
                int data = r.nextInt(10);
                cardId += data;
            }
            if (getAccountByCardId(cardId) == null) {
                return cardId;
            }

        }
    }

    private Account getAccountByCardId(String id) {

        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if (acc.getCardId().equals(id))
                return acc;
        }
        return null;
    }

    private void login() {
        System.out.println("登录界面：");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("输入账号：");
            String cardId = sc.next();
            Account acc = getAccountByCardId(cardId);
            if (acc == null) {
                System.out.println("查无此账号，请重新输入");
            } else {
                while (true) {
                    System.out.println("输入密码：");
                    String passWord = sc.next();
                    if (passWord.equals(acc.getPassWord())) {
                        System.out.println("用户" + acc.getUserName() + "登录完成");
                    } else {
                        System.out.println("密码错误");
                    }
                }
            }


        }
    }

}
