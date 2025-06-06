package com.example.proyecto_integrador.modelos;

import com.example.proyecto_integrador.palabras.Estado;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name ="tarjeta")
public class Tarjeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @ManyToOne
    @JoinColumn(name = "fk_cliente", referencedColumnName = "id")
    @JsonBackReference(value = "cliente-tarjeta")
    private Cliente cliente;

    @OneToMany(mappedBy = "tarjeta")
    @JsonManagedReference(value= "tarjeta-evento")
    private List<Evento> eventos;


    private Integer numeroTarjeta;
    private Integer confimacionTarjeta;
    @Enumerated(EnumType.STRING)
    private Estado estadoPago;
    private Integer Telefono;
    private Integer segundoTelefono;
    private String Direccion;


    public Tarjeta() {
    }

    public Tarjeta(String direccion, Integer segundoTelefono, Integer telefono, Estado estadoPago, Integer confimacionTarjeta, Integer numeroTarjeta, Integer id) {
        Direccion = direccion;
        this.segundoTelefono = segundoTelefono;
        Telefono = telefono;
        this.estadoPago = estadoPago;
        this.confimacionTarjeta = confimacionTarjeta;
        this.numeroTarjeta = numeroTarjeta;
        Id = id;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
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

    public Estado getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(Estado estadoPago) {
        this.estadoPago = estadoPago;
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