package com.example.proyecto_integrador.modelos;

import jakarta.persistence.*;

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
    private String estadoPago;

    public Tarjeta() {
    }

    public Tarjeta(String id, Integer numeroTarjeta, Integer confimacionTarjeta, String estadoPago) {
        Id = id;
        this.numeroTarjeta = numeroTarjeta;
        this.confimacionTarjeta = confimacionTarjeta;
        this.estadoPago = estadoPago;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public Integer getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(Integer numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public Integer getConfimacionTarjeta() {
        return confimacionTarjeta;
    }

    public void setConfimacionTarjeta(Integer confimacionTarjeta) {
        this.confimacionTarjeta = confimacionTarjeta;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }
}
