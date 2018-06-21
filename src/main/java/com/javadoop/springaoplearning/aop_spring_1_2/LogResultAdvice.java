package com.javadoop.springaoplearning.aop_spring_1_2;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;


public class LogResultAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target)
            throws Throwable {
        System.out.println("[advice]方法返回：" + returnValue);
    }
}
