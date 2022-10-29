package com.bobo.jdk.res;

import com.bobo.jdk.lambda.domain.Person;
import org.junit.Test;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Test06 {


    @Test
    public void test01(){
        //String userName = "张三";
        String userName = null;
        if(userName != null){
            System.out.println("字符串的长度：" + userName.length());
        }else{
            System.out.println("字符串为空");
        }

    }

    /**
     * Optional对象的创建方式
     */
    @Test
    public void test02(){
        // 第一种方式 通过of方法  of方法是不支持null的
        Optional<String> op1 = Optional.of("zhangsan");
        //Optional<Object> op2 = Optional.of(null);

        // 第二种方式通过 ofNullable方法 支持null
        Optional<String> op3 = Optional.ofNullable("lisi");
        Optional<Object> op4 = Optional.ofNullable(null);

        // 第三种方式 通过empty方法直接创建一个空的Optional对象
        Optional<Object> op5 = Optional.empty();

    }

    /**
     * Optional中的常用方法介绍
     *   get(): 如果Optional有值则返回，否则抛出NoSuchElementException异常
     *          get()通常和isPresent方法一块使用
     *   isPresent():判断是否包含值，包含值返回true，不包含值返回false
     *   orElse(T t):如果调用对象包含值，就返回该值，否则返回t
     *   orElseGet(Supplier s):如果调用对象包含值，就返回该值，否则返回 Lambda表达式的返回值
     */
    @Test
    public void test03(){
        Optional<String> op1 = Optional.of("zhangsan");
        Optional<String> op2 = Optional.empty();

        // 获取Optional中的值
        if(op1.isPresent()){
            String s1 = op1.get();
            System.out.println("用户名称:" +s1);
        }

        if(op2.isPresent()){
            System.out.println(op2.get());
        }else{
            System.out.println("op2是一个空Optional对象");
        }

        String s3 = op1.orElse("李四");
        System.out.println(s3);
        String s4 = op2.orElse("王五");
        System.out.println(s4);

        String s5 = op2.orElseGet(()->{
            return "Hello";
        });
        System.out.println(s5);
    }


    @Test
    public void test04(){
        Optional<String> op1 = Optional.of("zhangsan");
        Optional<String> op2 = Optional.empty();
        // 如果存在值 就做什么
        op1.ifPresent(s-> System.out.println("有值:" +s));
        op1.ifPresent(System.out::println);
    }

    /**
     * 自定义一个方法，将Person对象中的 name 转换为大写 并返回
     */
    @Test
    public void test05(){
        Person p = new Person("zhangsan",18);
        Optional<Person> op = Optional.of(p);
        String name = getNameForOptional(op);
        System.out.println("name="+name);

    }

    /**
     * 根据Person对象 将name转换为大写并返回
     *    通过Optional方式实现
     * @param op
     * @return
     */
    public String getNameForOptional(Optional<Person> op){
       if(op.isPresent()){
           String msg = //op.map(p -> p.getName())
                   op.map(Person::getName)
                   //.map(p -> p.toUpperCase())
                   .map(String::toUpperCase)
                   .orElse("空值");
           return msg;
       }
       return null;
    }

    /**
     * 根据Person对象 将name转换为大写并返回
     * @param person
     * @return
     */
    public String getName(Person person){
        if(person != null){
            String name = person.getName();
            if(name != null){
                return name.toUpperCase();
            }else{
                return null;
            }
        }else{
            return null;
        }
    }

}
