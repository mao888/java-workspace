package com.mao.state;

/**
 * @ClassName TestDaemon
 * @Description TODO
 * @Author Huchao
 * @Date 2021/11/9 22:32
 * @Version 1.0
 **/
// 测试守护线程
// 上帝守护你
//● 虚拟机必须确保用户线程执行完毕
//● 虚拟机不用等待守护线程执行完毕
public class TestDaemon {
    public static void main(String[] args) {
        final God god = new God();
        final Thread thread = new Thread(god);
        thread.setDaemon(true); // 默认是false表示用户线程，正常的线程都是用户线程
        thread.start(); // 上帝守护线程启动

        new Thread(new You()).start();  // 你 用户线程启动

    }
}
// 上帝
class God implements Runnable{

    @Override
    public void run() {
        while (true){
            System.out.println("上帝保佑着你");
        }
    }
}

// 你
class You implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 36500; i++) {
            System.out.println("你一生都开心的活着");
        }
        System.out.println("====goodbye! Hello,world!=====");
    }
}
