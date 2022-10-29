package com.bobo.jdk.res;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.stream.LongStream;

public class Test03 {

    private static long times = 500000000;

    private  long start;

    @Before
    public void befor(){
        start = System.currentTimeMillis();
    }

    @After
    public void end(){
        long end = System.currentTimeMillis();
        System.out.println("消耗时间：" + (end - start));
    }

    /**
     * 普通for循环 消耗时间：138
     */
    @Test
    public void test01(){
        System.out.println("普通for循环:");
        long res = 0;
        for (int i = 0; i < times; i++) {
            res += i;
        }
    }

    /**
     * 串行流处理
     *   消耗时间：203
     */
    @Test
    public void test02(){
        System.out.println("串行流：serialStream");
        LongStream.rangeClosed(0,times)
                .reduce(0,Long::sum);
    }

    /**
     * 并行流处理 消耗时间：84
     */
    @Test
    public void test03(){
        LongStream.rangeClosed(0,times)
                .parallel()
                .reduce(0,Long::sum);
    }
}
