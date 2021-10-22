package com.example.backend.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Aptitudes")
public class Aptitud {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAptitud;

    @NotNull
    @Size(min = 4, message = "Aptitud debe tener como mínimo 4 caracteres")
    @Column(name = "nombre_aptitud", nullable = false, length = 70)
    private String nombreAptitud;

    @Column(name = "descripcion_aptitud", nullable = true, length = 200)
    private String descripcionAptitud;

    public Aptitud() {}

    public Aptitud(Integer idAptitud, String nombreAptitud, String descripcionAptitud) {
        this.idAptitud = idAptitud;
        this.nombreAptitud = nombreAptitud;
        this.descripcionAptitud = descripcionAptitud;
    }

    public Integer getIdAptitud() {
        return idAptitud;
    }

    public void setIdAptitud(Integer idAptitud) {
        this.idAptitud = idAptitud;
    }

    public String getNombreAptitud() {
        return nombreAptitud;
    }

    public void setNombreAptitud(String nombreAptitud) {
        this.nombreAptitud = nombreAptitud;
    }

    public String getDescripcionAptitud() {
        return descripcionAptitud;
    }

    public void setDescripcionAptitud(String descripcionAptitud) {
        this.descripcionAptitud = descripcionAptitud;
    }

}
