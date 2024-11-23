package com.demo.idea.StreamDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: 史传正
 * @Create: 2024-11-03-16:45
 * -------------------------
 * className: practise
 * Description:
 */
public class practice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);

        List<Integer> collect = list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(collect);


    }
}
