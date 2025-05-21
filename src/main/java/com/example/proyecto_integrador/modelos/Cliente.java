package com.example.proyecto_integrador.modelos;

import jakarta.persistence.*;

@Entity
@Table (name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column (name = "id")
    private String Id;
    @Column (name="nombre")
    private String Nombre;
    @Column(name="apellido")
    private String Apellido;
    @Column (name = "edad")
    private Integer Edad;
    @Column (name = "telefono")
    private Integer Telefono;
    @Column (name = "segundo_telefono")
    private Integer segundoTelefono;
    @Column (name="direccion")
    private String Direccion;

    public Cliente() {
    }

    public Cliente(String id, String nombre, String apellido, Integer edad, Integer telefono, Integer segundoTelefono, String direccion) {
        Id = id;
        Nombre = nombre;
        Apellido = apellido;
        Edad = edad;
        Telefono = telefono;
        this.segundoTelefono = segundoTelefono;
        Direccion = direccion;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
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

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer edad) {
        Edad = edad;
    }

    public Integer getTelefono() {
        return Telefono;
    }

    public void setTelefono(Integer telefono) {
        Telefono = telefono;
    }

    public Integer getSegundoTelefono() {
        return segundoTelefono;
    }

    public void setSegundoTelefono(Integer segundoTelefono) {
        this.segundoTelefono = segundoTelefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }
}
