package com.example.proyecto_integrador.modelos;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name ="cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    @OneToMany(mappedBy = "cliente")
    @JsonManagedReference(value = "cliente-eveneto")
    private List<Evento> eventos;

    @OneToMany(mappedBy = "cliente")
    @JsonManagedReference(value ="cliente-tarjeta")
    private List<Tarjeta> tarjetas;

    @Column (name="nombre")
    private String Nombre;
    @Column (name= "apellido")
    private String Apellido;
    @Column (name="correo")
    private String correo;
    @Column (name="contraseña")
    private String contrasena;




    public Cliente() {
    }

    public Cliente(Integer id, String nombre, String apellido,  String correo, String contrasena) {
        Id = id;
        Nombre = nombre;
        Apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
