package com.mao.state;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName TestSleep2
 * @Description TODO
 * @Author Huchao
 * @Date 2021/11/9 15:26
 * @Version 1.0
 **/
// 模拟倒计时
public class TestSleep2 {

    public static void main(String[] args) {
        // 打印当前系统时间
        Date date = new Date(System.currentTimeMillis());   //获取当前系统时间
        while (true){
            try {
                Thread.sleep(1000);
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(date));
                date = new Date(System.currentTimeMillis());  //更新当前时间
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    // 模拟倒计时
    static void tenDown() throws InterruptedException {
        int num = 10;
        while (true){
            Thread.sleep(1000);
            System.out.println(num--);
            if (num<=0){
                break;
            }
        }
    }
}
