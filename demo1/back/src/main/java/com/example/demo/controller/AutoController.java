/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.service.AutoService;
import com.example.demo.model.Auto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sebastian
 */

@RestController
@RequestMapping( "autos" )
public class AutoController {
    @Autowired
    public AutoService autoService;
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("")
    public List<Auto> list() {
        return autoService.getAll();
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("")
    public void add( @RequestBody Auto auto ) {
        autoService.saveAuto(auto);
        System.out.println("Se guardó el auto con éxito.");
    }
    
    
}
