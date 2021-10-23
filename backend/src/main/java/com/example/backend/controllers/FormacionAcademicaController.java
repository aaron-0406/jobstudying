package com.example.backend.controllers;

import com.example.backend.model.FormacionAcademica;
import com.example.backend.services.FormacionAcademicaService;
import org.hibernate.annotations.Parameter;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import javax.validation.Valid;

//DEFINIR CONTROLADOR - PETICIONES
@RestController
//DEFINIR LA RUTA
@RequestMapping("/formacionacademica")
public class FormacionAcademicaController {

    private final FormacionAcademicaService formacionAcademicaService;
    public FormacionAcademicaController(FormacionAcademicaService formacionAcademicaService) {
        this.formacionAcademicaService = formacionAcademicaService;
    }

    //DEFINICION TIPO DE PETICION POST
    @PostMapping
    public ResponseEntity<FormacionAcademica> createFormacionAcademica(@Valid @RequestBody FormacionAcademica formacionAcademica) {
        FormacionAcademica formacionacademicanew = formacionAcademicaService.createFormacionAcademica(formacionAcademica);
        return new ResponseEntity<FormacionAcademica>(formacionacademicanew, HttpStatus.CREATED);
    }

    //DEFINICION TIPO DE PETICION PUT
    @PutMapping
    public ResponseEntity<FormacionAcademica> modificarFormacionAcademica(@Valid @RequestBody FormacionAcademica formacionAcademica){
        FormacionAcademica formacionAcademicanew = formacionAcademicaService.updateFormacionAcademica(formacionAcademica);
        //retornar el objeto tipo FormacionAcademica
        return new ResponseEntity<FormacionAcademica>(formacionAcademicanew, HttpStatus.OK);
    }

    //DEFINICION TIPO DE PETICION DELETE
    //http://localhost:8080/formacionacademica/1 ==> HTTP DELETE
    @DeleteMapping("/{idFormacion}")
    public ResponseEntity<String> eliminarFormacionAcademica(@PathVariable("idFormacion") Integer idFormacion){
        formacionAcademicaService.deleteFormacionAcademica(idFormacion);
        return new ResponseEntity<>("Formacion Academica eliminada", HttpStatus.OK) ;
    }

}