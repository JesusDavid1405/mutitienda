package com.sena.dataBaseCrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.dataBaseCrud.interfaces.IUser;

import com.sena.dataBaseCrud.model.user;

@Service
public class userService {

    @Autowired
    private IUser userData;

    public List<user> findAllUser(){
        return userData.findAll();
    }

    public Optional<user> findByIdAllUser(int id){
        return userData.findById(id);
    }

    public void saveUser(user user){
        userData.save(user);
    }

    public void updateUser(int id, user userUpdate){
        var users = findByIdAllUser(id);
        if(users.isPresent()){
            users.get().setName(userUpdate.getName());
            users.get().setLastName(userUpdate.getLastName());
            users.get().setIdentification(userUpdate.getIdentification());
            users.get().setPhone(userUpdate.getPhone());
            userData.save(users.get());
        }
    }

    public void deleteUser(int id){
        var users = findByIdAllUser(id);
        if(users.isPresent()){
            userData.delete(users.get());
        }
    }

}
