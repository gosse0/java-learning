package constructor;

/**
 * className: Customer
 * Package: constructor
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-08 - 11:03
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String f, String l) {
        firstName = f;
        lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account a) {
        account = a;
    }
}
