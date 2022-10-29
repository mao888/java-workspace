package com.mao.lesson03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @ClassName UdpClientDemo01
 * @Description TODO
 * @Author HUCHAO
 * @Date 2021/11/2 18:08
 * @Version 1.0
 **/
// 不需要连接服务器
public class UdpClientDemo01 {
    public static void main(String[] args) throws Exception {
        // 1. 建立一个Socket
        final DatagramSocket datagramSocket = new DatagramSocket();
        // 2. 建个包
        String msg ="你好啊,服务器!";
        final InetAddress localhost = InetAddress.getByName("localhost");
        int port=9090;

        // 数据,数据的长度起始,要发给谁
        final DatagramPacket datagramPacket = new DatagramPacket(msg.getBytes(),0,msg.getBytes().length,localhost,port);

        // 3.发送包
        datagramSocket.send(datagramPacket);
        // 4.关闭流
        datagramSocket.close();
    }
}
