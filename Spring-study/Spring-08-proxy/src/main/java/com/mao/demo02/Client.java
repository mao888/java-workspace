package com.mao.demo02;

public class Client {
    public static void main(String[] args) {
        //真实业务
        UserServiceImpl userService = new UserServiceImpl();
        userService.add();

        //代理类
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        //使用代理类实现日志功能！
        userServiceProxy.setUserServiceProxy(userService);

        userServiceProxy.add();
    }
}
