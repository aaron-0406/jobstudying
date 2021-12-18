package com.example.backend.controllers;

import com.example.backend.model.FormacionAcademica;
import com.example.backend.services.FormacionAcademicaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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
        return new ResponseEntity<>(HttpStatus.OK) ;
    }

    //Listar formacion academica
    @GetMapping
    public ResponseEntity<List<FormacionAcademica>> listar(){
        List<FormacionAcademica> listarFormaciones = formacionAcademicaService.listar();
        return new ResponseEntity<>(listarFormaciones,HttpStatus.OK);
    }

}