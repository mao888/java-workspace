package com.bobo.util.reflection.src.com.bobo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test10 {

    public static void main(String[] args) throws  Exception{
        Class<?> cls = Class.forName("com.bobo.util.reflection.src.com.bobo.domain.Person");
        // 放开访问权限的限制
        Constructor<?> declaredConstructor = cls.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Object o = declaredConstructor.newInstance();
        Field age = cls.getDeclaredField("age");
        age.setAccessible(true);
        age.set(o,22);
        Method fun1 = cls.getDeclaredMethod("fun1");
        fun1.setAccessible(true);
        fun1.invoke(o);
    }
}
