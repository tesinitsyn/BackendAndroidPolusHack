package com.example.demo.service;

import com.example.demo.entity.DriverEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

public interface DriverService {
    List<DriverEntity> findAllDrivers();
    Optional<DriverEntity> findById(Long id);
    DriverEntity saveDriver(DriverEntity driverEntity);
    DriverEntity updateDriver(DriverEntity driverEntity);
    void deleteDriver(Long id);
}
