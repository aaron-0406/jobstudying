package com.example.backend.controllers;

import com.example.backend.model.FormacionAcademica;
import com.example.backend.services.FormacionAcademicaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;

//DEFINIR CONTROLADOR - PETICIONES
@RestController
//DEFINIR LA RUTA
@RequestMapping("/formacionacademica")
public class FormacionAcademicaController {

    private FormacionAcademicaService formacionAcademicaService;
    public FormacionAcademicaController() {
    }

    //DEFINICION TIPO DE PETICION PUT
    @PutMapping
    public ResponseEntity<FormacionAcademica> modificarFormacionAcademica(@RequestBody FormacionAcademica formacionAcademica){
        FormacionAcademica formacionAcademicanew = formacionAcademicaService.updateFormacionAcademica(formacionAcademica);
        //retornar el objeto tipo FormacionAcademica
        return new ResponseEntity<FormacionAcademica>(formacionAcademicanew, HttpStatus.OK);
    }

    //DEFINICION TIPO DE PETICION DELETE
    //http://localhost:8080/formacionacademica/1 ==> HTTP DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarFormacionAcademica(@PathVariable("id") Integer idFormacion){
        formacionAcademicaService.deleteFormacionAcademica(idFormacion);
        return new ResponseEntity<>("Formacion Academica eliminada", HttpStatus.OK) ;
    }

}
