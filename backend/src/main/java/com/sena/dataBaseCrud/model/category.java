package com.sena.dataBaseCrud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "category")
@Getter
@Setter
public class category {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name ="id", length = 10, nullable =false)
    private int id;

    @Column(name ="name", length = 100, nullable = false )
    private String name;

    @Column(name ="description", length = 500, nullable = false )
    private String decription;

    public category(){
    }

    public category(int id, String name, String description){
        this.id = id;
        this.name = name;
        this.decription = description;
    }
}
