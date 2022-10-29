package com.mao.demo01;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.*;

/**
 * @ClassName TestCallable
 * @Description TODO
 * @Author Huchao
 * @Date 2021/11/8 22:03
 * @Version 1.0
 **/

// 线程创建方式三：实现 Callable 接口
/*
 * callable 的好处
 * 1.可以定义返回值
 * 2.可以抛出异常
 **/

public class TestCallable implements Callable<Boolean> {
    private String url;     // 网络图片地址
    private String name;    // 保存的文件名

    public TestCallable(String url, String name) {
        this.url = url;
        this.name = name;
    }
    @Override
    public Boolean call(){
        webDownloader webDownloader = new webDownloader();
        webDownloader.downloader(url,name);
        System.out.println("下载了文件名为:"+name);
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
         TestCallable test1 = new TestCallable("https://i0.hdslb.com/bfs/article/f39427eefe8b5c9318b6c9ef99c4108efdf1e747.jpg@1320w_740h.webp","edg1.png");
         TestCallable test2 = new TestCallable("https://i0.hdslb.com/bfs/archive/57ab5a6e8b36c227cc13c2cd96270e04b0a253be.png","edg2.png");
         TestCallable test3 = new TestCallable("https://i0.hdslb.com/bfs/activity-plat/static/b711c4ecbed559f94155437efb3d8532/j6mFBYivhq_w1920_h658.png","文豪试炼场.png");

        // 1.创建执行服务:
        ExecutorService service = Executors.newFixedThreadPool(3);
        // 2.提交执行:
        Future<Boolean> r1 = service.submit(test1);
        Future<Boolean> r2 = service.submit(test2);
        Future<Boolean> r3 = service.submit(test3);
        // 3.获取结果:
        boolean rs1 = r1.get();
        boolean rs2 = r2.get();
        boolean rs3 = r3.get();
        // 4.关闭服务:
        service.shutdownNow();
    }
}
