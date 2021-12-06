package com.example.backend.repositories;

import com.example.backend.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends JpaRepository<Usuario, Integer> {

    @Query(value = "SELECT * FROM usuario WHERE email_usuario = ?1 AND contrasenia_usuario = ?2", nativeQuery = true)
    Object validarDatos(String email, String password);

}
