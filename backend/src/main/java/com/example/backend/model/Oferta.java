package com.example.backend.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name = "Ofertas")
public class Oferta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOferta;

    @NotNull
    @Size(min = 1, max = 80, message = "El nombre de la oferta debe tener como mínimo 1 caracter")
    @Column(name = "nombre_oferta", nullable = false, length = 80)
    private String nombre;

    @NotNull
    @Size(min = 10, max = 800, message = "La descripción de oferta debe tener como minimo 10 caracteres")
    @Column(name = "descripcion_oferta", nullable = false, length = 800)
    private String descripcion;

    @NotNull
    @Column(name = "fecha_inicio", nullable = false)
    private LocalDate fechaInicio;

    @NotNull
    @Column(name = "vigencia_oferta", nullable = false)
    private Integer vigencia;

    @NotNull
    @Column(name = "postulantes", nullable = false)
    private Integer cantPostulantes;


    //Getters y Setters
    public Integer getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(Integer idOferta) {
        idOferta = idOferta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getVigencia() {
        return vigencia;
    }

    public void setVigencia(Integer vigencia) {
        this.vigencia = vigencia;
    }

    public Integer getCantPostulantes() {
        return cantPostulantes;
    }

    public void setCantPostulantes(Integer cantPostulantes) {
        this.cantPostulantes = cantPostulantes;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    //Constructor
    public Oferta() {
    }

    public Oferta(Integer idOferta, String descripcion, String nombre, Integer vigencia, Integer cantPostulantes, LocalDate fechaInicio) {
        this.idOferta = idOferta;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.vigencia = vigencia;
        this.cantPostulantes = cantPostulantes;
        this.fechaInicio = fechaInicio;
    }
}
