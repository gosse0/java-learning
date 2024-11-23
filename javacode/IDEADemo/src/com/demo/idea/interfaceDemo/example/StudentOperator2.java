package com.demo.idea.interfaceDemo.example;

import java.util.ArrayList;

/**
 * className: StudentOperator2
 * Package: com.demo.idea.interfaceDemo.example
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-12 - 20:43
 */
public class StudentOperator2 implements StudentOperator{

    @Override
    public void printAllInfo(ArrayList<Student> students) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if(s.getSex()=='男') count1++;
            else count2++;
        }
        System.out.println("男生有：" + count1+"，女生有：" + count2);
    }

    @Override
    public void printAverageAcore(ArrayList<Student> students) {
        double maxScore = students.get(0).getScore();
        double minScore = students.get(0).getScore();
        double allScore = 0.0;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            maxScore = Math.max(maxScore, s.getScore());
            minScore = Math.min(minScore, s.getScore());
            allScore += s.getScore();
        }
        System.out.println("平均：" + (allScore - minScore - maxScore)/(students.size()-2));
    }
}
