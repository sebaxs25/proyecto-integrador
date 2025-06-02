package com.example.proyecto_integrador.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "eventos")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column (name = "id")
    private Integer Id;

    @ManyToOne
    @JoinColumn (name = "fk_cliente", referencedColumnName = "id")
    @JsonBackReference
    private Cliente cliente;

    @ManyToOne
    @JoinColumn (name = "fk_tarjeta", referencedColumnName = "id")
    @JsonBackReference
    private Tarjeta tarjeta;

    @Column(name = "numeros_personas")
    private Integer numerosPersonas;
    @Column (name = "lugar")
    private String Lugar;
    @Column (name = "platos_servidos")
    private Integer platosServidos;
    @Column (name= "cosas_extras")
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
