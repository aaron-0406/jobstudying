package com.example.backend.controllers;

import com.example.backend.model.Aptitud;
import com.example.backend.services.AptitudService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/aptitudes")
public class AptitudController {

    private final AptitudService aptitudService;

    public AptitudController(AptitudService aptitudService) {
        this.aptitudService = aptitudService;
    }
    //CREAR APTITUD
    @PostMapping
    public ResponseEntity<Aptitud> createAptitud(@Valid @RequestBody Aptitud aptitud) {
        Aptitud aptitudNew = aptitudService.createAptitud(aptitud);
        return new ResponseEntity<Aptitud>(aptitudNew, HttpStatus.CREATED);
    }
    //EDITAR APTITUD
    @PutMapping
    public ResponseEntity<Aptitud> modificaAptitud(@Valid @RequestBody Aptitud aptitud){
        Aptitud aptitudUpdate = aptitudService.updateAptitud(aptitud);
        return new ResponseEntity<Aptitud>(aptitudUpdate, HttpStatus.OK);
    }
    //ELIMINAR APTITUD
    //http://localhost:8080/aptitudes/1 ==> HTTP DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAptitud(@PathVariable("id") Integer idAptitud){
        aptitudService.deleteAptitud(idAptitud);
        return  new ResponseEntity<>("Aptitud eliminada", HttpStatus.OK);
    }
    //LISTAR APTITUD
    @GetMapping
    public ResponseEntity<List<Aptitud>> listarAptitud(){
        List<Aptitud> listarAptitud = aptitudService.listarAptitud();
        return new ResponseEntity<>(listarAptitud, HttpStatus.CREATED);
    }
}
