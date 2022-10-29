package com.bobo.jdk.anno;

@MyAnnotation("test1")
@MyAnnotation("test2")
@MyAnnotation("test3")
public class AnnoTest01 {

    @MyAnnotation("fun1")
    @MyAnnotation("fun2")
    public void test01(){

    }

    /**
     * 解析重复注解
     * @param args
     */
    public static void main(String[] args) throws NoSuchMethodException {
        // 获取类中标注的重复注解
        MyAnnotation[] annotationsByType = AnnoTest01.class.getAnnotationsByType(MyAnnotation.class);
        for (MyAnnotation myAnnotation : annotationsByType) {
            System.out.println(myAnnotation.value());
        }
        // 获取方法上标注的重复注解
        MyAnnotation[] test01s = AnnoTest01.class.getMethod("test01")
                .getAnnotationsByType(MyAnnotation.class);
        for (MyAnnotation test01 : test01s) {
            System.out.println(test01.value());
        }
    }
}
