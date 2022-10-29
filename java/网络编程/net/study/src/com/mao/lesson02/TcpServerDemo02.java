package com.mao.lesson02;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author HuChao
 * @Description //TODO Hasee
 * @Date 17:28 2021/11/2
 * @Param
 * @return
 **/
public class TcpServerDemo02 {
    public static void main(String[] args) throws Exception {
        // 1.创建服务
        final ServerSocket serverSocket = new ServerSocket(9000);
        // 2.监听客户端连接
        final Socket socket = serverSocket.accept();    //阻塞式监听,会一直等待客户端的到来

        // 3.获取输入流
        final InputStream inputStream = socket.getInputStream();
        // 4.文件输出
        final FileOutputStream fileOutputStream = new FileOutputStream(new File("recevie.png"));
        //创立缓冲区和写
        final byte[] bytes = new byte[1024];
        int length;
        while ((length=inputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes,0,length);
        }
        // 通知客户端接受完毕
        final OutputStream outputStream = socket.getOutputStream();
        outputStream.write("客户端,服务都端接受完毕了,你可以断开了".getBytes());

        // 关闭资源
        outputStream.close();
        fileOutputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
