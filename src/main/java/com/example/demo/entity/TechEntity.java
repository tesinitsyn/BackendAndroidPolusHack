package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "tech")
public class TechEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tech_id")
    private Long techId;

    @Column(name = "tech_park")
    private String techPark;

    @Column(name = "characteristics")
    private String characteristics;

    @Column(name = "tech_name")
    private String techName;

    @Column(name = "tech_Number")
    private String techNumber;

    public TechEntity() {
    }

    public TechEntity(Long techId, String techPark, String characteristics, String techName, String techNumber) {
        this.techId = techId;
        this.techPark = techPark;
        this.characteristics = characteristics;
        this.techName = techName;
        this.techNumber = techNumber;
    }

    public Long getTechId() {
        return techId;
    }

    public void setTechId(Long techId) {
        this.techId = techId;
    }

    public String getTechPark() {
        return techPark;
    }

    public void setTechPark(String techPark) {
        this.techPark = techPark;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public String getTechName() {
        return techName;
    }

    public void setTechName(String techName) {
        this.techName = techName;
    }

    public String getTechNumber() {
        return techNumber;
    }

    public void setTechNumber(String techNumber) {
        this.techNumber = techNumber;
    }
}
