package com.sena.dataBaseCrud.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.dataBaseCrud.model.category;

@Repository
public interface ICategory extends JpaRepository<category, Integer> {
    
}
