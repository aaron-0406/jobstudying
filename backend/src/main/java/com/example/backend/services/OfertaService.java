package com.example.backend.services;

import com.example.backend.model.Oferta;

public interface OfertaService {

    Oferta createOferta (Oferta oferta);
    Oferta updateOferta (Oferta oferta);
    void deleteOferta (Integer idOferta);
}
