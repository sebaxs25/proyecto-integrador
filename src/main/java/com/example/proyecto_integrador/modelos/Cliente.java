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


}
