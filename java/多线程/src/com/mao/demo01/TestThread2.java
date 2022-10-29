package com.mao.demo01;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @ClassName TestThread2
 * @Description TODO
 * @Author Huchao
 * @Date 2021/11/8 19:32
 * @Version 1.0
 **/
public class TestThread2  extends Thread{
    private String url;     // 网络图片地址
    private String name;    // 保存的文件名

    public TestThread2(String url, String name) {
        this.url = url;
        this.name = name;
    }

    // 下载图片的线程执行体
    @Override
    public void run() {
//        super.run();
        final webDownloader webDownloader = new webDownloader();
        webDownloader.downloader(url,name);
        System.out.println("下载了文件名为:"+name);
    }

    public static void main(String[] args) {
        final TestThread2 test1 = new TestThread2("https://i0.hdslb.com/bfs/article/f39427eefe8b5c9318b6c9ef99c4108efdf1e747.jpg@1320w_740h.webp","edg1.png");
        final TestThread2 test2 = new TestThread2("https://i0.hdslb.com/bfs/archive/57ab5a6e8b36c227cc13c2cd96270e04b0a253be.png","edg2.png");
        final TestThread2 test3 = new TestThread2("https://i0.hdslb.com/bfs/activity-plat/static/b711c4ecbed559f94155437efb3d8532/j6mFBYivhq_w1920_h658.png","文豪试炼场.png");

        // 实际下载并不是按照顺序执行
        test1.start();
        test2.start();
        test3.start();
    }
}

// 下载器
class webDownloader{
    // 下载方法
    public void downloader(String url,String name){

        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));   // 讲url变成图片
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO 异常，downloader方法出现问题");
        }
    }

}
