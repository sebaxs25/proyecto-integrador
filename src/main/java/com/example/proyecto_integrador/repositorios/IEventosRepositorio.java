package com.example.proyecto_integrador.repositorios;

import com.example.proyecto_integrador.modelos.Eventos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEventosRepositorio extends JpaRepository<Eventos, Integer>  {
}
