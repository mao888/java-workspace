package com.bobo.util.reflection.src.com.bobo;

import com.bobo.util.reflection.src.com.bobo.domain.Car;

public class Test05 {
    /**
     * 在类加载的准备阶段 下面三个成员变量的值是多少？
     * n1: 这是一个普通成员变量 在准备阶段 连内存空间都没分配，没有这个变量的事儿
     * n2:  静态成员变量， 准备阶段 会做默认值初始化 n2 = 0;
     * n3   常量 常用是不可变的，所以在准备阶段 n3 = 30;
     */
    public int n1 =10;
    public static int n2 = 20;
    public static final  int n3 = 30;

    /**
     * Class类对象的获取方式
     * @param args
     */
    public static void main(String[] args) throws Exception{
        // 1.Class.forName("....")
        Class<?> cls1 = Class.forName("com.bobo.util.reflection.src.com.bobo.domain.Car");
        // 2.知道具体的类型
        Class<Car> cls2 = Car.class; // 方法参数
        // 3.知道具体的对象
        Car car = new Car();
        Class<? extends Car> cls3 = car.getClass();
        // 4.类加载器
        ClassLoader classLoader = car.getClass().getClassLoader();
        Class<?> cls4 = classLoader.loadClass("com.bobo.util.reflection.src.com.bobo.domain.Car");
        // 5. 基本数据类型
        System.out.println("int.class = " + int.class);
        System.out.println("long.class = " + long.class);
        // 6. 包装类
        System.out.println("Integer.TYPE = " + Integer.TYPE);
        System.out.println("Boolean.TYPE = " + Boolean.TYPE);

    }
}
