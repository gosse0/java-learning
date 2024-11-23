package field.exp2;

/**
 * className: EmployeeTest
 * Package: exp2
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-07 - 10:36
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "gosse";
        emp1.birthday = new MyData();
        emp1.birthday.time = 10;
        emp1.birthday.todoList = "吃饭";

        emp1.play();
    }
}
