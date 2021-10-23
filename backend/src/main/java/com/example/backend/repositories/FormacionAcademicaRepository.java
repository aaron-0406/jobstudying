package com.example.backend.repositories;

import com.example.backend.model.FormacionAcademica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//INTERFACE
@Repository
public interface FormacionAcademicaRepository extends JpaRepository<FormacionAcademica, Integer> {

}
