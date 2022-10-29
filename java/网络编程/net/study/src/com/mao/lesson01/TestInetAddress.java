package com.mao.lesson01;

import java.net.InetAddress;
import java.net.UnknownHostException;

// 测试IP
public class TestInetAddress {
    public static void main(String[] args) throws UnknownHostException {

        // 查询本机地址
        // getByName(String host) 确定主机名称的IP地址。
        final InetAddress byName = InetAddress.getByName("127.0.0.1");
        System.out.println(byName);         //  /127.0.0.1

        final InetAddress localhost = InetAddress.getByName("localhost");
        System.out.println(localhost);      // localhost/127.0.0.1

        // getHostAddress()  返回文本显示中的IP地址字符串。
        final InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);      // DESKTOP-JDIH9D6/10.102.211.250

        System.out.println("========================");
        // 查询网站ip地址
        final InetAddress byName1 = InetAddress.getByName("www.huchao.vip");
        System.out.println(byName1);        // www.huchao.vip/47.93.20.204

        System.out.println("======================");
        // 常用方法
        //
        System.out.println(byName1.getCanonicalHostName());         // 规范的名字   获取此IP地址的完全限定域名。              47.93.20.204
        System.out.println(byName1.getHostAddress());               // ip    返回文本显示中的IP地址字符串。                   47.93.20.204
        System.out.println(byName1.getHostName());                  // 域名，或者自己电脑的名字   获取此IP地址的主机名。    www.huchao.vip

    }
}
