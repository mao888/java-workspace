package com.bobo.util.reflection.src.com.bobo;

import com.bobo.util.reflection.src.com.bobo.domain.Car;

public class Test03 {

    public static void main(String[] args) throws Exception {
        // Class 对象不new出来的，而是系统帮我们创建的
        /**
         *     new  Car(); 也同样的需要通过类加载器获取对应的 类对象
         *     public Class<?> loadClass(String name) throws ClassNotFoundException {
         *         return loadClass(name, false);
         *     }
         */
         Car car = new Car();
        // 通过反射的方式
        /**
         *     在反射的情况下，仍然是通过 ClassLoa类加载类对象
         *     public Class<?> loadClass(String name) throws ClassNotFoundException {
         *         return loadClass(name, false);
         *     }
         */
        Class<?> cls1 = Class.forName("com.bobo.util.reflection.src.com.bobo.domain.Car");
        Object o = cls1.newInstance();
        Class<?> cls2 = Class.forName("com.bobo.util.reflection.src.com.bobo.domain.Car");
        System.out.println("car.getClass().hashCode() = " + car.getClass().hashCode());
        System.out.println("cls1.hashCode() = " + cls1.hashCode());
        System.out.println("cls2.hashCode() = " + cls2.hashCode());
        // 每一个实例对象都会记得自己是由哪个Class对象生成的
        System.out.println("car.getClass() = " + car.getClass());

    }
}
