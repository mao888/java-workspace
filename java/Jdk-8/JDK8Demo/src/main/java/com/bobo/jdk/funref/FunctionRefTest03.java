package com.bobo.jdk.funref;

import java.util.Date;
import java.util.function.Supplier;

public class FunctionRefTest03 {

    public static void main(String[] args) {
        Date now = new Date();
        Supplier<Long> supplier = ()->{return now.getTime();};
        System.out.println(supplier.get());
        // 然后我们通过 方法引用 的方式来处理
        Supplier<Long> supplier1 = now::getTime;
        System.out.println(supplier1.get());
    }
}
