package com.example.backend.controllers;

import com.example.backend.model.Oferta;
import com.example.backend.services.OfertaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/ofertas")
public class OfertaController { //CONTROLLER RECIBE PETICIONES

    private OfertaService ofertaService;

    public OfertaController(OfertaService ofertaService) {
        this.ofertaService = ofertaService;
    }

    @PostMapping
    public ResponseEntity <Oferta> publicarOferta(@Valid @RequestBody Oferta oferta){
        Oferta ofertaNew = ofertaService.publicarOferta(oferta);
        return new ResponseEntity<Oferta>(ofertaNew, HttpStatus.CREATED);
    }

    //Editar oferta
    @PutMapping //Definir tipo de peticion
    public ResponseEntity <Oferta> editarOferta(@Valid @RequestBody Oferta oferta){
        Oferta ofertaUpdate = ofertaService.editarOferta(oferta);
        return new ResponseEntity<Oferta>(ofertaUpdate, HttpStatus.CREATED);
    }

    //Eliminar Oferta
    @DeleteMapping("/{idOferta}")
    public ResponseEntity <String> eliminarOferta(@PathVariable ("idOferta") Integer idOferta){
        ofertaService.eliminarOferta(idOferta);
        return  new ResponseEntity<>("Oferta eliminada", HttpStatus.OK);
    }

}
