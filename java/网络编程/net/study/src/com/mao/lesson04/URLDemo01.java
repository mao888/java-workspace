package com.mao.lesson04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @ClassName URLDemo014
 * @Description TODO
 * @Author Huchao
 * @Date 2021/11/3 22:19
 * @Version 1.0
 **/
public class URLDemo01 {
    public static void main(String[] args) throws IOException {
        URL url=new URL("https://localhost:8080/helloworld/index.jsp?username=huchao&password=123");
        System.out.println(url.getProtocol());  // 协议       https
        System.out.println(url.getHost());      // 主机ip     localhost
        System.out.println(url.getPort());      // 端口       8080
        System.out.println(url.getPath());      // 文件       /helloworld/index.jsp
        System.out.println(url.getFile());      // 全路径      /helloworld/index.jsp?username=huchao&password=123
        System.out.println(url.getQuery());     // 参数       username=huchao&password=123
    }
}
