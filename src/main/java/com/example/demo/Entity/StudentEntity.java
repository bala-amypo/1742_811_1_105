package com.example.demo.Entity;
import jakarta.persistance.*;




@Entity
public class StudentEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentId;

    private String name;
    private String father_name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
}