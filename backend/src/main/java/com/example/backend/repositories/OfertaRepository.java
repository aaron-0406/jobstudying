package com.example.backend.repositories;

import com.example.backend.model.Oferta;
import org.hibernate.mapping.Set;
import org.hibernate.sql.Update;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;


@Repository
public interface OfertaRepository extends JpaRepository <Oferta, Integer> {

    /*@Query(value = "UPDATE ofertas set ?0 WHERE id_oferta = ?1", nativeQuery = true)
    Oferta updateOferta(Oferta ofertaNew, @Param("id") Integer id);*/

}
