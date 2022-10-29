package com.bobo.util.reflection.src.com.mao.reflection;

// 类加载器
public class Test07 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);  //sun.misc.Launcher$AppClassLoader@18b4aac2

        //获取系统类加载器的父类加载器-->扩展类加载器    jre1.8.0_91\lib\ext
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);         // sun.misc.Launcher$ExtClassLoader@1b6d3586

        //获取扩展类加载器父类加载器-->根加载器(c/c++)  jre1.8.0_91\lib\rt.jar
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);        // null

        //测试当前类是哪个加载器加载的
        ClassLoader classLoader = Class.forName("com.bobo.util.reflection.src.com.mao.reflection.Test07").getClassLoader();
        System.out.println(classLoader);    // sun.misc.Launcher$AppClassLoader@18b4aac2

        //测试JDK内置的类是谁加载的
        classLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader);    //null

        //如何获得系统类加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));

        //双亲委派机制  检测安全性 你写的类和跟加载器一样的不会用你写的类
        //java.lang.String -->往上推
        /*
        * E:\Program Files\Java\jre\lib\charsets.jar;
        * E:\Program Files\Java\jre\lib\deploy.jar;
        * E:\Program Files\Java\jre\lib\ext\access-bridge-64.jar;
        * E:\Program Files\Java\jre\lib\ext\cldrdata.jar;
        * E:\Program Files\Java\jre\lib\ext\dnsns.jar;
        * E:\Program Files\Java\jre\lib\ext\jaccess.jar;
        * E:\Program Files\Java\jre\lib\ext\jfxrt.jar;
        * E:\Program Files\Java\jre\lib\ext\localedata.jar;
        * E:\Program Files\Java\jre\lib\ext\nashorn.jar;
        * E:\Program Files\Java\jre\lib\ext\sunec.jar;
        * E:\Program Files\Java\jre\lib\ext\sunjce_provider.jar;
        * E:\Program Files\Java\jre\lib\ext\sunmscapi.jar;
        * E:\Program Files\Java\jre\lib\ext\sunpkcs11.jar;
        * E:\Program Files\Java\jre\lib\ext\zipfs.jar;
        * E:\Program Files\Java\jre\lib\javaws.jar;
        * E:\Program Files\Java\jre\lib\jce.jar;
        * E:\Program Files\Java\jre\lib\jfr.jar;
        * E:\Program Files\Java\jre\lib\jfxswt.jar;
        * E:\Program Files\Java\jre\lib\jsse.jar;
        * E:\Program Files\Java\jre\lib\management-agent.jar;
        * E:\Program Files\Java\jre\lib\plugin.jar;E
        * :\Program Files\Java\jre\lib\resources.jar;
        * E:\Program Files\Java\jre\lib\rt.jar;
        * E:\soft\workspace\java\reflection\out\production\reflection;
        * D:\Program Files (x86)\IDEA\IntelliJ IDEA 2020.3.2\lib\idea_rt.jar
         * */
    }
}
