package com.bobo.jdk.inter;

public class Demo01Interface {

    public static void main(String[] args) {
        A a = new B();
        a.test3();
        A c = new C();
        c.test3();
//        A.test4();
    }
}

interface A{

    static String a=null;

    void test1();
    // 接口中新增抽象方法，所有实现类都需要重写这个方法，不利于接口的扩展
    void test2();

    /**
     * 接口中定义的默认方法
     * @return
     */
    public default String  test3(){
        System.out.println("接口中的默认方法执行了...");
        return "hello";
    }

    /**
     * 接口中的静态方法
     * @return
     */
    public static String test4(){
        System.out.println("接口中的静态方法....");
        return "Hello";
    }
}

class B implements  A{
    @Override
    public void test1() {

    }

    @Override
    public void test2() {

    }

    @Override
    public String test3() {
        System.out.println("B 实现类中重写了默认方法...");
        return "ok ...";
    }

}

class C implements A{
    @Override
    public void test1() {

    }

    @Override
    public void test2() {

    }
}
