/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.GENPLC.website.repositorios;

import com.GENPLC.website.entidades.Formulario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Fabi
 */
@Repository
public interface FormularioRepositorio extends JpaRepository<Formulario,String>{
    
    
}
