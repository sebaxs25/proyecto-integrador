package com.example.proyecto_integrador.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "evento")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @ManyToOne
    @JoinColumn (name = "fk_cliente", referencedColumnName = "id")
    @JsonBackReference (value = "cliente-evento")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn (name = "fk_tarjeta", referencedColumnName = "id")
    @JsonBackReference (value = "tarjeta-evento")
    private Tarjeta tarjeta;

    private Integer numerosPersonas;
    private String Lugar;
    private Integer platosServidos;
    private String cosasExtras;



    public Evento() {
    }

    public Evento(Integer id, Integer numerosPersonas, String lugar, Integer platosServidos, String cosasExtras) {
        Id = id;
        this.numerosPersonas = numerosPersonas;
        Lugar = lugar;
        this.platosServidos = platosServidos;
        this.cosasExtras = cosasExtras;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getNumerosPersonas() {
        return numerosPersonas;
    }

    public void setNumerosPersonas(Integer numerosPersonas) {
        this.numerosPersonas = numerosPersonas;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String lugar) {
        Lugar = lugar;
    }

    public Integer getPlatosServidos() {
        return platosServidos;
    }

    public void setPlatosServidos(Integer platosServidos) {
        this.platosServidos = platosServidos;
    }

    public String getCosasExtras() {
        return cosasExtras;
    }

    public void setCosasExtras(String cosasExtras) {
        this.cosasExtras = cosasExtras;
    }
}
