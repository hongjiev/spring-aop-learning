package com.javadoop.springaoplearning.service;

import com.javadoop.springaoplearning.model.Order;


public interface OrderService {

    Order createOrder(String username, String product);

    Order queryOrder(String username);
}
