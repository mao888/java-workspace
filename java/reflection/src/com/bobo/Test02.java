package com.bobo.util.reflection.src.com.bobo;

import com.bobo.util.reflection.src.com.bobo.domain.Car;

import java.lang.reflect.Method;

public class Test02 {

    public static void main(String[] args) throws Exception {
        fun1();
        fun2();
        fun3();
    }


    /**
     * 传统方式调用
     */
    public  static void fun1(){
        long start = System.currentTimeMillis();
        Car car = new Car();
        for (int i = 0; i < 100000000; i++) {
            car.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("fun1耗时：" + (end-start));
    }

    /**
     * 反射的方式调用方法
     */
    public  static void fun2() throws Exception{
        long start = System.currentTimeMillis();
        Class<?> cls = Class.forName("com.bobo.util.reflection.src.com.bobo.domain.Car");
        // 获取对象
        Object o = cls.newInstance();
        // 获取方法对应的Method属性
        Method hi = cls.getMethod("hi");
        for (int i = 0; i < 100000000; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("fun2耗时：" + (end-start));
    }

    /**
     * 反射的方式调用方法
     *    关闭反射中的方法 访问检查
     */
    public  static void fun3() throws Exception{
        long start = System.currentTimeMillis();
        Class<?> cls = Class.forName("com.bobo.util.reflection.src.com.bobo.domain.Car");
        // 获取对象
        Object o = cls.newInstance();
        // 获取方法对应的Method属性
        Method hi = cls.getMethod("hi");
        hi.setAccessible(true); // true 表示关闭访问检查  false 开启访问检查
        for (int i = 0; i < 100000000; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("fun3耗时：" + (end-start));
    }


}
