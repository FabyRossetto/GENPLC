/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.GENPLC.website.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Fabi
 */
@Entity
public class Formulario {
     @Id
    @GeneratedValue(generator="uuid")
    @GenericGenerator(name="uuid",strategy="uuid2")
    protected String Id;
    protected String mail;
    protected String nombre;
    protected String apellido;
    protected String tema;
    protected String consulta;

    public Formulario() {
    }

    public Formulario(String Id, String mail, String nombre, String apellido, String tema, String consulta) {
        this.Id = Id;
        this.mail = mail;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tema = tema;
        this.consulta = consulta;
    }

   
    
    
    

    

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    @Override
    public String toString() {
        return "nombre"+nombre+ 
                "apellido"+apellido+
                "subject"+tema+
                "consulta"+consulta;
    }
    
    
    
}
