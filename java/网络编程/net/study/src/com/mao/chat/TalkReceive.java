package com.mao.chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @ClassName TalkReceive
 * @Description TODO
 * @Author Huchao
 * @Date 2021/11/3 21:21
 * @Version 1.0
 **/
public class TalkReceive implements Runnable {
    DatagramSocket datagramSocket =null;
    private int port;
    private String msgfrom;

    public TalkReceive(int port,String msgfrom) {
        this.port = port;
        this.msgfrom=msgfrom;
        try {
            datagramSocket = new DatagramSocket(port);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true){
            try {
                // 准备接收包裹
                final byte[] bytes = new byte[1024];
                final DatagramPacket datagramPacket = new DatagramPacket(bytes, 0, bytes.length);
                datagramSocket.receive(datagramPacket); // 阻塞式接收包裹

                // 断开连接
                final byte[] data = datagramPacket.getData();
                final String s = new String(data, 0, data.length);
                System.out.println(msgfrom+": "+s.trim());
                if (s.startsWith("bye")){
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        datagramSocket.close();
    }
}
