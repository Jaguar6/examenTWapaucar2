package com.examen.tw.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PersonaController {

    @GetMapping("/")
    public String inicio() {    
        return "inicio";
    }
    
    @RequestMapping(value = "/salida" , method=RequestMethod.POST)
    public String respuestas() {   
        return "resultado";
    }
    
 
}
