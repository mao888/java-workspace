package com.mao.lesson04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * @ClassName UrlDown
 * @Description TODO
 * @Author HuChao
 * @Date 2021/11/3 22:31
 * @Version 1.0
 **/
public class UrlDown {
    public static void main(String[] args) throws Exception {
        // 1.下载地址
        final URL url = new URL("https://m10.music.126.net/20211103230417/8ff1962e83198f8e9dcdd3f4684d8bea/yyaac/obj/wonDkMOGw6XDiTHCmMOi/4064595123/29fd/0611/0ab0/18713e49d7771e90ca4301ac93a0fa96.m4a");
        // 2.连接到这个资源 HTTP
        final HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

        final InputStream inputStream = urlConnection.getInputStream();

        final FileOutputStream fileOutputStream = new FileOutputStream("黄昏.m4a");

        final byte[] bytes = new byte[1024];
        int length;
        while ((length=inputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes,0,length); // 写入这个数据
        }
        fileOutputStream.close();
        inputStream.close();
        urlConnection.connect();

    }
}
