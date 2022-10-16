package com.example.demo.controller;

import com.example.demo.entity.DriverEntity;
import com.example.demo.entity.OrderEntity;
import com.example.demo.service.OrderService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @GetMapping
    public List<OrderEntity> findAllOrders(){
        return orderService.findAllOrder();
    }
    @GetMapping("/{id}")
    public Optional<OrderEntity> findOrderById(@PathVariable("id") Long id){
        return orderService.findById(id);
    }

    @PostMapping
    public OrderEntity saveOrders(@RequestBody OrderEntity orderEntity){
        return orderService.saveOrder(orderEntity);
    }
    @PostMapping("/asdfax")

    @PutMapping
    public OrderEntity updateOrders(@RequestBody OrderEntity orderEntity){
        return orderService.updateOrder(orderEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable("id") Long id){
        orderService.deleteOrder(id);
    }
}
