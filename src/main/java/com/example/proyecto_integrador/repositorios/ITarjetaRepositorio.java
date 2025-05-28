package com.example.proyecto_integrador.repositorios;

import com.example.proyecto_integrador.modelos.Tarjeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITarjetaRepositorio extends JpaRepository<Tarjeta,Integer> {
}
