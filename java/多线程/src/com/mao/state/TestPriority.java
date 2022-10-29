package com.mao.state;

/**
 * @ClassName TestPriority
 * @Description TODO
 * @Author Huchao
 * @Date 2021/11/9 22:17
 * @Version 1.0
 **/
public class TestPriority {

    public static void main(String[] args) {
        // 主线程默认优先级
        System.out.println(Thread.currentThread().getName()+"-->"+Thread.currentThread().getPriority());

        final MyPriority myPriority = new MyPriority();

        final Thread thread1 = new Thread(myPriority);
        final Thread thread2 = new Thread(myPriority);
        final Thread thread3 = new Thread(myPriority);
        final Thread thread4 = new Thread(myPriority);
        final Thread thread5 = new Thread(myPriority);
        final Thread thread6 = new Thread(myPriority);

        // 先设置优先级，再启动
        thread1.start();

        thread2.setPriority(1);
        thread2.start();

        thread3.setPriority(4);
        thread3.start();

        thread4.setPriority(Thread.MAX_PRIORITY);
        thread4.start();

//        thread5.setPriority(-1);
//        thread5.start();
//
//        thread6.setPriority(11);
//        thread6.start();
//        if (newPriority > MAX_PRIORITY || newPriority < MIN_PRIORITY) {
//            throw new IllegalArgumentException();
//        }

    }
}

class MyPriority implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"-->"+Thread.currentThread().getPriority());
    }
}