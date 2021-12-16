package com.example.backend.services;
import com.example.backend.model.Comentario;
import com.example.backend.model.Oferta;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ComentarioService{
    Comentario findComentario(Integer id);
    Comentario deleteComentario(Integer id);
    Comentario createComentario(Comentario comentario);
    Comentario editComentario(Comentario comentario);
    List<Comentario> listComentariosOferta(Oferta oferta);

}
