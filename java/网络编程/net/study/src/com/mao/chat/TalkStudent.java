package com.mao.chat;

/**
 * @ClassName Talk
 * @Description TODO
 * @Author HuChao
 * @Date 2021/11/3 21:30
 * @Version 1.0
 **/
public class TalkStudent {
    public static void main(String[] args) {
        // 静态代理模式
        new Thread(new TalkSend(7777,"localhost",9999)).start();
        new Thread(new TalkReceive(8888,"老师")).start();
    }
}
