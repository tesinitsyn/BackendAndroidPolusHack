package com.example.demo.repository;

import com.example.demo.entity.DriverEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriversRepository extends JpaRepository<DriverEntity, Long> {
}
