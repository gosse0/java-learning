package method;

/**
 * className: MethodTest
 * Package: method
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-07 - 11:12
 */
public class MethodTest {
    public static void main(String[] args) {

    }
}

class Person {
    String name;
    int age;

    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(int hour){
        System.out.println("我一天睡" + hour + "小时");
    }

}
