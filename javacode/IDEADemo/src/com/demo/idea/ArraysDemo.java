package com.demo.idea;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: 史传正
 * @Create: 2024-10-23-10:33
 * -------------------------
 *
 * className: ArraysDemo
 * Description:
 */
public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        Arrays.sort(arr);
        Integer[] arr2 = {1, 56, 146, 48, 4, 86, 3, 53, 21, 1};
        Arrays.sort(arr2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        Arrays.sort(arr2, (Integer o1, Integer o2) -> {
                    return o1 - o2;
                }
        );
        Arrays.sort(arr2,(o1,o2)->o1-o2);

        System.out.println(Arrays.toString(arr2));


        //二分查找
        System.out.println(Arrays.binarySearch(arr, 0)); //0
        System.out.println(Arrays.binarySearch(arr, 8)); //8
        System.out.println(Arrays.binarySearch(arr, 20)); //-10，-应该放的-1，因为0会有误解

        //拷贝数组
        System.out.println("----------拷贝------------");
        int[] newArray1 = Arrays.copyOf(arr, 9);
        int[] newArray2 = Arrays.copyOf(arr, 11);
        int[] newArray3 = Arrays.copyOf(arr, 5);
        System.out.println(Arrays.toString(newArray1));
        System.out.println(Arrays.toString(newArray2));
        System.out.println(Arrays.toString(newArray3));

        //部分拷贝数组
        System.out.println("----------部分拷贝------------");
        int[] newArray4 = Arrays.copyOfRange(arr, 1, 3);//包括左边不包括右
        System.out.println(Arrays.toString(newArray4));

        //填充数组
        System.out.println("----------填充数组------------");
        Integer[] newArray5 = new Integer[5];
        Arrays.fill(newArray5, 0x3f3f3f3f);
        System.out.println(Arrays.toString(newArray5));
    }
}
