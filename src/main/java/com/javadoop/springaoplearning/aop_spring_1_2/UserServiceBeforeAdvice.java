package com.javadoop.springaoplearning.aop_spring_1_2;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * @author: hongjie
 * @date: 2018/5/29
 */
public class UserServiceBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("准备执行方法: " + method.getName() + ", 参数：" + Arrays.toString(args));
    }

}
