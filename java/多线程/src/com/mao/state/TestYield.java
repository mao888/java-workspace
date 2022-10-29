package com.mao.state;

/**
 * @ClassName TestYield
 * @Description TODO
 * @Author Huchao
 * @Date 2021/11/9 15:42
 * @Version 1.0
 **/
// 测试礼让线程
// 礼让不一定成功，看cpu心情
public class TestYield {
    public static void main(String[] args) {
        final MyYield myYield = new MyYield();
        new Thread(myYield,"a").start();
        new Thread(myYield,"b").start();
    }
}

class MyYield implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程开始执行");
//        Thread.yield(); // 礼让
        System.out.println(Thread.currentThread().getName()+"线程停止执行");
    }
}
