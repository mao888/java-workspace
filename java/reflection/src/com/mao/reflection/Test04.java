package com.bobo.util.reflection.src.com.mao.reflection;

import java.lang.annotation.ElementType;

// 所有类型的class
public class Test04 {
    public static void main(String[] args) {
        //类
        Class c1 = Object.class;            //  class java.lang.Object
        //接口
        Class c2 = Comparable.class;        //  interface java.lang.Comparable
        //一维数组
        Class c3 = String[].class;          //  class [Ljava.lang.String;
        //二维数组
        Class c4 = int[][].class;           //  class [[I
        //注解
        Class c5 = Override.class;          //  interface java.lang.Override
        //枚举
        Class c6 = ElementType.class;       //  class java.lang.annotation.ElementType
        //基本类型
        Class c7 = Integer.class;           //  class java.lang.Integer
        //void
        Class c8 = void.class;              //  void
        // Class
        Class c9 = Class.class;             //  class java.lang.Class

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);

        //只要元素类型与维度一样，就是同Class
        int[]  a = new int[10];
        int[]  b = new int[100];
        System.out.println(a.getClass().hashCode());    // 460141958
        System.out.println(b.getClass().hashCode());    // 460141958
    }

}
