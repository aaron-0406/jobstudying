package com.example.backend.services.impl;

import com.example.backend.repositories.AuthRepository;
import com.example.backend.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    private final AuthRepository authRepository;
    public AuthServiceImpl(AuthRepository authRepository) {
        this.authRepository = authRepository;
    }

    @Override
    public boolean validatorDates(String email, String password) {
        if(authRepository.validarDatos(email, password) != null){
            return true;
        }
        return false;
    }
}
