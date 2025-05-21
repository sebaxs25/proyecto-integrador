package com.example.proyecto_integrador.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "eventos")
public class Eventos {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column (name = "id")
    private Integer Id;
    @Column(name = "numeros_personas")
    private Integer numerosPersonas;
    @Column (name = "lugar")
    private String Lugar;
    @Column (name = "platos_servidos")
    private Integer platosServidos;
    @Column (name= "cosas_extras")
    private String cosasExtras;
}

