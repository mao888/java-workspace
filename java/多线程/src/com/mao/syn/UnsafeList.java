package com.mao.syn;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UnsafeList
 * @Description TODO
 * @Author Huchao
 * @Date 2021/11/10 20:53
 * @Version 1.0
 **/
// 线程不安全的集合
public class UnsafeList {
    public static void main(String[] args) {
        List<String>list=new ArrayList<String>();
        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
                list.add(Thread.currentThread().getName());
            }).start();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());
    }
}
