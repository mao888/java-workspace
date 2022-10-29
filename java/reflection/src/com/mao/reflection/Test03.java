package com.bobo.util.reflection.src.com.mao.reflection;

//测试class类的创建方式有哪些
public class Test03 {

    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new student();
        System.out.println("这个人是："+person.hashCode());

        //方式1：通过对象获得            1163157884
        Class aClass1 = person.getClass();
        System.out.println(aClass1.hashCode());

        //方式2：forname获取           1163157884
        Class aClass2 = Class.forName("com.bobo.util.reflection.src.com.mao.reflection.student");
        System.out.println(aClass2.hashCode());

        //方式3：通过类名.class 获得     1163157884
        Class studentClass = student.class;
        System.out.println(studentClass.hashCode());

        //方式4:基本内置类型的包装类都有一个Type 属性
        final Class type = Integer.TYPE;
        System.out.println(type);       // int

        //方式5：获得父类类型
        final Class superclass = aClass1.getSuperclass();
        System.out.println(superclass);
        // class com.bobo.util.reflection.src.com.mao.reflection.Test03$Person
    }

    static class Person{
        public String name;

        public Person() {
        }
        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}

class student extends Test03.Person {
    public static int a = 3;

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        student.a = a;
    }

    public student() {
        this.name="学生";
    }
}

class teacher extends Test03.Person {
    public teacher() {
        this.name="老师";
    }
}

