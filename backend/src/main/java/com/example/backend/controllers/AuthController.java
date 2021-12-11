package com.example.backend.controllers;

import com.example.backend.dto.AuthenticationRequest;
import com.example.backend.dto.AuthenticationResponse;
import com.example.backend.model.Usuario;
import com.example.backend.security.JWTUtil;
import com.example.backend.services.AuthService;
import com.example.backend.services.UsuarioService;
import com.example.backend.services.impl.UserDetailsServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final UserDetailsServiceImpl userDetailsService;
    private final JWTUtil jwtUtil;
    private final AuthService authService;
    private final UsuarioService usuarioService;
    public AuthController(AuthenticationManager authenticationManager,
                          UserDetailsServiceImpl userDetailsService,
                          AuthService authService, JWTUtil jwtUtil, UsuarioService usuarioService) {
        this.authenticationManager = authenticationManager;
        this.userDetailsService = userDetailsService;
        this.jwtUtil = jwtUtil;
        this.authService = authService;
        this.usuarioService = usuarioService;
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> createToken(@RequestBody AuthenticationRequest request) {
        try {
            //Validar datos del usuario
            if(this.authService.validatorDates(request.getUsername(), request.getPassword())) {
                this.userDetailsService.setEmail(request.getUsername());
                this.userDetailsService.setPassword(request.getPassword());
                authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(),
                        request.getPassword()));
                UserDetails userDetails = userDetailsService.loadUserByUsername(request.getUsername());
                //Generar el JWT
                String jwt = jwtUtil.generateToken(userDetails);
                return new ResponseEntity<>(new AuthenticationResponse(jwt), HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        } catch(BadCredentialsException e) {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
    }
}
