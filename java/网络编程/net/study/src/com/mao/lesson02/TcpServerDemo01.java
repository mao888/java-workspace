package com.mao.lesson02;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

// 服务端
public class TcpServerDemo01 {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket accept = null;
        InputStream inputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;

        try {
            // 1.我得有一个地址
            serverSocket= new ServerSocket(9999);

            while (true){
                //2. 等待客户端连接过来
                accept = serverSocket.accept();
                //3. 读取客户端的消息
                inputStream = accept.getInputStream();

                // 管道流
                byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bytes = new byte[1024];
                int length;
                while ((length=inputStream.read(bytes))!=-1){
                    byteArrayOutputStream.write(bytes,0,length);
                }
                System.out.println(byteArrayOutputStream.toString());
            }

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }finally {
            if (byteArrayOutputStream!=null){
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (inputStream!=null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (accept!=null){
                try {
                    accept.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (serverSocket!=null){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
