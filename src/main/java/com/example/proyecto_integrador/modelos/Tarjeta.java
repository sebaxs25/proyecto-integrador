package com.example.proyecto_integrador.modelos;

import jakarta.persistence.*;

@Entity
@Table (name = "tarjeta")
public class Tarjeta {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private String Id;
    @Column(name="numero")
    private Integer Numero;
}
