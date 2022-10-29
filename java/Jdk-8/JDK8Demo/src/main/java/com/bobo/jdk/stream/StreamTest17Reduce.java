package com.bobo.jdk.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamTest17Reduce {

    public static void main(String[] args) {
        Integer sum = Stream.of(4, 5, 3, 9)
                // identity默认值
                // 第一次的时候会将默认值赋值给x
                // 之后每次会将 上一次的操作结果赋值给x y就是每次从数据中获取的元素
                .reduce(0, (x, y) -> {
                    System.out.println("x="+x+",y="+y);
                    return x + y;
                });
        System.out.println(sum);
        // 获取 最大值
        Integer max = Stream.of(4, 5, 3, 9)
                .reduce(0, (x, y) -> {
                    return x > y ? x : y;
                });
        System.out.println(max);
    }
}
