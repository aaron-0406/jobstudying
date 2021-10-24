package com.example.backend.services.impl;

import com.example.backend.model.Oferta;
import com.example.backend.repositories.FormacionAcademicaRepository;
import com.example.backend.repositories.OfertaRepository;
import com.example.backend.services.OfertaService;
import org.springframework.stereotype.Service;

@Service
public class OfertaServiceImpl implements OfertaService {

    //CREANDO OBJETO QUE HEREDATODO LO DE JPA
    private OfertaRepository ofertaRepository;

    public OfertaServiceImpl(OfertaRepository ofertaRepository) {
        this.ofertaRepository = ofertaRepository;
    }

    @Override
    public Oferta createOferta(Oferta oferta) {
        return ofertaRepository.save(oferta);
    }

    @Override
    public Oferta updateOferta(Oferta oferta) {
        return ofertaRepository.save(oferta);
    }

    @Override
    public void deleteOferta(Integer idOferta) {
        ofertaRepository.deleteById(idOferta);

    }
}
