package com.mao.state;

/**
 * @ClassName TestThreadState
 * @Description TODO
 * @Author Huchao
 * @Date 2021/11/9 16:19
 * @Version 1.0
 **/
// 观察线程的状态
public class TestThreadState {
    public static void main(String[] args) throws InterruptedException {
        Thread thread =new Thread(()->{
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("///////");
        });

        // 观察状态
        Thread.State state = thread.getState();
        System.out.println(state);  // NEW

        // 观察启动后
        thread.start(); //启动线程
        state = thread.getState();
        System.out.println(state);  // Run

        while (state!=Thread.State.TERMINATED){ //只要线程不终止，就一直输出状态
            Thread.sleep(100);
            state=thread.getState();    // 更新线程转态
            System.out.println(state);  // 输出状态
        }
    }

}
