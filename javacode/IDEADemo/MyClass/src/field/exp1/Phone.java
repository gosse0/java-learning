package field.exp1;

/**
 * className: Phone
 * Package: atgosse.oop
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-07 - 0:24
 */
public class Phone {
    //属性
    String name;
    Double price;

    //方法
    public void call(){
        System.out.println("打电话");
    }

    public void call(int x){
        System.out.println("phone:" + x);
    }


    public void sendMessage(String message){
        System.out.println("发送信息："+message);
    }
}
