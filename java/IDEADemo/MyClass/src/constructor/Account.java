package constructor;

/**
 * className: Account
 * Package: constructor
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-08 - 10:56
 */
public class Account {
    private int id;
    private double balance;
    private double annuallnterestRate;

    public Account(int i,double b, double a)
    {
        id = i;
        balance = b;
        annuallnterestRate = a;
    }

    public int getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

    public double getAnnuallnterestRate() {
        return annuallnterestRate;
    }

    public void setId(int i){
        id = i;
    }

    public void setBalance(double b){
        balance = b;
    }
    public void setAnnuallnterestRate(double a){
        annuallnterestRate = a;
    }

    public void withdraw(double amount){
        if(balance<=amount){
            System.out.println("余额不足");
        }
        else {
            balance -= amount;
            System.out.println("取出：" + amount + "余额：" + balance);
        }

    }

    public void deposit(double amount){
        balance +=amount;
        System.out.println("存入：" + amount + "余额：" + balance);
    }

}
