package com.mao.lesson03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @ClassName UdpServerDemo01
 * @Description TODO
 * @Author HUCHAO
 * @Date 2021/11/2 18:08
 * @Version 1.0
 **/

// 还是要等待客户端的链接!
public class UdpServerDemo01 {
    public static void main(String[] args) throws Exception {
        // 开放端口
        final DatagramSocket datagramSocket = new DatagramSocket(9090);
        // 接受数据包
        final byte[] bytes = new byte[1024];
        final DatagramPacket datagramPacket = new DatagramPacket(bytes,0,bytes.length);

        datagramSocket.receive(datagramPacket); // 阻塞接收
        System.out.println(datagramPacket.getAddress().getHostAddress());
        System.out.println(new String(datagramPacket.getData(),0,datagramPacket.getLength()));

        // 关闭连接
        datagramSocket.close();
    }
}
