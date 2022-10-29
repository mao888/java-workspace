package com.bobo.util.reflection.src.com.mao.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test10 {

    // 普通方式调用
    public static void test01() {
        User user =new User();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            user.getName();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("普通方式执行10亿次："+(endTime-startTime)+"ms");     // 普通方式执行10亿次：2ms
    }

    // 反射方式调用
    public static void test02() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user =new User();
        final Class aClass = user.getClass();
        final Method getName = aClass.getDeclaredMethod("getName", null);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user,null);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("反射方式执行10亿次："+(endTime-startTime)+"ms");         // 反射方式执行10亿次：1904ms
    }

    // 反射方式调用  关闭检测
    public static void test03() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user =new User();
        final Class aClass = user.getClass();
        final Method getName = aClass.getDeclaredMethod("getName", null);
        getName.setAccessible(true);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user,null);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("关闭检测方式执行10亿次："+(endTime-startTime)+"ms");       // 关闭检测方式执行10亿次：1304ms
    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        test01();
        test02();
        test03();
    }
}
