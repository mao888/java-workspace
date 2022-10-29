package com.mao.lesson02;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
/**
 * @Author HuChao
 * @Description //TODO Huchao
 * @Date 17:28 2021/11/2
 * @Param
 * @return
 **/
public class TcpClientDemo02 {
    public static void main(String[] args) throws Exception {
        // 1.创建一个socket连接
        final Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9000);
        // 2.创建一个输出流
        final OutputStream outputStream = socket.getOutputStream();
        // 3.读取文件
        final FileInputStream fileInputStream = new FileInputStream(new File("双湖拍.png"));
        // 4.写出文件
        final byte[] bytes = new byte[1024];
        int length;
        while ((length=fileInputStream.read(bytes))!=-1){
            outputStream.write(bytes,0,length);
        }

        // 通知服务器,我已经传输完了
        //发送成功后关闭输出流
        //通知服务器我已经输出结束了
        socket.shutdownOutput();    // 我已经传输完了!

        // 确定服务端接受完毕,才能够断开连接
        final InputStream inputStream = socket.getInputStream();//接收来自服务端的消息，用数组流来输出
        /**
         *     public byte[] getBytes() {
         *         return StringCoding.encode(value, 0, value.length);
         *     }
         * */
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final byte[] bytes1 = new byte[1024];
        int length2;
        while ((length2=inputStream.read(bytes1))!=-1){
            byteArrayOutputStream.write(bytes1,0,length2);
        }
        System.out.println(byteArrayOutputStream.toString());

        // 5.关闭资源
        byteArrayOutputStream.close();
        inputStream.close();
        fileInputStream.close();
        outputStream.close();
        socket.close();
    }
}
