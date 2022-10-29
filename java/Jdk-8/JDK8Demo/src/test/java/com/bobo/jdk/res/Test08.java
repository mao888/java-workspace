package com.bobo.jdk.res;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test08 {

    /**
     * JDK8 日期时间操作
     */
    @Test
    public void test01(){
        // 1.创建指定的日期
        LocalDate date1 = LocalDate.of(2021, 05, 06);
        System.out.println("date1 = "+date1);

        // 2.得到当前的日期
        LocalDate now = LocalDate.now();
        System.out.println("now = "+now);

        // 3.根据LocalDate对象获取对应的日期信息
        System.out.println("年：" + now.getYear());
        System.out.println("月：" + now.getMonth().getValue());
        System.out.println("日：" + now.getDayOfMonth());
        System.out.println("星期：" + now.getDayOfWeek().getValue());
    }

    /**
     * 时间操作
     */
    @Test
    public void test02(){
        // 1.得到指定的时间
        LocalTime time = LocalTime.of(5,26,33,23145);
        System.out.println(time);
        // 2.获取当前的时间
        LocalTime now = LocalTime.now();
        System.out.println(now);
        // 3.获取时间信息
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getNano());
    }

    /**
     * 日期时间类型  LocalDateTime
     */
    @Test
    public void test03(){
        // 获取指定的日期时间
        LocalDateTime dateTime =
                LocalDateTime.of(2020
                        , 06
                        , 01
                        , 12
                        , 12
                        , 33
                        , 213);
        System.out.println(dateTime);
        // 获取当前的日期时间
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        // 获取日期时间信息
        System.out.println(now.getYear());
        System.out.println(now.getMonth().getValue());
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getDayOfWeek().getValue());
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getNano());
    }
}
