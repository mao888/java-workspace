package com.bobo.jdk.stream;

import com.bobo.jdk.lambda.domain.Person;

import java.util.stream.Stream;

public class StreamTest13Distinct {

    public static void main(String[] args) {
         Stream.of("1", "3", "3","4","0","1","7")
                 //.map(msg->Integer.parseInt(msg))
                 .map(Integer::parseInt)
                 //.sorted() // 根据数据的自然顺序排序
                 .sorted((o1,o2)->o2-o1) // 根据比较强指定排序规则
                 .distinct() // 去掉重复的记录
                 .forEach(System.out::println);
        System.out.println("--------");
        Stream.of(
                new Person("张三",18)
                ,new Person("李四",22)
                ,new Person("张三",18)
        ).distinct()
                .forEach(System.out::println);

    }
}
