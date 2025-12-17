package com.example.demo.Entity;
import jakarta.persistance.Entity;
import jakarta.persistance.Id;

@Entity
public class StudentEntity{

    @Id
    private int studentId;

}