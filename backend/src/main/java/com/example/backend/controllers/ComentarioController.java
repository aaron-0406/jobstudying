package com.example.backend.controllers;


import com.example.backend.model.Comentario;
import com.example.backend.model.Oferta;
import com.example.backend.services.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/comentario")
public class ComentarioController {

    @Autowired
    private ComentarioService comentarioService;

    @CrossOrigin(origins = "*",methods = {RequestMethod.GET})
    @GetMapping(value = "{id}")
    public ResponseEntity<Comentario> findComentario(@PathVariable("id") Integer id) {
        Comentario comentario = comentarioService.findComentario(id);
        if (comentario == null) return ResponseEntity.noContent().build();
        return ResponseEntity.ok(comentario);
    }

    @CrossOrigin(origins = "*",methods = {RequestMethod.POST})
    @PostMapping
    public ResponseEntity<Comentario> createComentario(@RequestBody Comentario comentario) {
        Comentario comentarioCreate = comentarioService.createComentario(comentario);
        return ResponseEntity.ok(comentarioCreate);

    }

    //eliminar comentario
    @DeleteMapping("/{id}")
    public ResponseEntity<Comentario> deleteComentario(@PathVariable("id") Integer idComentario) {
        Comentario comentarioDelete = comentarioService.deleteComentario(idComentario);
        if (comentarioDelete == null) return ResponseEntity.noContent().build();
        return ResponseEntity.ok(comentarioDelete);
    }

    //editar comentario
    @PutMapping
    public ResponseEntity<Comentario> editarComentario(@Valid @RequestBody Comentario comentario) {
        Comentario comentarioUpdate = comentarioService.editComentario(comentario);
        return ResponseEntity.ok(comentarioUpdate);
    }

    @GetMapping(value="/oferta/{idOferta}/comentarios")
    public ResponseEntity<List<Comentario>> listarComentariosOferta(@PathVariable("idOferta") Integer idOferta){
        Oferta oferta = new Oferta();
        oferta.setIdOferta(idOferta);
        List<Comentario> listaComentarios = comentarioService.listComentariosOferta(oferta);
        return ResponseEntity.ok(listaComentarios);
    }
}