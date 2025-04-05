package com.sena.dataBaseCrud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name= "user")
@Getter
@Setter
public class user {
    
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "Id", length = 10, nullable = false)
    private int id;
    @Column(name = "Name", length = 225, nullable = false)
    private String name;
    @Column(name = "LastName", length = 225, nullable = false)
    private String lastName;
    @Column(name = "Identification", length = 25, nullable = false)
    private int identification;
    @Column(name = "Phone", length = 15, nullable = false)
    private int phone;
}
