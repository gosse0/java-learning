package com.atgosse;

/**
 * className: Account
 * Package: com.atgosse
 * Description:账号信息
 *
 * @Author: 史传正
 * @Create: 2024-10-12 - 9:50
 */
public class Account {
    private String cardId;
    private String userName;
    private String passWord;
    private char sex;
    private double money;
    private double limit;

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public String getCardId() {
        return cardId;
    }

    public String getUserName() {
        return userName + (sex == '男' ? "先生" : "女士");
    }

    public char getSex() {
        return sex;
    }

    public double getMoney() {
        return money;
    }

    public double getLimit() {
        return limit;
    }
}
