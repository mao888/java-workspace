package com.mao.demo01;

//代理
public class Proxy {

    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }
    public void rent(){
        SeeHouse();
        host.rent();
        hetong();
        fare();
    }

    //看房
    public void SeeHouse(){
        System.out.println("中介带你看房");
    }
    //签合同
    public void hetong(){
        System.out.println("中介带你签合同");
    }
    //收中介费
    public void fare(){
        System.out.println("收中介费");
    }

}
