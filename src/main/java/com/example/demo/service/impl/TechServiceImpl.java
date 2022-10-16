package com.example.demo.service.impl;

import com.example.demo.entity.TechEntity;
import com.example.demo.repository.TechRepository;
import com.example.demo.service.TechService;

import java.util.List;
import java.util.Optional;

public class TechServiceImpl implements TechService {
    private final TechRepository techRepository;

    public TechServiceImpl(TechRepository techRepository){
        this.techRepository = techRepository;
    }


    @Override
    public List<TechEntity> findAllTech() {
        return techRepository.findAll();
    }

    @Override
    public Optional<TechEntity> findById(Long techId) {
        return techRepository.findById(techId);
    }

    @Override
    public TechEntity saveTech(TechEntity techEntity) {
        return techRepository.save(techEntity);
    }

    @Override
    public TechEntity updateDriver(TechEntity techEntity) {
        return techRepository.save(techEntity);
    }

    @Override
    public void deleteDriver(Long techId) {
        techRepository.deleteById(techId);
    }
}
