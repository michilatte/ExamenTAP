/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tap.m5b.examenmedina.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.tap.m5b.examenmedina.modelo.Periodo;

/**
 *
 * @author USUARIO
 */
public interface PeriodoRepository extends MongoRepository<Periodo, Long>{
    
}
