package com.example.backend.services.impl;

import com.example.backend.model.Comentario;
import com.example.backend.model.Oferta;
import com.example.backend.repositories.ComentarioRepository;
import com.example.backend.services.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComentarioServiceImpl implements ComentarioService {

    @Autowired
    private ComentarioRepository comentarioRepository;


    @Override
    public Comentario findComentario(Integer id){
        return comentarioRepository.findById(id).orElse(null);
    }
    @Override
    public Comentario deleteComentario(Integer id) {
       Comentario comentario=comentarioRepository.findById(id).orElse(null);
        if (comentario == null) {
            return null;
        }
        comentarioRepository.delete(comentario);
        return comentario;

    }

    @Override
    public Comentario createComentario(Comentario comentario) {
        return comentarioRepository.save(comentario);
    }

    @Override
    public Comentario editComentario(Comentario comentario) {
        Comentario comentarioDB=comentarioRepository.findById(comentario.getIdComentario()).orElse(null);
        if (comentarioDB == null) {
            return null;
        }
        comentarioDB.setDescripcionComentario(comentario.getDescripcionComentario());
        comentarioRepository.save(comentarioDB);
        return comentarioDB;
    }

    @Override
    public List<Comentario> listComentariosOferta(Oferta oferta) {
        List<Comentario> listComentarios=comentarioRepository.findByOferta(oferta.getIdOferta());
        return listComentarios;
    }
}
