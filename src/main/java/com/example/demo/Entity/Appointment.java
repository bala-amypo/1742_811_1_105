package com.example.demo.Entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Appointment")
public class Appointment{
    public Appointment(){}
    public class ENUM{
        SCHEDULED,

    }
}