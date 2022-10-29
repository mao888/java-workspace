package com.mao.state;

/**
 * @ClassName TestStop
 * @Description TODO
 * @Author Huchao
 * @Date 2021/11/9 13:40
 * @Version 1.0
 **/

//测试stop
//1.建议线程正常停止--->利用次数,不建议死循环。1/2。建议使用标志位--->设置一个标志位
//3.不要使用stop或者destroy等过时或者JDK不建议使用的方法
public class TestStop implements Runnable {
    // 1. 设置一个标识位
    private boolean flag =true;

    @Override
    public void run() {
        int i =0;
        while (flag){
            System.out.println("run---thread"+i++);
        }
    }

    // 2.设置一个公开的方法停止线程，转换标志位
    public void stop(){
        this.flag=false;
    }

    public static void main(String[] args) {
        final TestStop testStop = new TestStop();
        new Thread(testStop).start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("Main"+Thread.currentThread().getName()+""+i);
            if (i==900){
                // 调用stop方法切换标识位，让线程停止
                testStop.stop();
                System.out.println("线程停止了");
            }
        }
    }

}
