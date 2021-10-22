package com.example.backend.controllers;

import com.example.backend.model.Aptitud;
import com.example.backend.services.AptitudService;
import org.hibernate.annotations.Parameter;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aptitudes")
public class AptitudController {

    private final AptitudService aptitudService;

    public AptitudController(AptitudService aptitudService) {
        this.aptitudService = aptitudService;
    }

    @PostMapping
    public ResponseEntity<Aptitud> createAptitud(@RequestBody Aptitud aptitud) {
        Aptitud aptitudNew = aptitudService.createAptitud(aptitud);
        return new ResponseEntity<>(aptitudNew, HttpStatus.CREATED);
    }

    //http://localhost:8080/aptitudes/1 ==> HTTP DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAptitud(@PathVariable("id") Integer idAptitud){
        aptitudService.deleteAptitud(idAptitud);
        return  new ResponseEntity<>("Aptitud eliminada", HttpStatus.OK);
    }

}
