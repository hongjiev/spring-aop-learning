package com.javadoop.springaoplearning.service;

import com.javadoop.springaoplearning.model.User;


public interface UserService {

    User createUser(String firstName, String lastName, int age);

    User queryUser();
}
