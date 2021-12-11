package com.example.backend.controllers;
import com.example.backend.model.Usuario;
import com.example.backend.services.UsuarioService;
import com.example.backend.services.impl.UserDetailsServiceImpl;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/usuario")
//Cliente a servidor
public class UsuarioController {

    private final UsuarioService usuarioService;
    private final UserDetailsServiceImpl userDetailsService;
    public UsuarioController(UsuarioService usuarioService, UserDetailsServiceImpl userDetailsService) {
        this.usuarioService = usuarioService;
        this.userDetailsService = userDetailsService;
    }

    @GetMapping("/profile")
    public ResponseEntity<Usuario> obtenerUsuario() {
        try {
            Usuario usuarioNew = usuarioService.obtenerUsuario(this.userDetailsService.getEmail());
            usuarioNew.setContaseniaUsuario("");
            return new ResponseEntity<Usuario>(usuarioNew, HttpStatus.OK);
        } catch(BadCredentialsException e) {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
    }

    @PostMapping("/register")
    public ResponseEntity<Usuario> createRegistro(@RequestBody Usuario usuario) {
        try {
            Usuario newUsuario = usuarioService.createRegistro(usuario);
            return new ResponseEntity<Usuario>(newUsuario, HttpStatus.CREATED);
        } catch (Exception error) {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
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
