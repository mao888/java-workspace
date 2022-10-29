package com.bobo.jdk.fun;

import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {
        test(msg -> {
            return msg.length() > 3;
        },"HelloWorld");
    }

    private static void test(Predicate<String> predicate,String msg){
        boolean b = predicate.test(msg);
        System.out.println("b:" + b);
    }
}
