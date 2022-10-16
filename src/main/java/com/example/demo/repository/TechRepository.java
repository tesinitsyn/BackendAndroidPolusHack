package com.example.demo.repository;


import com.example.demo.entity.TechEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechRepository extends JpaRepository<TechEntity, Long> {

}
