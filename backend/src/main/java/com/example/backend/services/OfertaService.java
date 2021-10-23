package com.example.backend.services;

import com.example.backend.model.Oferta;

public interface OfertaService {

    Oferta publicarOferta (Oferta oferta);
    Oferta editarOferta (Oferta oferta);
    void eliminarOferta (Integer idOferta);
}
