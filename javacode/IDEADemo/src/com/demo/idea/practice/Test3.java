package com.demo.idea.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * className: Test3
 * Package: com.demo.idea.practice
 * Description:计算活了多少天
 *
 * @Author: 史传正
 * @Create: 2024-10-22 - 20:44
 */
public class Test3 {
    public static void main(String[] args) throws ParseException {

        //JDK7
        String birthday = "2001年6月2日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date data = sdf.parse(birthday);
        long birthdayTime = data.getTime();
        //当前时间
        long currentTime = System.currentTimeMillis();
        //时间差
        long time = currentTime - birthdayTime;
        System.out.println(time/1000/60/60/24);


        //JDK8
        LocalDate ld1 = LocalDate.of(2001,6,2);
        LocalDate ld2 = LocalDate.now();
        long days = ChronoUnit.DAYS.between(ld1,ld2);
        System.out.println(days);

    }
}
