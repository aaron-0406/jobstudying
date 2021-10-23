package com.example.backend.controllers;

import com.example.backend.model.ExperienciaLaboral;
import com.example.backend.services.ExperienciaLaboralService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//DEFINIR CONTROLADOR-PETICIONES
@RestController
//DEFINIR LA RUTA
@RequestMapping("/experiencialaboral")
public class ExperienciaLaboralController {

    private final ExperienciaLaboralService experienciaLaboralService;
    public ExperienciaLaboralController(ExperienciaLaboralService experienciaLaboralService){
        this.experienciaLaboralService = experienciaLaboralService;
    }

    //DEFINICION TIPO DE PETICION POST
    @PostMapping
    public ResponseEntity<ExperienciaLaboral> createExperienciaLaboral(@RequestBody ExperienciaLaboral experienciaLaboral){
        ExperienciaLaboral experienciaLaboralNew1 = experienciaLaboralService.createExperienciaLaboral(experienciaLaboral);
        return  new ResponseEntity<ExperienciaLaboral>(experienciaLaboralNew1, HttpStatus.CREATED);
    }

    //DEFINICION TIPO DE PETICION PUT
    @PutMapping
    public ResponseEntity<ExperienciaLaboral> modificarExperienciaLaboral(@RequestBody ExperienciaLaboral experienciaLaboral){
        ExperienciaLaboral experienciaLaboralnew = experienciaLaboralService.updateExperienciaLaboral(experienciaLaboral);
        //retornar el objeto tipoExperienciaLaboral
        return new ResponseEntity<ExperienciaLaboral>(experienciaLaboralnew, HttpStatus.OK);
    }
}

