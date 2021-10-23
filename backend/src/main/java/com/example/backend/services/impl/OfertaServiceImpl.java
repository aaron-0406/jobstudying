package com.example.backend.services.impl;

import com.example.backend.model.Oferta;
import com.example.backend.repositories.OfertaRepository;
import com.example.backend.services.OfertaService;
import org.springframework.stereotype.Service;

@Service
public class OfertaServiceImpl implements OfertaService {

    private OfertaRepository ofertaRepository; //Objeto del repositorio

    public OfertaServiceImpl (OfertaRepository ofertaRepository){
        this.ofertaRepository = ofertaRepository;
    }

    @Override
    public Oferta publicarOferta(Oferta oferta) {
        return ofertaRepository.save(oferta);
    }

    @Override
    public Oferta editarOferta(Oferta oferta) {
        return ofertaRepository.save(oferta);
    }

    @Override
    public void eliminarOferta(Integer idOferta) {
        ofertaRepository.deleteById(idOferta);
    }

}
