package com.example.demo.Entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Appointment")
public class Appointment{
    public Appointment(){}
    public class ENUM{
        SCHEDULED,
        CANCELLED,
        COMPLETED
        }
    @Id
    @GeneratedType(strategy=GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinCloumn(name = "visitor_id")
    private Visitor visitor
}