package com.example.backend.services.impl;
import com.example.backend.model.Usuario;
import com.example.backend.repositories.UsuarioRepository;
import com.example.backend.services.UsuarioService;
import org.springframework.stereotype.Service;

    @Service
    public class UsuarioServiceImpl implements UsuarioService {

        private final UsuarioRepository usuarioRepository;

        public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
            this.usuarioRepository = usuarioRepository;
        }

        @Override
        public Usuario createRegistro(Usuario usuario) {
            return usuarioRepository.save(usuario);
        }

        @Override
        public Usuario modificarInformacionUsuario(Usuario usuario) {
            return usuarioRepository.save(usuario);
        }

        @Override
        public void deleteCuentaUsuario(Integer id) {
            usuarioRepository.deleteById(id);
        }

    }
