package com.mao.state;

/**
 * @ClassName TestSleep
 * @Description TODO
 * @Author Huchao
 * @Date 2021/11/9 15:14
 * @Version 1.0
 **/

// 多个线程同时操作同一个对象
// 买火车票的例子
// 发现问题：多个线程操作同一个资源的情况下，线程不安全，数据紊乱
public class TestSleep implements Runnable{

    // 票数
    private int ticketNums = 10;

    @Override
    public void run() {
        while (true){
            if (ticketNums<=0){
                break;
            }
            // 模拟网络延时，放大问题的发生性
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-->拿到了第"+ticketNums--+"票");
        }
    }

    public static void main(String[] args) {
        final com.mao.demo01.TestThread4 testThread4 = new com.mao.demo01.TestThread4();
        new Thread(testThread4,"超哥").start();
        new Thread(testThread4,"废物凤").start();
        new Thread(testThread4,"黄牛").start();
    }
}
