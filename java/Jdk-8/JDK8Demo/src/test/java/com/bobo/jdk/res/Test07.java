package com.bobo.jdk.res;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test07 {

    /**
     * 旧版日期时间设计的问题
     */
    @Test
    public void test01() throws Exception{
        // 1.设计不合理
        Date date = new Date(2021,05,05);
        System.out.println(date);

        // 2.时间格式化和解析操作是线程不安全的
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (int i = 0; i < 50; i++) {
            new Thread(()->{
               // System.out.println(sdf.format(date));
                try {
                    System.out.println(sdf.parse("2021-05-06"));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
