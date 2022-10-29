package com.bobo.util.reflection.src.com.bobo;

import java.util.List;

public class Test06 {

    /**
     * Java中哪些类型具有 Class类对象
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("String.class = " + String.class);
        System.out.println("List.class = " + List.class);
        System.out.println("Integer[].class = " + Integer[].class);
        System.out.println("Integer[][].class = " + Integer[][].class);
        System.out.println("Thread.State.class = " + Thread.State.class);
        System.out.println("int.class = " + int.class);
        System.out.println("void.class = " + void.class);
    }
}
