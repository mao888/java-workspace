package com.mao.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class Afterlog implements AfterReturningAdvice {

    //returnValue 返回值
    //method被调用的方法
    //args 被调用的方法的对象的参数
    //target 被调用的目标对象
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {

    }
}
