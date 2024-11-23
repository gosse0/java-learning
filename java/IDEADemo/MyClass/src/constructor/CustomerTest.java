package constructor;

/**
 * className: CustomerTest
 * Package: constructor
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-08 - 11:08
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer("张", "三");
        Account account = new Account(1000, 2000, 0.0123);
        customer1.setAccount(account);
        customer1.getAccount().deposit(100);
        customer1.getAccount().withdraw(960);
        customer1.getAccount().withdraw(2000);

    }
}
