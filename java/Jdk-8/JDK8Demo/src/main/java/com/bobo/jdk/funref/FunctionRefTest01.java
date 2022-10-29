package com.bobo.jdk.funref;

import java.util.function.Consumer;

public class FunctionRefTest01 {

    public static void main(String[] args) {
        printMax(a->{
            // Lambda表达式中的代码和 getTotal中的代码冗余了
            int sum = 0;
            for (int i : a) {
                sum += i;
            }
            System.out.println("数组之和：" + sum);
        });
    }

    /**
     * 求数组中的所有元素的和
     * @param a
     */
    public void getTotal(int a[]){
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        System.out.println("数组之和：" + sum);
    }

    private static void printMax(Consumer<int[]> consumer){
        int[] a= {10,20,30,40,50,60};
        consumer.accept(a);
    }
}
