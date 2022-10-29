package com.mao.lesson01;

import java.net.InetSocketAddress;

public class TestInetSocketAddres {
    public static void main(String[] args) {
        final InetSocketAddress inetSocketAddress = new InetSocketAddress("47.93.20.204", 8080);
        System.out.println(inetSocketAddress);                                      // /47.93.20.204:8080
        final InetSocketAddress localhost = new InetSocketAddress("localhost", 8080);
        System.out.println(localhost);                                             // localhost/127.0.0.1:8080
        final InetSocketAddress inetSocketAddress1 = new InetSocketAddress("127.0.0.1", 8080);
        System.out.println(inetSocketAddress1);                                   // /127.0.0.1:8080

        System.out.println("===================");
        System.out.println(localhost.getAddress());         // localhost/127.0.0.1
        System.out.println(localhost.getHostName());        // localhost
        System.out.println(localhost.getPort());            // 8080

        System.out.println("==================");
        System.out.println(inetSocketAddress.getAddress());     //  /47.93.20.204
        System.out.println(inetSocketAddress.getHostName());    //  47.93.20.204
        System.out.println(inetSocketAddress.getPort());        //  8080
    }
}
