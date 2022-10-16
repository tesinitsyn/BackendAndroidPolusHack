package com.example.demo.service.impl;

import com.example.demo.entity.OrderEntity;
import com.example.demo.repository.OrderRepository;
import com.example.demo.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<OrderEntity> findAllOrder() {
        return orderRepository.findAll();
    }

    @Override
    public Optional<OrderEntity> findById(Long id) {
        return orderRepository.findById(id);
    }

    @Override
    public OrderEntity saveOrder(OrderEntity orderEntity) {
        return orderRepository.save(orderEntity);
    }

    @Override
    public OrderEntity updateOrder(OrderEntity orderEntity) {
        return orderRepository.save(orderEntity);
    }

    @Override
    public void deleteOrder(Long id) {
        if(orderRepository.existsById(id))
            orderRepository.deleteById(id);
    }
}
