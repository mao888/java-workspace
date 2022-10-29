package com.bobo.util.reflection.src.com.bobo;

import java.lang.annotation.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test08 {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("com.bobo.util.reflection.src.com.bobo.C");
        System.out.println("cls.getName() = " + cls.getName());
        System.out.println("cls.getSimpleName() = " + cls.getSimpleName());
        System.out.println("cls.getPackage() = " + cls.getPackage());
        System.out.println("cls.getSuperclass() = " + cls.getSuperclass());
        // 获取所有的Field
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            System.out.println("field.getName() = " + field.getName());
        }
        System.out.println("========");
        Field[] declaredFields = cls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("declaredField.getName() = " + declaredField.getName());
        }
        System.out.println("========");
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            System.out.println("method.getName() = " + method.getName());
        }
        System.out.println("========");
        for (Method declaredMethod : cls.getDeclaredMethods()) {
            System.out.println("declaredMethod.getName() = " + declaredMethod.getName());
        }
        System.out.println("========");
        Constructor<?>[] constructors = cls.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("constructor.getName() = " + constructor.getName());
        }
        System.out.println("========");
        for (Constructor<?> declaredConstructor : cls.getDeclaredConstructors()) {
            System.out.println("declaredConstructor.getName() = " + declaredConstructor.getName());
        }

        Class<?>[] interfaces = cls.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println("anInterface.getName() = " + anInterface.getName());
        }
        Annotation[] annotations = cls.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println("annotation.annotationType() = " + annotation);
        }


    }
}

interface A{

    void fun1();
}

class D {
    public int age ;
}

@MyInterface("aaa")
class C extends D implements A{

    private int id;

    String name;

    protected String sex;

    public String address;

    @Override
    public void fun1() {

    }

    public String fun2(String name,Integer age){
        return null;
    }

    void fun3(){

    }
    protected  void fun4(){

    }

    public void fun5(){

    }

    private C(int id, String name, String sex, String address) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.address = address;
    }

    protected C(int id) {
        this.id = id;
    }

     C(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public C() {
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MyInterface{

    String value();
}
