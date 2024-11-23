package com.demo.idea.ioDemo;

import java.io.*;

/**
 * @Author: 史传正
 * @Create: 2024-11-06-15:34
 * -------------------------
 * className: folderCopyDemo
 * Description:复制文件夹
 */
public class folderCopyDemo {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\Java\\javacode\\IDEADemo\\src\\com\\demo\\idea\\ioDemo\\aa");
        File dest = new File("D:\\Java\\javacode\\IDEADemo\\src\\com\\demo\\idea\\ioDemo\\bb");
        copydir(f,dest);



    }

    private static void copydir(File f, File dest) throws IOException {
        dest.mkdir();
        File[] files = f.listFiles();
        for (File file : files) {
            File newFile = new File(dest,file.getName());
            if(file.isFile()){
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(newFile);
                byte[] bytes = new byte[1024];
                int len = fis.read(bytes);
                fos.write(bytes, 0, len);
                fos.close();
                fis.close();
            }
            else {
                copydir(file,newFile);
            }
        }

        BufferedOutputStream b = new BufferedOutputStream(new FileOutputStream(""));
        b.close();


    }
}
