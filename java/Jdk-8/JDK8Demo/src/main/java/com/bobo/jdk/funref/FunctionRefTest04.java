package com.bobo.jdk.funref;

import java.util.Date;
import java.util.function.Supplier;

public class FunctionRefTest04 {

    public static void main(String[] args) {
        Supplier<Long> supplier1 = ()->{
            return System.currentTimeMillis();
        };
        System.out.println(supplier1.get());

        // 通过 方法引用 来实现
        Supplier<Long> supplier2 = System::currentTimeMillis;
        System.out.println(supplier2.get());
    }
}
