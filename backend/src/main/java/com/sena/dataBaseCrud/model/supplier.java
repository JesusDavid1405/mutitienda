package com.sena.dataBaseCrud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "supplier")
@Getter
@Setter
public class supplier {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name ="id", length =11, nullable =false)
    private int id;

    @Column(name = "name", length = 255, nullable = false)
    private String name;

    @Column(name = "phone", length = 20, nullable = false)
    private int phone;

    @Column(name = "email", length = 255, nullable = false)
    private String email;

    @Column(name = "address", length = 255, nullable = false)
    private String address;

    public supplier(){
    }

    public supplier(int id, String name, int phone, String email, String address){
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

}
