package com.demo.idea.StreamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author: 史传正
 * @Create: 2024-11-02-19:02
 * -------------------------
 * className: StreamDemo
 * Description:
 */
public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "111", "222", "1222", "112","145451", "11", "111");

        //限定
        list.stream()
                .filter(s -> s.startsWith("11"))
                .filter(s->s.length()==3)
                .forEach(System.out::println);
                //.forEach(s -> System.out.println(s));



        //选择前n个
        System.out.println("--------选择前n个---------");
        list.stream().limit(4).forEach(s -> System.out.println(s));

        //跳过前n个
        System.out.println("--------跳过前n个---------");
        list.stream().skip(2).forEach(s -> System.out.println(s));

        //去重
        System.out.println("--------去重---------");
        list.stream().distinct().forEach(System.out::println);

        System.out.println(list.stream().count());

        //转化为数组

        list.stream().toArray(value -> new String[value]);
        //list.toArray(String[]::new);


        //引用
        System.out.println("--------引用转化为数组---------");
        list.stream().map(Integer::parseInt).forEach(System.out::println);

        System.out.println("--------引用构造方法---------");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"张三-11", "李四-12", "王五-13", "赵六-17");
        List<Student> StudentList = list2.stream().map(Student::new).toList();
        // List<Student> StudentList = list2.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(StudentList);


        System.out.println("--------学生集合将姓名放到数组中---------");
        ArrayList<Student> test = new ArrayList<>();
        test.add(new Student("张三",11));
        test.add(new Student("李四",14));
        test.add(new Student("王五",12));
        String[] arr = test.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(arr));


    }
}
