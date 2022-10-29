package com.bobo.jdk.stream;

import com.bobo.jdk.lambda.domain.Person;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest19MapToInt {

    public static void main(String[] args) {
        // Integer占用的内存比int多很多，在Stream流操作中会自动装修和拆箱操作
        Integer arr[] = {1,2,3,5,6,8};
        Stream.of(arr)
                .filter(i->i>0)
                .forEach(System.out::println);
        System.out.println("---------");
        // 为了提高程序代码的效率，我们可以先将流中Integer数据转换为int数据，然后再操作
        IntStream intStream = Stream.of(arr)
                .mapToInt(Integer::intValue);
        intStream.filter(i->i>3)
                .forEach(System.out::println);

    }
}







