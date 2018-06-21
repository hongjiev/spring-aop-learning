package com.javadoop.springaoplearning.aop_spring_2_aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SystemArchitecture {

    @Pointcut("within(com.javadoop.springaoplearning.web..*)")
    public void inWebLayer() {}

    @Pointcut("within(com.javadoop.springaoplearning.service..*)")
    public void inServiceLayer() {}

//    @Pointcut("within(com.javadoop.springaoplearning.dao..*)")
//    public void inDataAccessLayer() {}

    @Pointcut("execution(* com.javadoop.springaoplearning.service.*.*(..))")
    public void businessService() {}

//    @Pointcut("execution(* com.javadoop.springaoplearning.dao.*.*(..))")
//    public void dataAccessOperation() {}

}
