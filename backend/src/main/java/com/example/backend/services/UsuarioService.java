package com.example.backend.services;

import com.example.backend.model.Usuario;

public interface UsuarioService {
    Usuario obtenerUsuario(String email);
    Usuario createRegistro(Usuario usuario);
    Usuario modificarInformacionUsuario(Usuario usuario);
    void deleteCuentaUsuario(Integer id);
}
