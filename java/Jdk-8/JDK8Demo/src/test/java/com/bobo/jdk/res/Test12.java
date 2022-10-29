package com.bobo.jdk.res;

import org.junit.Test;

import java.time.*;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Test12 {

    /**
     * 计算日期时间差
     */
    @Test
    public void test01(){
        // 计算时间差
        LocalTime now = LocalTime.now();
        LocalTime time = LocalTime.of(22, 48, 59);
        System.out.println("now = " + now);
        // 通过Duration来计算时间差
        Duration duration = Duration.between(now, time);
        System.out.println(duration.toDays()); // 0
        System.out.println(duration.toHours()); // 6
        System.out.println(duration.toMinutes()); // 368
        System.out.println(duration.toMillis()); // 22124240

        // 计算日期差
        LocalDate nowDate = LocalDate.now();
        LocalDate date = LocalDate.of(1997, 12, 5);
        Period period = Period.between(date, nowDate);
        System.out.println(period.getYears()); // 23
        System.out.println(period.getMonths()); // 5
        System.out.println(period.getDays()); // 22
    }

    /**
     * 时间校正器
     */
    @Test
    public void test02(){
        LocalDateTime now = LocalDateTime.now();
        // 将当前的日期调整到下个月的一号
        TemporalAdjuster adJuster = (temporal)->{
            LocalDateTime dateTime = (LocalDateTime) temporal;
            LocalDateTime nextMonth = dateTime.plusMonths(1).withDayOfMonth(1);
            System.out.println("nextMonth = " + nextMonth);
            return nextMonth;
        };
        // 我们可以通过TemporalAdjusters 来实现
        // LocalDateTime nextMonth = now.with(adJuster);
        LocalDateTime nextMonth = now.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println("nextMonth = " + nextMonth);
    }
}
