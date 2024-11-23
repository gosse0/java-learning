package com.demo.idea.practice;

/**
 * @Author: 史传正
 * @Create: 2024-10-22-21:40
 * -------------------------
 * className: Test4
 * Description:二分查找
 */

public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] arr = {1,3,5,8,11,45,68};
        int index = binarySearch(arr, 68);
        System.out.println(index);
    }

    private static int binarySearch(int[] arr, int num) {
        int l = 0,r = arr.length - 1;
        while(l <= r){
            int mid = (l + r)/2;
            if(arr[mid] == num) return mid;
            if(arr[mid] < num) l = mid + 1;
            else r = mid -1;
        }
        return -1;
    }
}
