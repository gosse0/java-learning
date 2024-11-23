package com.demo.idea.ioDemo;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: 史传正
 * @Create: 2024-11-09-0:01
 * -------------------------
 * className: webClawlerDemo
 * Description:
 */
public class webClawlerDemo {
    public static void main(String[] args) throws IOException {
        String FamilyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";

        String FamilyNameStr = webClawler(FamilyNameNet);
        //System.out.println(FamilyNameStr);

        ArrayList<String> data = getData(FamilyNameStr, "([\\u4e00-\\u9fa5]{4})，([\\u4e00-\\u9fa5]{4})。");
        System.out.println(data);


    }

    private static ArrayList<String> getData(String str, String regex) {
        ArrayList list = new ArrayList();
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(str);
        while(matcher.find()){
            list.add(matcher.group(1));
            list.add(matcher.group(2));
        }
        return list;


    }

    public static String webClawler(String net) throws IOException {
        StringBuilder sb = new StringBuilder();
        URL url = new URL(net);
        URLConnection conn = url.openConnection();

        InputStreamReader isr = new InputStreamReader(conn.getInputStream());
        int x;
        while((x = isr.read()) != -1){
            sb.append((char) x);
        }
        return sb.toString();


    }



}
