package com.example.proyecto_integrador.modelos;

import com.example.proyecto_integrador.palabras.Estado;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "tarjeta")
public class Tarjeta {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private String Id;

    @ManyToOne
    @JoinColumn(name = "fk_cliente", referencedColumnName = "id")
    @JsonBackReference
    private Cliente cliente;

    @OneToMany(mappedBy = "tarjeta")
    @JsonManagedReference
    private List<Eventos> eventos;


    @Column(name = "numero_tarjeta")
    private Integer numeroTarjeta;
    @Column(name = "confirmacion_tarjeta")
    private Integer confimacionTarjeta;
    @Enumerated(EnumType.STRING)
    private Estado estadoPago;

    public Tarjeta() {
    }

    public Tarjeta(String id, Cliente cliente, Integer numeroTarjeta, Integer confimacionTarjeta, Estado estadoPago) {
        Id = id;
        this.cliente = cliente;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    public Estado getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(Estado estadoPago) {
        this.estadoPago = estadoPago;
    }
}
