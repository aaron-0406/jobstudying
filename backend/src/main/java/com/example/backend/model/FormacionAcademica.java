package com.example.backend.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name = "datos_formacion_academica")
public class FormacionAcademica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFormacion;

    @NotNull
    @Size(min = 5, max = 70, message = "Institucion debe tener como mínimo 5 caracteres.")
    @Column(name = "institucion", nullable = false, length = 70)
    private String institucion;

    @NotNull
    @Column(name = "fecha_inicio", nullable = false)
    private LocalDate fechaInicio;

    @Column(name = "fecha_fin", nullable = false)
    private LocalDate fechaFin;

    public FormacionAcademica(Integer idFormacion, String institucion, LocalDate fechaInicio, LocalDate fechaFin) {
        this.idFormacion = idFormacion;
        this.institucion = institucion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public FormacionAcademica(){}

    public Integer getIdFormacion() {
        return idFormacion;
    }

    public void setIdFormacion(Integer idFormacion) {
        this.idFormacion = idFormacion;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

}
