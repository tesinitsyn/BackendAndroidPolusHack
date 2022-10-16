package com.example.demo.controller;

import com.example.demo.entity.DriverEntity;
import com.example.demo.entity.OrderEntity;
import com.example.demo.service.DriverService;
import com.example.demo.service.OrderService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
public class Controller {

    private final DriverService driverService;
    private final OrderService orderService;


    public Controller(DriverService driverService, OrderService orderService) {
        this.driverService = driverService;
        this.orderService = orderService;

    }
    @GetMapping("/driver")
    public List<DriverEntity> findAllDrivers(){
        return driverService.findAllDrivers();
    }

    @GetMapping("/driver/{id}")
    public Optional<DriverEntity> findDriverById(@PathVariable("id") Long id){
        return driverService.findById(id);
    }

    @PostMapping("/driver")
    public DriverEntity saveDrivers(@RequestBody DriverEntity driverEntity){
        return driverService.saveDriver(driverEntity);
    }

    @PutMapping("/driver")
    public DriverEntity updateDrivers(@RequestBody DriverEntity driverEntity){
        return driverService.updateDriver(driverEntity);
    }
    @DeleteMapping("driver/{id}")
    public void deleteDrivers(@PathVariable("id") Long id){
        driverService.deleteDriver(id);
    }
    @GetMapping("/order")
    public List<OrderEntity> findAllOrders(){
        return orderService.findAllOrder();
    }
    @GetMapping("/order/{id}")
    public Optional<OrderEntity> findOrderById(@PathVariable("id") Long id){
        return orderService.findById(id);
    }

    @PostMapping("/order")
    public OrderEntity saveOrders(@RequestBody OrderEntity orderEntity){
        return orderService.saveOrder(orderEntity);
    }

    @PutMapping("/order")
    public OrderEntity updateOrders(@RequestBody OrderEntity orderEntity){
        return orderService.updateOrder(orderEntity);
    }

    @DeleteMapping("/order/{id}")
    public void deleteOrder(@PathVariable("id") Long id){
        orderService.deleteOrder(id);
    }
}
