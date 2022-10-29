package com.mao.chat;

/**
 * @ClassName TalkTeacher
 * @Description TODO
 * @Author HuChao
 * @Date 2021/11/3 21:33
 * @Version 1.0
 **/
public class TalkTeacher {
    public static void main(String[] args) {
        // 静态代理
        new Thread(new TalkSend(5555,"localhost",8888)).start();
        new Thread(new TalkReceive(9999,"学生")).start();
    }

}
