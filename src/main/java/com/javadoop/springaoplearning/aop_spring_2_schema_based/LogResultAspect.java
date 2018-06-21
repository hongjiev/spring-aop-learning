package com.javadoop.springaoplearning.aop_spring_2_schema_based;

/**
 * @author: hongjie
 * @date: 2018/6/11
 */

public class LogResultAspect {

    public void logResult(Object result) {
        System.out.println("[schema-based]返回值：" + result);
    }
}
