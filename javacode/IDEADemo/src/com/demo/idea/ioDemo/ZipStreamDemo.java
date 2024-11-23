package com.demo.idea.ioDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * @Author: 史传正
 * @Create: 2024-11-08-11:19
 * -------------------------
 * className: ZipStreamDemo
 * Description:
 */
public class ZipStreamDemo {
    public static void main(String[] args) throws IOException {
        File src = new File("src/com/demo/idea/ioDemo/testZip.zip");
        File dest = new File("src/com/demo/idea/ioDemo/");

        ZipInputStream zis = new ZipInputStream(new FileInputStream(src));
        ZipEntry entry;
        while((entry = zis.getNextEntry()) != null)
        {
            System.out.println(entry.toString());
            if(entry.isDirectory()){
                File file = new File(dest,entry.toString());
                file.mkdir();
            }
            else{
                FileOutputStream fos = new FileOutputStream(new File(dest,entry.toString()));
                int b;
                while((b = zis.read()) != -1){
                    fos.write(b);
                }
                fos.close();
            }
            zis.closeEntry();
        }
        zis.close();


    }
}
