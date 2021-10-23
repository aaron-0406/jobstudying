package com.example.backend.controllers;
import com.example.backend.model.Usuario;
import com.example.backend.services.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
//Cliente a servidor
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<Usuario> createRegistro(@RequestBody Usuario usuario) {
        Usuario usuarioNew = usuarioService.createRegistro(usuario);
        return new ResponseEntity<Usuario>(usuarioNew, HttpStatus.CREATED);
    }
}
