import java.util.Arrays;

/**
 * className: test
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-06 - 13:00
 */
public class test {
    public static void main(String[] args) {
        /*
        数组的定义
        int[] arr = new int[5];
        arr[1]=4;
        int[] arr1 = arr;
        arr1[1] = 8;
        System.out.println("arr[1] = " + arr[1]);*/


        /*
         输入数组和字符串
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("a = " + a);

        String s = scanner.next();
        System.out.println("s = " + s);*/


        /*
        字符的遍历
        char[] letters = new char[26];
        System.out.println("letters.length = " + letters.length);
        for (int i = 0; i < letters.length; i++) {
            System.out.println("letters[i] = " + letters[i]);

        }*/
/*
        //输入数字，找最大
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] scores = new int[count];
        int maxScore = 0;
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
            maxScore= Math.max(maxScore, scores[i]);
        }
        System.out.println("最高分为：" + maxScore);
*/
/*
        //杨辉三角
        int[][] yangHui = new int[10][];

        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i+1];
        }

        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i][0] =yangHui[i][i] = 1;
        }

        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 1; j < i; j++) {
                yangHui[i][j] = yangHui[i-1][j-1] + yangHui[i-1][j];
            }
        }

        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j < yangHui[i].length; j++) {
                System.out.print(yangHui[i][j] + "\t");
            }
            System.out.println();
        }
*/
        //Arrays
        int[] arr1 = {1,5,3,4};
        int[] arr2 = new int[4];
        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;
        arr2[3] = 4;
        //int[] arr2 = {1,2,3,4,5};
        System.out.println(Arrays.equals(arr1,arr2));
        //Arrays.fill(arr1,0x3f3f3f3f);
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        Arrays.binarySearch(arr1,5);

        //Arrays.equals()

//        String name = new String();
//        System.out.println("name = " + name);
    }
}
