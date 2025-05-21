package com.example.proyecto_integrador.modelos;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

@Entity
@Table (name = "tarjeta")
public class Tarjeta {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private String Id;
    @Column(name="numero_tarjeta")
    private Integer numeroTarjeta;
    @Column (name = "confirmacion_tarjeta")
    private Integer confimacionTarjeta;
    @Column (name = "estado")
    private String Pago;
}
