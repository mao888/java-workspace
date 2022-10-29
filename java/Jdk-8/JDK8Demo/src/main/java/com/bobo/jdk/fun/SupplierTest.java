package com.bobo.jdk.fun;

import java.util.Arrays;
import java.util.function.Supplier;

/**
 * Supplier 函数式接口的使用
 */
public class SupplierTest {

    public static void main(String[] args) {
        fun1(()->{
            int arr[] = {22,33,55,66,44,99,10};
            // 计算出数组中的最大值
            Arrays.sort(arr);
            return arr[arr.length-1];
        });
    }

    private static void fun1(Supplier<Integer> supplier){
        // get() 是一个无参的有返回值的 抽象方法
        Integer max = supplier.get();
        System.out.println("max = " + max);

    }
}
