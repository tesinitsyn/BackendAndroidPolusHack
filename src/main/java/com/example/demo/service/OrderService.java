package com.example.demo.service;

import com.example.demo.entity.DriverEntity;
import com.example.demo.entity.OrderEntity;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    List<OrderEntity> findAllOrder();
    Optional<OrderEntity> findById(Long id);
    OrderEntity saveOrder(OrderEntity orderEntity);
    OrderEntity updateOrder(OrderEntity orderEntity);
    void deleteOrder(Long id);
}
