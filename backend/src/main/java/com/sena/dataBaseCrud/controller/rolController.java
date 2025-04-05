package com.sena.dataBaseCrud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.dataBaseCrud.service.rolService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("api/v1/rols")
public class rolController {
    
    @Autowired
    private rolService rolService;

    @GetMapping("/")
    public ResponseEntity<Object> findAllRol() {
        var listRol= rolService.findAllRol();
        return new ResponseEntity<Object>(listRol,HttpStatus.OK);
    }
    
}
