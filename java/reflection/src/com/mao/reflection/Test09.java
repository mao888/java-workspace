package com.bobo.util.reflection.src.com.mao.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// 动态的创建对象，通过反射
public class Test09 {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        // 获得Class对象
        final Class aClass = Class.forName("com.bobo.util.reflection.src.com.mao.reflection.User");

        System.out.println("1、-----构造一个对象  本质上是调用了类的无参构造器----------------------");
        // 构造一个对象
        User o = (User) aClass.newInstance();   //本质上是调用了类的无参构造器
        System.out.println(o);


        System.out.println("2、-----通过构造器创建对象--------------------------");
        // 通过构造器创建对象
        final Constructor declaredConstructor = aClass.getDeclaredConstructor(String.class, int.class, int.class);
        final User o1 = (User) declaredConstructor.newInstance("胡超", 001, 18);
        System.out.println(o1);


        System.out.println("3、--------通过反射调用普通方法-----------------");
        // 通过反射调用普通方法
        final User o2 = (User) aClass.newInstance();
        // 通过反射获取一个方法
        final Method setName = aClass.getDeclaredMethod("setName", String.class);

        // invoke: 激活的意思
        // (对象，“方法的值”)
        setName.invoke(o2,"胡超");
        System.out.println(o2.getName());

        System.out.println("4、------通过反射操作属性---------------");
        final User o3 = (User) aClass.newInstance();     // 构造一个对象
        final Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);   // 不能直接操作私有属性，我们需要关闭程序的安全检测，属性或者方法的setAccessible(true);
        name.set(o3,"超哥");
        System.out.println(o3.getName());

    }
}
