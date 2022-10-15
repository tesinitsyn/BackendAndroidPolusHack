package com.example.demo.controller;

import com.example.demo.entity.DriverEntity;
import com.example.demo.service.DriverService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/driver")
public class DriverController {
    private final DriverService driverService;

    public DriverController(DriverService driverService) {
        this.driverService = driverService;
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
