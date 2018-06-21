package com.javadoop.springaoplearning.aop_spring_2_schema_based;

import org.aspectj.lang.annotation.Pointcut;

public class SystemArchitecture {

    @Pointcut("within(com.javadoop.springaoplearning.web..*)")
    public void inWebLayer() {
    }

    @Pointcut("within(com.javadoop.springaoplearning.service..*)")
    public void inServiceLayer() {
    }

    @Pointcut("execution(* com.javadoop.springaoplearning.service.*.*(..))")
    public void businessService() {
    }

}
