package com.sena.dataBaseCrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.dataBaseCrud.model.rol;

import com.sena.dataBaseCrud.interfaces.IRol;

@Service
public class rolService {

    @Autowired
    private IRol rolData;

    public List<rol> findAllRol(){
        return rolData.findAll();
    }

    public Optional<rol> findByIdAllRol(int id){
        return rolData.findById(id);
    }

    public void saveRol(rol rol){
        rolData.save(rol);
    }

    public void updateRol(int id, rol rolUpdate){
        var rols = findByIdAllRol(id);
        if (rols.isPresent()){
            rols.get().setName(rolUpdate.getName());
            rols.get().setDescription(rolUpdate.getDescription());
            rolData.save(rols.get());
        }   
    }

    public void deleteRol(int id){
        var rol = findByIdAllRol(id);
        if (rol.isPresent()) {
            rolData.delete(rol.get());
        }
    }
    
}
