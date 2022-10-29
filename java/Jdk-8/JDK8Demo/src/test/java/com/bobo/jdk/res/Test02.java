package com.bobo.jdk.res;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test02 {

    /**
     * 串行流
     */
    @Test
    public void test01(){
        Stream.of(5,6,8,3,1,6)
                .filter(s->{
                    System.out.println(Thread.currentThread() + "" + s);
                    return s > 3;
                }).count();
    }

    /**
     * 获取并行流的两种方式
     */
    @Test
    public void test02(){
        List<Integer> list = new ArrayList<>();
        // 通过List 接口 直接获取并行流
        Stream<Integer> integerStream = list.parallelStream();
        // 将已有的串行流转换为并行流
        Stream<Integer> parallel = Stream.of(1, 2, 3).parallel();
    }

    /**
     * 并行流操作
     */
    @Test
    public void test03(){

        Stream.of(1,4,2,6,1,5,9)
                .parallel() // 将流转换为并发流，Stream处理的时候就会通过多线程处理
                .filter(s->{
                    System.out.println(Thread.currentThread() + " s=" +s);
                    return s > 2;
                }).count();
    }
}
