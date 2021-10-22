package com.example.backend.repositories;

import com.example.backend.model.Aptitud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AptitudRepository extends JpaRepository<Aptitud, Integer> {

}
