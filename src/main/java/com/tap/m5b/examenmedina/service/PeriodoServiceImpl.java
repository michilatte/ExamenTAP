/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tap.m5b.examenmedina.service;

import com.tap.m5b.examenmedina.modelo.Periodo;
import com.tap.m5b.examenmedina.repository.PeriodoRepository;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author USUARIO
 */

@Service
public class PeriodoServiceImpl extends GenericServiceImpl<Periodo, Long> implements GenericService<Periodo, Long>{

    @Autowired
    PeriodoRepository periodoRepository;
    
    @Override
    public CrudRepository<Periodo, Long> getDao() {
        return periodoRepository;
    }
    
}


