package com.example.backend.repositories;

import com.example.backend.model.Oferta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfertaRepository extends JpaRepository <Oferta, Integer>{

    /*@Query(value = "UPDATE ofertas set ?0 WHERE id_oferta = ?1", nativeQuery = true)
    Oferta updateOferta(Oferta ofertaNew, @Param("id") Integer id);*/

}
