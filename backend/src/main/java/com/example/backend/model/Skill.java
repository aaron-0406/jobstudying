package com.example.backend.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "skills")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSkill;

    @NotNull
    @Size(min = 1, max = 80, message = "El nombre de la skill debe tener como mínimo 1 caracter")
    @Column(name = "nombre_skill", nullable = false, length = 80)
    private String nombre;

    public Skill(Integer idSkill, String nombre) {
        this.idSkill = idSkill;
        this.nombre = nombre;
    }

    public Skill() {
    }

    public Integer getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(Integer idSkill) {
        this.idSkill = idSkill;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
