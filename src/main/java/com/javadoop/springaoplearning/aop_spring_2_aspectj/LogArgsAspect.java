package com.javadoop.springaoplearning.aop_spring_2_aspectj;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author: hongjie
 * @date: 2018/6/10
 */

@Aspect
public class LogArgsAspect {

    // 这里可以设置一些自己想要的属性，到时候在配置的时候注入进来
    private boolean trace = true;

    @Before("com.javadoop.springaoplearning.aop_spring_2_aspectj.SystemArchitecture.businessService()")
    public void logArgs(JoinPoint joinPoint) {
        if (trace) {
            System.out.println("[@AspectJ]方法执行前，打印入参：" + Arrays.toString(joinPoint.getArgs()));
        }
    }

    public void setTrace(boolean trace) {
        this.trace = trace;
    }

}
