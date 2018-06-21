package com.javadoop.springaoplearning.service.imple;

import com.javadoop.springaoplearning.model.User;
import com.javadoop.springaoplearning.service.UserService;


public class UserServiceImpl implements UserService {

    @Override
    public User createUser(String firstName, String lastName, int age) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);
        return user;
    }

    @Override
    public User queryUser() {
        User user = new User();
        user.setFirstName("test");
        user.setLastName("test");
        user.setAge(20);
        return user;
    }
}
