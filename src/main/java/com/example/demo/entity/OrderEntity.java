package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter@Setter
@Entity
@Table(name = "orders")
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "orderId")
    private Long orderId;
    @Column(name = "type")
    private Integer type;
    @Column(name = "name")
    private String name;
    @Column(name = "status")
    private String status;
    @Column(name = "executorId")
    private Long executorId;
    @Column(name = "carId")
    private Long carId;
    @Column(name = "date_start")
    private String date_start;
    @Column(name = "date_end")
    private String date_end;
    @Column(name = "comment")
    private String comment;
}
