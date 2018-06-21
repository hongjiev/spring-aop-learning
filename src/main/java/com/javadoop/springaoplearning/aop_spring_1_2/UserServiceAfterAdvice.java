package com.javadoop.springaoplearning.aop_spring_1_2;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 * @author: hongjie
 * @date: 2018/5/29
 */
public class UserServiceAfterAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("方法返回：" + returnValue);
    }
}
