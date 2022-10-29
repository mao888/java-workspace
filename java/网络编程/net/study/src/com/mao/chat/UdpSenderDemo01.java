package com.mao.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 * @ClassName UdpSenderDemo01
 * @Description TODO
 * @Author Huchao
 * @Date 2021/11/3 20:25
 * @Version 1.0
 **/
public class UdpSenderDemo01 {
    public static void main(String[] args) throws Exception {
        final DatagramSocket datagramSocket = new DatagramSocket(8888);

        // 准备数据,控制台读取System.in
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true){

            final String s = bufferedReader.readLine();
            final byte[] bytes = s.getBytes();
            final DatagramPacket datagramPacket = new DatagramPacket(bytes,0,bytes.length,new InetSocketAddress("localhost",6677));
            datagramSocket.send(datagramPacket);

            if (s.equals("bye")){
                break;
            }
        }
        datagramSocket.close();
    }
}
