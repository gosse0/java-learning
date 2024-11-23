package field.exp2;

/**
 * className: Employeee
 * Package: exp2
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-07 - 10:35
 */
public class Employee {
    String name;
    MyData birthday;
    public void play() {
        System.out.println(name + "在" + birthday.time + "点去" + birthday.todoList);
    }
}
