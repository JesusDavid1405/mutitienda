package com.sena.dataBaseCrud.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sena.dataBaseCrud.model.rol;

@Repository
public interface IRol extends JpaRepository<rol, Integer> {

}
