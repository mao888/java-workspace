package com.mao.lesson02;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

//客户端
public class TcpClientDemo01 {
    public static void main(String[] args) {
        InetAddress byName =null;
        Socket socket=null;
        OutputStream outputStream=null;
        try {
            //1.要知道服务器的地址,端口号
            byName = InetAddress.getByName("127.0.0.01");
            int port =9999;
            //2.创建一个socket连接
            socket = new Socket(byName,port);
            //3.发送消息 io 流
            outputStream = socket.getOutputStream();
            outputStream.write("你好,我是胡超,欢迎和我一起学习Java网络编程".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream!=null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
