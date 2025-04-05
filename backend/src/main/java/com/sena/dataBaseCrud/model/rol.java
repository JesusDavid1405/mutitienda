package com.sena.dataBaseCrud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "rol")
@Getter
@Setter
public class rol {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name ="id", length = 10, nullable = false)
    private int id;    

    @Column(name = "name", length = 225, nullable = false)
    private String name;

    @Column(name = "description", length = 1000, nullable = false)
    private String description;

    public rol(){
    }

    public rol(int id, String name, String description){
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
