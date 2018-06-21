package com.javadoop.springaoplearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javadoop.springaoplearning.service.OrderService;
import com.javadoop.springaoplearning.service.UserService;

/**
 * @author: hongjie
 * @date: 2018/6/18
 */

public class Application {

    public static void main(String[] args) {

//        test_Spring_1_2_Advice();
//        test_Spring_1_2_Advisor();
//        test_Spring_1_2_BeanNameAutoProxy();
//        test_Spring_1_2_DefaultAdvisorAutoProxy();
        test_Spring_2_0_AspectJ();
//        test_Spring_2_0_Schema_Based();
    }


    public static void test_Spring_1_2_Advice() {

        // 启动 Spring 的 IOC 容器
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring_1_2_advice.xml");

        // 我们这里要取 AOP 代理：userServiceProxy，这非常重要
        UserService userService = (UserService) context.getBean("userServiceProxy");

        userService.createUser("Tom", "Cruise", 55);
        userService.queryUser();
    }

    public static void test_Spring_1_2_Advisor() {

        // 启动 Spring 的 IOC 容器
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring_1_2_advisor.xml");

        // 我们这里要取 AOP 代理：userServiceProxy，这非常重要
        UserService userService = (UserService) context.getBean("userServiceProxy");

        userService.createUser("Tom", "Cruise", 55);
        userService.queryUser();
    }

    public static void test_Spring_1_2_BeanNameAutoProxy() {

        // 启动 Spring 的 IOC 容器
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring_1_2_BeanNameAutoProxy.xml");

        // 注意这里，不再需要根据代理找 bean
        UserService userService = context.getBean(UserService.class);
        OrderService orderService = context.getBean(OrderService.class);

        userService.createUser("Tom", "Cruise", 55);
        userService.queryUser();

        orderService.createOrder("Leo", "随便买点什么");
        orderService.queryOrder("Leo");
    }

    public static void test_Spring_1_2_DefaultAdvisorAutoProxy() {

        // 启动 Spring 的 IOC 容器
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring_1_2_DefaultAdvisorAutoProxy.xml");

        UserService userService = context.getBean(UserService.class);
        OrderService orderService = context.getBean(OrderService.class);

        userService.createUser("Tom", "Cruise", 55);
        userService.queryUser();

        orderService.createOrder("Leo", "随便买点什么");
        orderService.queryOrder("Leo");
    }

    public static void test_Spring_2_0_AspectJ() {

        // 启动 Spring 的 IOC 容器
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring_2_0_aspectj.xml");

        UserService userService = context.getBean(UserService.class);

        userService.createUser("Tom", "Cruise", 55);
        userService.queryUser();
    }

    public static void test_Spring_2_0_Schema_Based() {

        // 启动 Spring 的 IOC 容器
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring_2_0_schema_based.xml");

        UserService userService = context.getBean(UserService.class);

        userService.createUser("Tom", "Cruise", 55);
    }


}
