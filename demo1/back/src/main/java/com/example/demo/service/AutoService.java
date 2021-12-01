/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.repository.AutoRepository;
import com.example.demo.model.Auto;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sebastian
 * Actua como intermediario entre el repository y controlador
 */
@Service
@Transactional
public class AutoService {
    
    @Autowired
    private AutoRepository autoRepository;
    
    public List<Auto> getAll() {
        return autoRepository.findAll();
    }
    
    public void saveAuto( Auto auto ) {
        autoRepository.save(auto);
    }
    
}
