package com.mao.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 * @ClassName Talk
 * @Description TODO
 * @Author Huchao
 * @Date 2021/11/3 21:03
 * @Version 1.0
 **/
public class TalkSend implements Runnable{
    DatagramSocket datagramSocket = null;
    DatagramPacket datagramPacket = null;
    BufferedReader bufferedReader = null;
    String s;
    private int fromPort;
    private String toIP;
    private int toport;



    // 建立连接
    public TalkSend(int fromPort, String toIP, int toport) {
        this.fromPort = fromPort;
        this.toIP = toIP;
        this.toport = toport;

        try {
            datagramSocket = new DatagramSocket(this.fromPort);
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    // 发送消息
    @Override
    public void run() {
        while (true){
            try {
                s = bufferedReader.readLine();      // 读取消息
                final byte[] bytes = s.getBytes();  // 发送内容
                datagramPacket = new DatagramPacket(bytes,0,bytes.length,new InetSocketAddress(this.toIP,this.toport)); // 发送包
                datagramSocket.send(datagramPacket);

                if (s.equals("bye")){
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        datagramSocket.close();
    }
}
