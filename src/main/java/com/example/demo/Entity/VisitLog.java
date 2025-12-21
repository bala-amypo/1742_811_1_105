package com.example.demo.Entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "VisitLog")
public class VisitLog{
    public VisitLog(){}
    @Id
    @GeneratedValue(strategy=GenerationValue.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "visitor_id")
    private Visitor visitor;
    @ManyToOne
    @JoinColumn(name = "host_id")
    private Host host;
    private LocalDateTime appointmentDate;
    private LocalDateTime checkOutTime;
    private String purpose;
    private Boolean access


}