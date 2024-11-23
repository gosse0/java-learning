package com.demo.idea.practice;

import java.util.Arrays;

/**
 * @Author: 史传正
 * @Create: 2024-10-22-23:52
 * -------------------------
 * className: QuickSortDemo
 * Description:快排
 */
public class QuickSortDemo {
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 4, 2, 1, 6, 3, 2, 4, 5};
        quickSort(arr, 0, arr.length - 1);
        //Arrays.sort(arr);
        
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int l, int r) {
        if(l < r) {
            int num = arr[l];
            int start = l;
            int end = r;
            while (start != end) {
                while (arr[end] >= num && end != start) end--;
                if (start < end) arr[start++] = arr[end];
                while (arr[start] <= num && end != start) start++;
                if (start < end) arr[end--] = arr[start];
            }
            arr[end] = num; //直接将最左边的数移动
            quickSort(arr, l, end - 1);
            quickSort(arr, end + 1, r);
        }
    }

/*
    private static void quickSort(int[] arr, int l, int r) {
        if(l < r) {
            int num = arr[l];
            int start = l;
            int end = r;
            while (start != end) {
                while (arr[end] >= num && end != start) end--;
                while (arr[start] <= num && end != start) start++;
                int tem = arr[start];
                arr[start] = arr[end];
                arr[end] = tem;
            }
            arr[l] = arr[end];
            arr[end] = num;

            quickSort(arr, l, end - 1);
            quickSort(arr, end + 1, r);
        }
    }*/


}
