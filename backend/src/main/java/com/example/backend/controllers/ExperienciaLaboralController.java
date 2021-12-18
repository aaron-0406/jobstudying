package com.example.backend.controllers;

import com.example.backend.model.ExperienciaLaboral;
import com.example.backend.services.ExperienciaLaboralService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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
    public ResponseEntity<ExperienciaLaboral> createExperienciaLaboral(@Valid @RequestBody ExperienciaLaboral experienciaLaboral){
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
    @DeleteMapping("/{idExperienciaLaboral}")
    public ResponseEntity<String> deleteExperienciaLaboral(@PathVariable("idExperienciaLaboral") Integer idExperienciaLaboral){
        experienciaLaboralService.deleteExperienciaLaboral(idExperienciaLaboral);
        return  new ResponseEntity<>(HttpStatus.OK);
    }

    //Listar oferta
    @GetMapping
    public ResponseEntity<List<ExperienciaLaboral>> listar(){
        List<ExperienciaLaboral> listarExperiencias = experienciaLaboralService.listar();
        return new ResponseEntity<>(listarExperiencias,HttpStatus.CREATED);
    }
}

