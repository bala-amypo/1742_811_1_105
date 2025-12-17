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

    public long getId(){
        return studentId;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setName(String father_name ){
        this.father_name = father_name;
    }
    public void setName(int age){
        this.age = age;
    }
     public String getName(){
        return name;
     }

     public String getfather_name(){
        return father_name;
     }
     public int getAge(){
        return age;
     }
}