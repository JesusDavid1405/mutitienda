package com.sena.dataBaseCrud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
          

@Entity(name = "store")
@Getter
@Setter
public class store {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name ="id", length = 10, nullable = false)
    private int id;
    @Column(name = "name", length = 225, nullable = false)
    private String name;
    @Column(name ="address", length= 50, nullable=false)
    private String address;
    @Column(name ="logo", length = 500, nullable =true)
    private String logo;
    @Column(name ="state", length = 1, nullable =false)
    private boolean state;

    public store(){
    }

    public store(int id, String name, String address, String logo, boolean state){
        this.id = id;
        this.name = name;
        this.address = address;
        this.logo = logo;
        this.state = state;
    }
}
