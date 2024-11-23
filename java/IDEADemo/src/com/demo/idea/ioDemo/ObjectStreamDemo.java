package com.demo.idea.ioDemo;


import java.io.*;
import java.util.ArrayList;

/**
 * @Author: 史传正
 * @Create: 2024-11-07-19:39
 * -------------------------
 * className: ObjectStreamDemo
 * Description:
 */
public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/com/demo/idea/ioDemo/a.txt"));
        Student s1 = new Student(18,"sdifjasf");
        Student s2 = new Student(13,"sdsdafasdff");
        Student s3 = new Student(15,"sasf");
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        oos.writeObject(list);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/com/demo/idea/ioDemo/a.txt"));
        ArrayList<Student> array = (ArrayList<Student>) ois.readObject();
        for (Student student : array) {
            System.out.println(student);
        }



    }
}
