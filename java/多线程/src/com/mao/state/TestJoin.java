package com.mao.state;

/**
 * @ClassName TestJoin
 * @Description TODO
 * @Author Huchao
 * @Date 2021/11/9 16:07
 * @Version 1.0
 **/
public class TestJoin implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程vip来了"+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // 启动我们的线程
        final TestJoin testJoin = new TestJoin();
        final Thread thread = new Thread(testJoin);

        // 主线程
        for (int i = 0; i < 200; i++) {
            if (i==100){
                thread.start();
                thread.join();  //插队
            }
            System.out.println("main:"+i);
        }
    }
}
