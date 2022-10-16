package com.example.demo.service;

import com.example.demo.entity.TechEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface TechService {
    List<TechEntity> findAllTech();

    Optional<TechEntity> findById(Long techId);

    TechEntity saveTech(TechEntity techEntity);

    TechEntity updateTech(TechEntity techEntity);

    void deleteTech(Long techId);

}
