package com.bobo.util.reflection.src.com.bobo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test09 {
    public static void main(String[] args) throws Exception{
        // Field
        Class<?> cls = Class.forName("com.bobo.util.reflection.src.com.bobo.domain.Car");
        Field brand = cls.getDeclaredField("brand");
        // 获取成员变量的访问权限修饰符
        System.out.println("brand.getModifiers() = " + brand.getModifiers());
        System.out.println("brand.getType() = " + brand.getType());

        // Method
        Method m = cls.getMethod("hi");
        Object o = cls.newInstance();
        m.invoke(o);
        // 获取方法的返回类型
        System.out.println("m.getReturnType() = " + m.getReturnType());
        Class<?>[] parameterTypes = m.getParameterTypes();
        Annotation[] annotations = m.getAnnotations();

        // Constructor构造器
        Object o1 = cls.newInstance();// 调用默认的无参构造方法获取
        Constructor<?> declaredConstructor = cls.getDeclaredConstructor(String.class);
        Object o2 = declaredConstructor.newInstance("大众");

        Class<?>[] parameterTypes1 = declaredConstructor.getParameterTypes();
    }
}

