package com.bobo.jdk.stream;

import java.util.stream.Stream;

public class StreamTest12Sorted {

    public static void main(String[] args) {
         Stream.of("1", "3", "2","4","0","9","7")
                 //.map(msg->Integer.parseInt(msg))
                 .map(Integer::parseInt)
                 //.sorted() // 根据数据的自然顺序排序
                 .sorted((o1,o2)->o2-o1) // 根据比较强指定排序规则
                 .forEach(System.out::println);

    }
}
