package com.demo.idea.interfaceDemo.example;

import java.util.ArrayList;

/**
 * className: ClassManager
 * Package: com.demo.idea.interfaceDemo.example
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-12 - 16:54
 */
public class ClassManager {
    ArrayList<Student> students = new ArrayList<>();
    StudentOperator studentOperator = new StudentOperator2();

    public ClassManager(){
        students.add(new Student("aaa",'男',99));
        students.add(new Student("bb",'女',95));
        students.add(new Student("cc",'男',90.5));
    }

    public void printInfo(){
        studentOperator.printAllInfo(students);
    }
    public void printAverageAcore(){
        studentOperator.printAverageAcore(students);
    }

}
