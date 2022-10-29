package com.mao.demo01;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @ClassName TestThread
 * @Description TODO
 * @Author HuChao
 * @Date 2021/11/8 20:40
 * @Version 1.0
 **/

// 多个线程同时操作同一个对象
// 买火车票的例子
// 发现问题：多个线程操作同一个资源的情况下，线程不安全，数据紊乱
public class TestThread4 implements Runnable{

    // 票数
    private int ticketNums = 10;

    @Override
    public void run() {
        while (true){
            if (ticketNums<=0){
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-->拿到了第"+ticketNums--+"票");
        }
    }

    public static void main(String[] args) {
        final TestThread4 testThread4 = new TestThread4();
        new Thread(testThread4,"超哥").start();
        new Thread(testThread4,"废物凤").start();
        new Thread(testThread4,"黄牛").start();
    }
}
