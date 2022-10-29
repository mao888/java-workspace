package com.mao.chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @ClassName UdpReceiveDemo01
 * @Description TODO
 * @Author Hasee
 * @Date 2021/11/3 20:26
 * @Version 1.0
 **/
public class UdpReceiveDemo01 {
    public static void main(String[] args) throws Exception {
        final DatagramSocket datagramSocket = new DatagramSocket(6677);

        while (true){
            // 准备接收包裹
            final byte[] bytes = new byte[1024];
            final DatagramPacket datagramPacket = new DatagramPacket(bytes, 0, bytes.length);
            datagramSocket.receive(datagramPacket); // 阻塞式接收包裹

            // 断开连接
            final byte[] data = datagramPacket.getData();
            final int length = datagramPacket.getLength();
            final String s = new String(data, 0, length);
            System.out.println(s);
            if (s.startsWith("bye")){
                break;
            }
        }
        datagramSocket.close();
    }
}
