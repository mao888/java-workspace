package com.bobo.jdk.res;

import org.junit.Test;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test13 {

    /**
     * 时区操作
     */
    @Test
    public void test01(){
        // 1.获取所有的时区id
        // ZoneId.getAvailableZoneIds().forEach(System.out::println);

        // 获取当前时间 中国使用的 东八区的时区，比标准时间早8个小时
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now); // 2021-05-27T17:17:06.951
        // 获取标准时间
        ZonedDateTime bz = ZonedDateTime.now(Clock.systemUTC());
        System.out.println("bz = " + bz); // 2021-05-27T09:17:06.952Z

        // 使用计算机默认的时区，创建日期时间
        ZonedDateTime now1 = ZonedDateTime.now();
        System.out.println("now1 = " + now1); //2021-05-27T17:17:06.952+08:00[Asia/Shanghai]

        // 使用指定的时区创建日期时间
        ZonedDateTime now2 = ZonedDateTime.now(ZoneId.of("America/Marigot"));
        System.out.println("now2 = " + now2);

    }
}
