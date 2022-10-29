package com.bobo.util.reflection.src.com.mao.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test08 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        final Class aClass = Class.forName("com.bobo.util.reflection.src.com.mao.reflection.User");

        //获得类的名字
        System.out.println(aClass.getName());  //com.bobo.util.reflection.src.com.mao.reflection.User 获得包名 + 类名

        System.out.println(aClass.getSimpleName()); // User 获得类名

        System.out.println("=======================");

        //获得类的属性
        Field[] fields = aClass.getFields();//只能找到public属性
        for (Field field : fields) {
            System.out.println("getFields:" + field);
        }   // 空
        fields = aClass.getDeclaredFields();//找到全部的属性
        for (Field field : fields) {
            System.out.println("getDeclaredFields:" + field);
        }
        /**
         * getDeclaredFields:private java.lang.String com.bobo.util.reflection.src.com.mao.reflection.User.name
         * getDeclaredFields:private int com.bobo.util.reflection.src.com.mao.reflection.User.id
         * getDeclaredFields:private int com.bobo.util.reflection.src.com.mao.reflection.User.age
         * */

        //获得指定属性的值
        Field name = aClass.getDeclaredField("name");
        System.out.println(name);
        /**
         * private java.lang.String com.bobo.util.reflection.src.com.mao.reflection.User.name
         * */

        System.out.println("=======================");

        //获得类的方法
        Method[] methods = aClass.getMethods(); //获得本类及父类的全部public方法
        for (Method method : methods) {
            System.out.println("getMethods:" + method);
        }
        /**
         * getMethods:public void com.bobo.util.reflection.src.com.mao.reflection.User.setId(int)
         * getMethods:public void com.bobo.util.reflection.src.com.mao.reflection.User.setAge(int)
         * getMethods:public int com.bobo.util.reflection.src.com.mao.reflection.User.getAge()
         * getMethods:public java.lang.String com.bobo.util.reflection.src.com.mao.reflection.User.toString()
         * getMethods:public java.lang.String com.bobo.util.reflection.src.com.mao.reflection.User.getName()
         * getMethods:public int com.bobo.util.reflection.src.com.mao.reflection.User.getId()
         * getMethods:public void com.bobo.util.reflection.src.com.mao.reflection.User.setName(java.lang.String)
         * getMethods:public final void java.lang.Object.wait() throws java.lang.InterruptedException
         * getMethods:public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
         * getMethods:public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException
         * getMethods:public boolean java.lang.Object.equals(java.lang.Object)
         * getMethods:public native int java.lang.Object.hashCode()
         * getMethods:public final native java.lang.Class java.lang.Object.getClass()
         * getMethods:public final native void java.lang.Object.notify()
         * getMethods:public final native void java.lang.Object.notifyAll()
         * */
        methods = aClass.getDeclaredMethods(); //获得本类的所有方法
        for (Method method : methods) {
            System.out.println("getDeclaredMethods:" + method);
        }
        /**
         *
         getDeclaredMethods:public java.lang.String com.bobo.util.reflection.src.com.mao.reflection.User.toString()
         getDeclaredMethods:public java.lang.String com.bobo.util.reflection.src.com.mao.reflection.User.getName()
         getDeclaredMethods:public int com.bobo.util.reflection.src.com.mao.reflection.User.getId()
         getDeclaredMethods:public void com.bobo.util.reflection.src.com.mao.reflection.User.setName(java.lang.String)
         getDeclaredMethods:public void com.bobo.util.reflection.src.com.mao.reflection.User.setId(int)
         getDeclaredMethods:public int com.bobo.util.reflection.src.com.mao.reflection.User.getAge()
         getDeclaredMethods:public void com.bobo.util.reflection.src.com.mao.reflection.User.setAge(int)
         * */
        System.out.println("=======================");

        //获得指定的方法
        //重载
        Method getName = aClass.getMethod("getName", null);
        Method setName = aClass.getMethod("setName", String.class);
        System.out.println(getName);    // public java.lang.String com.bobo.util.reflection.src.com.mao.reflection.User.getName()
        System.out.println(setName);    // public void com.bobo.util.reflection.src.com.mao.reflection.User.setName(java.lang.String)
        //获得类的构造器
        System.out.println("=======================");
        Constructor[] constructors = aClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("getConstructors:" + constructor);
        }
        /**
         * getConstructors:public com.bobo.util.reflection.src.com.mao.reflection.User()
         * getConstructors:public com.bobo.util.reflection.src.com.mao.reflection.User(java.lang.String,int,int)
         * */
        constructors = aClass.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("getDeclaredConstructors:" + constructor);
        }
        /**
         * getDeclaredConstructors:public com.bobo.util.reflection.src.com.mao.reflection.User()
         * getDeclaredConstructors:public com.bobo.util.reflection.src.com.mao.reflection.User(java.lang.String,int,int)
         * */
        //获得指定的构造器
        Constructor declaredConstructor = aClass.getDeclaredConstructor(String.class, int.class, int.class);
        System.out.println("指定构造器" + declaredConstructor);
        //指定构造器public com.bobo.util.reflection.src.com.mao.reflection.User(java.lang.String,int,int)

    }
}
