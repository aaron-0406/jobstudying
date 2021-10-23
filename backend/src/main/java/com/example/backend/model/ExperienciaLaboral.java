package com.example.backend.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name = "datos_experiencia_laboral")
public class ExperienciaLaboral {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idExperiencia;

    @Size (min = 1, max = 30, message = "Empresa debe tener como mínimo 1 caracteres.")
    @Column(name = "empresa", nullable = false, length = 30)
    private String empresa;

    @Size (min = 10, max = 300, message = "Descripcion debe tener como mínimo 10 caracteres.")
    @Column(name = "description", nullable = false, length = 300)
    private String description;

    @Size (min = 1, max = 30, message = "Cargo debe tener como mínimo 1 caracteres.")
    @Column(name = "cargo", nullable = false, length = 30)
    private String cargo;

    @NotNull
    @Column(name= "inicio_experiencia", nullable = false)
    private LocalDate incioExperiencia;

    @Column(name= "fin_experiencia", nullable = true)
    private LocalDate finExperiencia;

    public ExperienciaLaboral(Integer idExperiencia, String empresa, String descripcion, String cargo, LocalDate incioExperiencia, LocalDate finExperiencia) {
        this.idExperiencia = idExperiencia;
        this.empresa = empresa;
        this.description = descripcion;
        this.cargo = cargo;
        this.incioExperiencia = incioExperiencia;
        this.finExperiencia = finExperiencia;
    }

    public ExperienciaLaboral(){}

    public Integer getIdExperiencia() {
        return idExperiencia;
    }

    public void setIdExperiencia(Integer idExperiencia) {
        this.idExperiencia = idExperiencia;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDescripcion() {
        return description;
    }

    public void setDescripcion(String descripcion) {
        this.description = descripcion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public LocalDate getIncioExperiencia() {
        return incioExperiencia;
    }

    public void setIncioExperiencia(LocalDate incioExperiencia) {
        this.incioExperiencia = incioExperiencia;
    }

    public LocalDate getFinExperiencia() {
        return finExperiencia;
    }

    public void setFinExperiencia(LocalDate finExperiencia) {
        this.finExperiencia = finExperiencia;
    }

}
