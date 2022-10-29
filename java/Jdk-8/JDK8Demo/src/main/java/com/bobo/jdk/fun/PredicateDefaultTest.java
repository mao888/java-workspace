package com.bobo.jdk.fun;

import java.util.function.Predicate;

public class PredicateDefaultTest {

    public static void main(String[] args) {
        test(msg1 -> {
            return msg1.contains("H");
        },msg2 -> {
            return msg2.contains("W");
        });
    }

    private static void test(Predicate<String> p1,Predicate<String> p2){
        /*boolean b1 = predicate.test(msg);
        boolean b2 = predicate.test("Hello");*/
        // b1 包含H b2 包含W
        // p1 包含H 同时 p2 包含W
        boolean bb1 = p1.and(p2).test("Hello");
        // p1 包含H 或者 p2 包含W
        boolean bb2 = p1.or(p2).test("Hello");
        // p1 不包含H
        boolean bb3 = p1.negate().test("Hello");
        System.out.println(bb1); // FALSE
        System.out.println(bb2); // TRUE
        System.out.println(bb3); // FALSE
    }
}
