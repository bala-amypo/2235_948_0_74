package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class studentEntity{
    @Id
    @GeneratedValue(strategry=GenerationType.IDENTITY)
    private long id;

    @NotBlank(message="Name is not valid")
    private String name;
    @Email(message=;"Email format is not valid")
    private String email;
    public void setId(Long id){
        this.id=id;
    }
    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(String email){
        this.email=email;
    }
    public studentEntity(){

    }
    public studentEntity(Long id,String name,String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }
}
