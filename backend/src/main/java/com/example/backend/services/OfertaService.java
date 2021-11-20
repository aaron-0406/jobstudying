package com.example.backend.services;

import com.example.backend.model.Oferta;

import java.util.List;

public interface OfertaService {

    Oferta createOferta (Oferta oferta);
    Oferta updateOferta (Oferta oferta);
    List<Oferta> listarOferta();
    void deleteOferta (Integer idOferta);
}
