package com.demo.idea.interfaceDemo.example;

import java.util.ArrayList;

/**
 * className: StudentOperator1
 * Package: com.demo.idea.interfaceDemo.example
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-12 - 20:37
 */
public class StudentOperator1 implements StudentOperator{

    @Override
    public void printAllInfo(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println(s.getName()+ s.getSex() +s.getScore());
        }
    }

    @Override
    public void printAverageAcore(ArrayList<Student> students) {
        double allScore = 0.0;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            allScore +=s.getScore();
        }
        System.out.println("平均：" + allScore/students.size());
    }
}
