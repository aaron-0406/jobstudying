package com.example.backend.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id_Usuario;

    @NotNull
    @Column(name = "nombre_usuario", nullable = false, length = 10)
    private String nombreUsuario;
    @NotNull
    @Column(name = "apellido_usuario", nullable = false, length = 20)
    private String apellidoUsuario;
    @NotNull
    @Column(name = "tipo_usuario", nullable = false, length = 20)
    private String tipoUsuario;

    @NotNull
    @Column(name = "contrasenia_usuario", nullable = false, length = 20)
    private String contaseniaUsuario;

    @NotNull
    @Column(name = "email_usuario", nullable = false, length = 20)
    private String emailUsuario;
    @NotNull
    @Column(name = "Telefono_usuario", nullable = false, length = 20)
    private int telefonoUsuario;
    @NotNull
    @Column(name = "genero_usuario", nullable = false, length = 20)
    private String generoUsuario;

    public Usuario(){}

    public Usuario(Integer Id_Usuario, String apellidoUsuario, String tipoUsuario, String contaseniaUsuario, String emailUsuario, int telefonoUsuario, String generoUsuario) {
        this.Id_Usuario = Id_Usuario;
        this.apellidoUsuario = apellidoUsuario;
        this.contaseniaUsuario = contaseniaUsuario;
        this.emailUsuario = emailUsuario;
        this.telefonoUsuario = telefonoUsuario;
        this.generoUsuario = generoUsuario;
        this.tipoUsuario = tipoUsuario;
    }

    public Integer getId_Usuario() {
        return Id_Usuario;
    }

    public void setId_Usuario(Integer id_Usuario) {
        Id_Usuario = id_Usuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getContaseniaUsuario() {
        return contaseniaUsuario;
    }

    public void setContaseniaUsuario(String contaseniaUsuario) {
        this.contaseniaUsuario = contaseniaUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public int getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(int telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public String getGeneroUsuario() {
        return generoUsuario;
    }

    public void setGeneroUsuario(String generoUsuario) {
        this.generoUsuario = generoUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}








