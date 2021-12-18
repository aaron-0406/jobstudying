package com.example.backend.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="comentario")
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idComentario;

    @JoinColumn(name="id_oferta")
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Oferta oferta;


    @JoinColumn(name="id_usuario")
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Usuario usuario;


    @Column(name = "descripcion_comentario", nullable = true, length = 200)
    private String descripcionComentario;

    @NotNull
    @Column(name = "fecha_comentario", nullable = false)
    private Date fechaComentario;

    public Comentario() {
    }

    public Comentario(Integer idComentario, Oferta oferta, Usuario usuario, String descripcionComentario,Date fechaComentario) {
        this.idComentario = idComentario;
        this.oferta = oferta;
        this.usuario = usuario;
        this.descripcionComentario = descripcionComentario;
        this.fechaComentario=fechaComentario;
    }

    public Integer getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(Integer idComentario) {
        this.idComentario = idComentario;
    }

    public Oferta getOferta() {
        return oferta;
    }

    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDescripcionComentario() {
        return descripcionComentario;
    }

    public void setDescripcionComentario(String descripcionComentario) {
        this.descripcionComentario = descripcionComentario;
    }

    public Date getFechaComentario() {return fechaComentario;
    }

    public void setFechaComentario(Date fechaComentario) {
        this.fechaComentario = fechaComentario;
    }
}
