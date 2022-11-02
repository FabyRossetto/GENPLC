/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.GENPLC.website.controladores;

import com.GENPLC.website.servicios.FormularioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Fabi
 */
@Controller
@RequestMapping("")
public class FormularioControlador {
    
    @Autowired
    FormularioServicio f;
    
    
    @GetMapping("")
    public String index() {
        return "GENPLC.html";
    }
    
    
    @PostMapping("")
    public String GuardarFormulario(ModelMap modelo, @RequestParam String mail, @RequestParam String nombre, @RequestParam String apellido, @RequestParam String tema, @RequestParam String consulta) throws Exception {
        try {
            f.CrearFormulario(mail, nombre, apellido, tema, consulta);
            modelo.put("exito", "su formulario se ha enviado con exito");
           

        } catch (Exception a) {
            modelo.put("error", "su formulario no se ha podido enviar");

        }

        return "GENPLC.html";
    }
    
    
}
