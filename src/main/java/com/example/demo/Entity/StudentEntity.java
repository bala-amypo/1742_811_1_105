package com.example.demo.Entity;
import jakarta.persistance.Entity;
import jakarta.persistance.Id;

@Entity
public class StudentEntity{

    @Id
    private long studentId;

    private String name;
    private String father_name;
    private int age;

}