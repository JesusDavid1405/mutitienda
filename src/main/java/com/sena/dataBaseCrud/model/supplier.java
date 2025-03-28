package com.sena.dataBaseCrud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "supplier")
public class supplier {
    @Id

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
}
