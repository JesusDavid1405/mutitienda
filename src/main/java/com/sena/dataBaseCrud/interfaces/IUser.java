package com.sena.dataBaseCrud.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sena.dataBaseCrud.model.user;

@Repository
public interface IUser extends JpaRepository<user, Integer> {
    
}
