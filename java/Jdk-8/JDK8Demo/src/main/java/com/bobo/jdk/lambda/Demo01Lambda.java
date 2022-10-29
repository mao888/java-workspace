package com.bobo.jdk.lambda;

public class Demo01Lambda {

    public static void main(String[] args) {
        // 开启一个新的线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("新线程中执行的代码 : "+Thread.currentThread().getName());
            }
        }).start();

        System.out.println("主线程中的代码：" + Thread.currentThread().getName());
        System.out.println("---------------");
        /*new Thread(() -> { System.out.println("新线程Lambda表达式..." +Thread.currentThread().getName()); })
                .start();*/
    }
}
