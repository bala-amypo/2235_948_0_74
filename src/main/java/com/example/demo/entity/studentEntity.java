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
    public void getName(){
        return name;

    }
}