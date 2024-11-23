package encapsulation;

/**
 * className: AnimalTest
 * Package: encapsulation
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-07 - 21:26
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.setLeg(5);
        animal1.showLeg();
    }
}

class Animal {
    String name;
    private int leg;


    public void setLeg(int num) {
        if (num < 0 || num % 2 != 0) {
            System.out.println("输入不合法");
        } else
            leg = num;
    }

    public int getLeg() {
        return leg;
    }

    public void showLeg() {
        System.out.println("leg:" + leg);
    }

}

