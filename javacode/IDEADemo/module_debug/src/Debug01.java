/**
 * className: Debug01
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-05 - 21:18
 */
public class Debug01 {
    public static void main(String[] args) {
        int m = 10;
        int n = 5;
        System.out.println("m = "+ m + ",n = "+ n);

        swap(m, n);
        System.out.println("m = "+ m + ",n = "+ n);
        

    }
    //private int id = 9;
    private static void swap(int m, int n) {
        int temp = m;

        m = n;
        n = temp;
    }
}
