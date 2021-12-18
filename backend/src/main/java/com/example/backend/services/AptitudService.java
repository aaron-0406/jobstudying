package com.example.backend.services;

import com.example.backend.model.Aptitud;

import java.util.List;

public interface AptitudService {

    Aptitud createAptitud(Aptitud aptitud);
    Aptitud updateAptitud(Aptitud aptitud);
    List<Aptitud> listarAptitud();
    void deleteAptitud(Integer id);

}