package field.exp1;

/**
 * className: PhoneTest
 * Package: atgosse.oop
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-07 - 0:27
 */
public class PhoneTest {
    public static void main(String[] args) {
        Phone myPhone = new Phone();
        myPhone.name = "荣耀30";
        myPhone.price = 99999.99;
        myPhone.sendMessage("你好哇");
        myPhone.call(5);
    }



}
