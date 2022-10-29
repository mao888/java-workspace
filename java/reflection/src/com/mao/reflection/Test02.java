package com.bobo.util.reflection.src.com.mao.reflection;

//什么叫反射
public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 通过反射获取类的class对象
        Class<?> c = Class.forName("com.bobo.util.reflection.src.com.mao.reflection.User");
        System.out.println(c);
        Class<?> c1 = Class.forName("com.bobo.util.reflection.src.com.mao.reflection.User");
        Class<?> c2 = Class.forName("com.bobo.util.reflection.src.com.mao.reflection.User");
        Class<?> c3 = Class.forName("com.bobo.util.reflection.src.com.mao.reflection.User");
        Class<?> c4 = Class.forName("com.bobo.util.reflection.src.com.mao.reflection.User");
        // 一个类在内存中只有一个Class对象
        // 一个类被加载后,类的整个结构都会被封装在Class对象中
        /**
         * public native int hashCode();返回该对象的hash码值
         * 	注：哈希值是根据哈希算法算出来的一个值，这个值跟地址值有关，但不是实际地址值。
         */
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
        /**
         * 460141958
         * 460141958
         * 460141958
         * 460141958
         * */
    }
}

//实体类
class User {
    private String name;
    private int id;
    private int age;

    public User() {         // 无构造器
    }

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(   int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
