package com.bobo.jdk.res;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test10 {

    /**
     * 日期格式化
     */
    @Test
    public void test01(){
        LocalDateTime now = LocalDateTime.now();
        // 指定格式  使用系统默认的格式 2021-05-27T16:16:38.139
        DateTimeFormatter isoLocalDateTime = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        // 将日期时间转换为字符串
        String format = now.format(isoLocalDateTime);
        System.out.println("format = " + format);

        // 通过 ofPattern 方法来指定特定的格式
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format1 = now.format(dateTimeFormatter);
        // 2021-05-27 16:16:38
        System.out.println("format1 = " + format1);

        // 将字符串解析为一个 日期时间类型
        LocalDateTime parse = LocalDateTime.parse("1997-05-06 22:45:16", dateTimeFormatter);
        // parse = 1997-05-06T22:45:16
        System.out.println("parse = " + parse);
    }
}
