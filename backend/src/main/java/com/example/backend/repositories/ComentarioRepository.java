package com.example.backend.repositories;

import com.example.backend.model.Comentario;
import com.example.backend.model.Oferta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentario, Integer> {


    List<Comentario> findByOferta(Oferta oferta);
}
