package com.example.backend.services.impl;

import com.example.backend.model.Aptitud;
import com.example.backend.repositories.AptitudRepository;
import com.example.backend.services.AptitudService;
import org.springframework.stereotype.Service;

@Service
public class AptitudServiceImpl implements AptitudService {

    private final AptitudRepository aptitudRepository;

    public AptitudServiceImpl(AptitudRepository aptitudRepository) {
        this.aptitudRepository = aptitudRepository;
    }

    @Override
    public Aptitud createAptitud(Aptitud aptitud) {
        return aptitudRepository.save(aptitud);
    }

    @Override
    public void deleteAptitud(Integer id) {
        aptitudRepository.deleteById(id);
    }


}
