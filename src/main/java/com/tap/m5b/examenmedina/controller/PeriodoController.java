/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tap.m5b.examenmedina.controller;

import com.tap.m5b.examenmedina.service.PeriodoServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tap.m5b.examenmedina.modelo.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author USUARIO
 */
@RestController
@RequestMapping("/api/periodo")
public class PeriodoController {
    @Autowired
    PeriodoServiceImpl periodoService;
    
    @GetMapping("/listar")
    public ResponseEntity<List<Periodo>> listarPeriodos() {
        return new ResponseEntity<>(periodoService.findByAll(), 
                HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Periodo> crearPeriodo(
            @RequestBody Periodo p) {
        return new ResponseEntity<>(periodoService.save(p), 
                HttpStatus.CREATED);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Periodo> eliminarPeriodo(@PathVariable Long id) {
        periodoService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    /*@PutMapping("/actualizar/{id}")
    public ResponseEntity<Periodo> actualizarPeriodo(@PathVariable Long id, @RequestBody Periodo p) {
        //Periodo periodoEn = = periodoService.findById(id); 
    }*/
    
}


