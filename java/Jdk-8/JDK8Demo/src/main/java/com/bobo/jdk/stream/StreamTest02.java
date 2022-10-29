package com.bobo.jdk.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamTest02 {

    public static void main(String[] args) {
        // 定义一个List集合
        List<String> list = Arrays.asList("张三","张三丰","成龙","周星驰");
        // 1.获取所有 姓张的信息
        // 2.获取名称长度为3的用户
        // 3. 输出所有的用户信息
        list.stream()
                .filter(s->s.startsWith("张"))
                .filter(s->s.length() == 3)
                .forEach(s->{
                    System.out.println(s);
                });
        System.out.println("----------");
        list.stream()
                .filter(s->s.startsWith("张"))
                .filter(s->s.length() == 3)
                .forEach(System.out::println);
    }
}
