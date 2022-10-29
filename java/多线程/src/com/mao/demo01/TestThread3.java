package com.mao.demo01;

/**
 * @ClassName TestThread3
 * @Description TODO
 * @Author Huchao
 * @Date 2021/11/8 20:08
 * @Version 1.0
 **/

// 创建线程方式2： 实现 runnable 接口，重写run方法，执行线程需要丢入runnable接口实现类，调用start方法
public class TestThread3 implements Runnable {

    @Override
    public void run() {
        // run 方法线程题
        for (int i = 0; i < 200; i++) {
            System.out.println("我在看代码");
        }
    }

    public static void main(String[] args) {
        // 创建Runnable接口的实现类对象
        final TestThread3 testThread3 = new TestThread3();
        // 创建线程对象，通过线程对象来开启我们的线程，代理
        final Thread thread = new Thread(testThread3);
        thread.start();
//        new Thread(testThread3).start();

        for (int i = 0; i < 200; i++) {
            System.out.println("我在学习多线程--"+i);
        }
    }
}
