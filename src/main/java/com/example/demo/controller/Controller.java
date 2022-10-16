package com.example.demo.controller;

import com.example.demo.entity.DriverEntity;
import com.example.demo.service.DriverService;
import com.example.demo.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class Controller {

    private final DriverService driverService;
    private final OrderService orderService;

    public Controller(DriverService driverService, OrderService orderService) {
        this.driverService = driverService;
        this.orderService = orderService;

    }


    @RequestMapping("/driver")
    public void createDriverController() {

    }
    @GetMapping
    public List<DriverEntity> findAllDrivers(){
        return driverService.findAllDrivers();
    }

    @GetMapping("/{id}")
    public Optional<DriverEntity> findDriverById(@PathVariable("id") Long id){
        return driverService.findById(id);
    }

    @PostMapping
    public DriverEntity saveDrivers(@RequestBody DriverEntity driverEntity){
        return driverService.saveDriver(driverEntity);
    }

    @PutMapping
    public DriverEntity updateDrivers(@RequestBody DriverEntity driverEntity){
        return driverService.updateDriver(driverEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteDrivers(@PathVariable("id") Long id){
        driverService.deleteDriver(id);
    }
}
