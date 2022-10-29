package com.bobo.jdk.res;

import org.junit.Test;

import java.time.Instant;

public class Test11 {

    /**
     * Instant 时间戳
     *    可以用来统计时间消耗
     */
    @Test
    public void test01() throws Exception{
        Instant now = Instant.now();
        System.out.println("now = " + now);

        // 获取从1970年一月一日 00:00:00 到现在的 纳秒
        System.out.println(now.getNano());
        Thread.sleep(5);
        Instant now1 = Instant.now();
        System.out.println("耗时：" + (now1.getNano() - now.getNano()));

    }
}
