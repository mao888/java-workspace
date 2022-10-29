package com.mao.syn;

/**
 * @ClassName UnsafeBuyTicket
 * @Description TODO
 * @Author Huchao
 * @Date 2021/11/10 20:07
 * @Version 1.0
 **/
// 不安全的买票
// 线程不安全，有负数
public class UnsafeBuyTicket{
    public static void main(String[] args) {
        final BuyTicket buyTicket = new BuyTicket();
        new Thread(buyTicket,"超哥").start();
        new Thread(buyTicket,"废物凤").start();
        new Thread(buyTicket,"黄牛").start();
    }
}

class BuyTicket implements Runnable{

    // 票
    private int ticketNums=10;
    boolean flag = true;
    @Override
    public void run() {
        while (true){
            buy();
        }
    }

    void buy(){
        // 判断是否有票
        if (ticketNums<=0){
            flag=false;
            return;
        }
        // 模拟延时
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //买票
        System.out.println(Thread.currentThread().getName()+"拿到"+ticketNums--);
    }
}
