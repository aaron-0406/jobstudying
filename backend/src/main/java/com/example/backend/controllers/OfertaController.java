package com.example.backend.controllers;

import com.example.backend.model.Oferta;
import com.example.backend.services.OfertaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/ofertas")
public class OfertaController {

    private final OfertaService ofertaService;

    public OfertaController(OfertaService ofertaService) {
        this.ofertaService = ofertaService;
    }

    @PostMapping
    public ResponseEntity<Oferta> createOferta(@Valid @RequestBody Oferta oferta){
        Oferta ofertaNew = ofertaService.createOferta(oferta);
        return new ResponseEntity<Oferta>(ofertaNew, HttpStatus.CREATED);
    }

    //Editar oferta
    @PutMapping //Definir tipo de peticion
    public ResponseEntity<Oferta> modificarOferta(@Valid @RequestBody Oferta oferta){
        Oferta ofertaUpdate = ofertaService.updateOferta(oferta);
        return new ResponseEntity<Oferta>(ofertaUpdate, HttpStatus.OK);
    }

    //Eliminar Oferta
    @DeleteMapping("/{idOferta}")
    public ResponseEntity <String> deleteOferta(@PathVariable ("idOferta") Integer idOferta){
        ofertaService.deleteOferta(idOferta);
        return  new ResponseEntity<>("Oferta eliminada", HttpStatus.OK);
    }

    //Listar oferta
    @CrossOrigin(origins = "http://localhost:4200/")
    @GetMapping
    public ResponseEntity<List<Oferta>> listarOfertas(){
        List<Oferta> listarOfertas = ofertaService.listarOferta();
        return new ResponseEntity<>(listarOfertas,HttpStatus.CREATED);
    }

}
