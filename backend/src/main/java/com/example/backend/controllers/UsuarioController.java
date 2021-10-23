package com.example.backend.controllers;
import com.example.backend.model.Usuario;
import com.example.backend.services.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/usuario")
//Cliente a servidor
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<Usuario> createRegistro(@Valid @RequestBody Usuario usuario) {
        Usuario usuarioNew = usuarioService.createRegistro(usuario);
        return new ResponseEntity<Usuario>(usuarioNew, HttpStatus.CREATED);
    }

    //Editar Usuario
    @PutMapping //Definir tipo de peticion
    public ResponseEntity <Usuario> editarInformacionUsuario(@Valid @RequestBody Usuario usuario){
        Usuario usuarionew = usuarioService.modificarInformacionUsuario(usuario);
        return new ResponseEntity<Usuario>(usuarionew, HttpStatus.CREATED);
    }

    //http://localhost:8080/usuarios/1 ==> HTTP DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCuentaUsuario(@PathVariable("id") Integer idUsuario){
        usuarioService.deleteCuentaUsuario(idUsuario);
        return  new ResponseEntity<String>("Usuario eliminado", HttpStatus.OK);
    }

}
