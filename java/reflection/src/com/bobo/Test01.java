package com.bobo.util.reflection.src.com.bobo;

import com.bobo.util.reflection.src.com.bobo.domain.Car;

import java.lang.reflect.Field;

public class Test01 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) throws Exception {
        // 1.传统方式
        Car car = new Car();
        System.out.println("car = " + car);
        // 获取对象 对应的类型
        System.out.println("car.getClass() = " + car.getClass());

        // 2.通过反射的方式获取一个Car对象
        Class<?> aClass = Class.forName("com.bobo.util.reflection.src.com.bobo.domain.Car");
        Object o = aClass.newInstance();
        System.out.println("o = " + o);
        // 通过反射获取对象中的属性 并修改属性
        Field brand = aClass.getField("brand");
        System.out.println("brand.get(o) = " + brand.get(o));
        // 通过反射来修改属性的值
        brand.set(o,"红旗");
        System.out.println("brand.get(o) = " + brand.get(o));
    }
}
