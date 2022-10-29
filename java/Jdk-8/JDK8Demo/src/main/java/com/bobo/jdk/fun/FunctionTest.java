package com.bobo.jdk.fun;

import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {
        test(msg ->{
            return Integer.parseInt(msg);
        });
    }

    public static void test(Function<String,Integer> function){
        Integer apply = function.apply("666");
        System.out.println("apply = " + apply);
    }
}
