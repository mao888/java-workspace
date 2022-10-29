package com.bobo.util.reflection.src.com.bobo;

import java.lang.reflect.Field;

public class Test04 {

    /**
     * Class中的常用方法
     * @param args
     */
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("com.bobo.util.reflection.src.com.bobo.domain.Car");
        // 1.输出类型
        System.out.println("aClass = " + aClass);
        // 这个Class对象又是由哪个类型得来的呢？  java.lang.Class
        System.out.println("aClass.getClass() = " + aClass.getClass());

        System.out.println("aClass.getPackage() = " + aClass.getPackage());
        System.out.println(aClass.getName());
        // 创建实例对象
        Object o = aClass.newInstance();
        // 获取所有的成员变量
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("declaredField.getName() = " + declaredField.getName());
        }
    }
}
