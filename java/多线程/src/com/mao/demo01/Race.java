package com.mao.demo01;

/**
 * @ClassName Race
 * @Description TODO
 * @Author HuChao
 * @Date 2021/11/8 21:14
 * @Version 1.0
 **/
public class Race implements Runnable {
    // 胜利者  静态  保证只有一个winner
    private static String winner;
    @Override
    public void run() {

        for (int i = 0; i <= 100; i++) {

            // 模拟兔子休息
            if (Thread.currentThread().getName().equals("兔子")&&i%10==0){
                try {
                    Thread.sleep((long) 0.1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // 判断比赛是否结束
            boolean flag = gameover(i);
            // 如果比赛结束  就停止比赛
            if (flag){
                break;
            }

            System.out.println(Thread.currentThread().getName()+"-->跑了"+i+"步");
        }

    }

    // 判断比赛是否完成
    private boolean gameover(int steps){
        if (winner!=null){  // 已经存在胜利者
            return true;    // 比赛结束
        }else {
            if (steps>=100){
                winner=Thread.currentThread().getName();
                System.out.println("winner is"+winner);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        final Race race = new Race();
        new Thread(race,"兔子").start();
        new Thread(race,"乌龟").start();
    }
}
