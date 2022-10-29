package com.bobo.jdk.fun;

public class Demo01Fun {

    public static void main(String[] args) {
        fun1((arr)->{
            int sum = 0 ;
            for (int i : arr) {
                sum += i;
            }
            return sum;
        });
    }

    public static void fun1(Operator operator){
        int[] arr = {1,2,3,4};
        int sum = operator.getSum(arr);
        System.out.println("sum = " + sum);
    }
}

/**
 * 函数式接口
 */
@FunctionalInterface
interface Operator{

    int getSum(int[] arr);
}
