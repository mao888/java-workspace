package com.bobo.util.reflection.src.com.bobo;

public class Test07 {

    public static void main(String[] args) {
        System.out.println("----");
        /**
         * 1.类加载，创建B类对象
         * 2.连接-准备
         *     B.num = 0;
         * 3.初始化阶段
         *    依次自动收集类中的所有**静态变量**的赋值动作和静态代码块中的语句，并进行合并
         *    <clinit>(){
         *        System.out.println("B 静态代码块执行了");
         *         num = 20;
         *         num = 10;
         *    }
         *    合并处理
         *       <clinit>(){
         *        System.out.println("B 静态代码块执行了");
         *         num = 10;
         *    }
         */
        System.out.println("B.num = " + B.num);
    }


}
class B{

    static {
        System.out.println("B 静态代码块执行了");
        num = 20;
    }
    static int num = 10;

}
