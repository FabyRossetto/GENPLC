/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.GENPLC.website.servicios;

import com.GENPLC.website.entidades.Formulario;
import com.GENPLC.website.repositorios.FormularioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Fabi
 */
@Service
public class FormularioServicio {
    
    @Autowired
    FormularioRepositorio form;
    
    public void validar( String mail,String nombre, String apellido, String tema, String consulta) throws Exception {

       
        if (mail == null || mail.trim().isEmpty()) {
            throw new Exception(" El mail no puede ser nulo");
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new Exception(" Usted debe ingresar su nombre");
        }
        if (apellido== null || apellido.trim().isEmpty()) {
            throw new Exception(" Usted debe ingresar su apellido");
        }
        if (tema == null || tema.trim().isEmpty()) {
            throw new Exception(" Usted debe ingresar el tema");
        }
        if (consulta == null || consulta.trim().isEmpty()) {
            throw new Exception(" Usted debe ingresar la consulta");
        }
         

    }
    @Transactional
    public Formulario CrearFormulario (String mail,String nombre,String apellido, String tema, String consulta) throws Exception {
//se le pasa por parametro lo que el usuario llena 
        try {
            validar( mail, nombre, apellido, tema, consulta);
            Formulario f =new Formulario();
            
            f.setMail(mail);
            f.setNombre(nombre);
            f.setApellido(apellido);
            f.setTema(tema);
            f.setConsulta(consulta);

            return form.save(f);

        } catch (Exception e) {
            System.out.println("No se a podido llenar el formulario de contacto");
            return null;
        }
    }
    
}
