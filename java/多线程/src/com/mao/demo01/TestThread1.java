package com.mao.demo01;

/**
 * @ClassName TestThread1
 * @Description TODO
 * @Author Huchao
 * @Date 2021/11/7 16:21
 * @Version 1.0
 **/
/**
 * 创建线程方式一：继承Thread类，重写run()方法，调用start开启线程
 *
 * 总结：注意，线程开启不一定立即执行，有由cpu调度执行
 **/
public class TestThread1 extends Thread {
    @Override
    public void run() {
       // run 方法体线程
        for (int i = 0; i < 10; i++) {
            System.out.println("我在看代码----" + i);
        }
    }

    public static void main(String[] args) {

        // 创建一个线程
        final TestThread1 testThread1 = new TestThread1();

        // start 开启线程
        testThread1.start();
//        testThread1.run();

        // 主线程
        for (int i = 0; i < 200; i++) {
            System.out.println("我在学习多线程----"+i);
        }
    }
}
