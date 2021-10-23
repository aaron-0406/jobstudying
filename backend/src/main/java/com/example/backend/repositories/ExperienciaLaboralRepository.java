package com.example.backend.repositories;

import com.example.backend.model.ExperienciaLaboral;
import org.hibernate.mapping.Set;
import org.hibernate.sql.Update;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface ExperienciaLaboralRepository extends JpaRepository<ExperienciaLaboral, Integer> {

    //@Query("Update ExperienciaLaboral experienciaLaboral Set ?WHERE :id")
    //String updateExperienciaLaboral( ExperienciaLaboral experienciaLaboralNew, @Param("id") Integer id);

}
