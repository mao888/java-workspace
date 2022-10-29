package com.bobo.util.reflection.src.com.mao.reflection;

import java.lang.annotation.*;
import java.lang.reflect.Field;

// 练习反射操作注解
public class Test12 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        // 通过反射获取class对象
        final Class aClass = Class.forName("com.bobo.util.reflection.src.com.mao.reflection.student02");
        // 通过反射获取注解
        final Annotation[] annotations = aClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);     // @com.bobo.util.reflection.src.com.mao.reflection.TableHu(value=db_student)
        }

        // 获取注解的value值
        final TableHu annotation = (TableHu) aClass.getAnnotation(TableHu.class);
        final String value = annotation.value();
        System.out.println(value);      //db_student

        // 获得类指定的注解
        final Field fields = aClass.getDeclaredField("name");
        final FieldHu annotation1 = fields.getAnnotation(FieldHu.class);
        System.out.println(annotation1.columnName());   // db_name
        System.out.println(annotation1.type());         // varchar
        System.out.println(annotation1.length());       // 10

    }
}

@TableHu("db_student")
class student02{

    @FieldHu(columnName = "db_id",type = "int",length = 10)
    private int id;
    @FieldHu(columnName = "db_age",type = "int",length = 10)
    private int age;
    @FieldHu(columnName = "db_name",type = "varchar",length = 10)
    private String name;

    public student02() {
    }

    public student02(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "student02{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

// 类名注解
@Target(ElementType.TYPE)    // 类上生效
@Retention(RetentionPolicy.RUNTIME)
@interface TableHu{
    String value();
}

@Target(ElementType.FIELD)  // 属性上生效
@Retention(RetentionPolicy.RUNTIME)
@interface FieldHu{
    String columnName();
    String type();
    int  length();
}