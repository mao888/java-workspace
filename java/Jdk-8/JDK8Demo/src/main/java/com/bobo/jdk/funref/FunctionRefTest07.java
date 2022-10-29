package com.bobo.jdk.funref;

import com.bobo.jdk.lambda.domain.Person;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionRefTest07 {

    public static void main(String[] args) {
        Function<Integer,String[]> fun1 = (len)->{
            return new String[len];
        };
        String[] a1 = fun1.apply(3);
        System.out.println("数组的长度是：" + a1.length);
        // 方法引用 的方式来调用数组的构造器
        Function<Integer,String[]> fun2 = String[]::new;
        String[] a2 = fun2.apply(5);
        System.out.println("数组的长度是：" + a2.length);
    }
}
