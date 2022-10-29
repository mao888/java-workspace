package com.bobo.jdk.stream;

import com.bobo.jdk.lambda.domain.Person;
import lombok.val;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest22Demo {

    /**
     * 1. 第一个队伍只保留姓名长度为3的成员
     * 2. 第一个队伍筛选之后只要前3个人
     * 3. 第二个队伍只要姓张的成员
     * 4. 第二个队伍筛选之后不要前两个人
     * 5. 将两个队伍合并为一个队伍
     * 6. 根据姓名创建Person对象
     * 7. 打印整个队伍的Person信息
     * @param args
     */

    public static void main(String[] args) {
        final List<String> stream = Stream.of("迪丽热巴", "宋远桥", "苏星河", "老子", "庄子", "孙子", "洪七 公")
                .collect(Collectors.toList());

        final Stream<String> stream1 = Stream.of("古力娜扎", "张无忌", "张三丰", "赵丽颖", "张二狗", "张天爱", "张三");

//        System.out.println(stream);
//        stream.forEach(System.out::println);

        //1. 第一个队伍只保留姓名长度为3的成员
        // 2. 第一个队伍筛选之后只要前3个人
//        final Stream<String> stream2 = stream.filter(s -> s.length() == 3).limit(3);

        //3. 第二个队伍只要姓张的成员
        //4. 第二个队伍筛选之后不要前两个人
//        final Stream<String> stream3 = stream1.filter(s -> s.startsWith("张")).skip(2);

        //5. 将两个队伍合并为一个队伍
        //6. 根据姓名创建Person对象
        //7. 打印整个队伍的Person信息
//        Stream.concat(stream2,stream3)
//                .map(n -> new Person(n))
//                .forEach(System.out::println);
    }
}
