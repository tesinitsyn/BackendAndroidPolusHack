package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "drivers")
public class DriverEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "nsm")
    private String nsm;
    @Column(name = "vehicle_type")
    private String vehicleType;
    @Column(name = "taskid")
    private int taskId;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @Column(name = "specialization")
    private Integer specialization;

    public DriverEntity(Long id, String nsm, String vehicleType, int taskId, String login, String password, Integer specialization) {
        this.id = id;
        this.nsm = nsm;
        this.vehicleType = vehicleType;
        this.taskId = taskId;
        this.login = login;
        this.password = password;
        this.specialization = specialization;
    }

    public DriverEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNsm() {
        return nsm;
    }

    public void setNsm(String nsm) {
        this.nsm = nsm;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Integer specialization) {
        this.specialization = specialization;
    }
}
