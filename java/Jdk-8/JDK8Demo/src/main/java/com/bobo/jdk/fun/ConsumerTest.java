package com.bobo.jdk.fun;

import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {
        test(msg -> {
            System.out.println(msg + "-> 转换为小写：" + msg.toLowerCase());
        });
    }

    public static void test(Consumer<String> consumer){
        consumer.accept("Hello World");
    }

    public static void test2(Consumer<String> c1,Consumer<String> c2){
        String str = "Hello World";
        c1.accept(str); // 转小写
        c2.accept(str); // 转大写
    }
}
