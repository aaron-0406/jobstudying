package com.example.backend.services;

import com.example.backend.model.Aptitud;

public interface AptitudService {

    Aptitud createAptitud(Aptitud aptitud);
    void deleteAptitud(Integer id);

}
