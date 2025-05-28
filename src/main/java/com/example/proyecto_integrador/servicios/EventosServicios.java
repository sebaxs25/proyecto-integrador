package com.example.proyecto_integrador.servicios;

import com.example.proyecto_integrador.modelos.Eventos;
import com.example.proyecto_integrador.repositorios.IEventosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventosServicios {
    @Autowired
    IEventosRepositorio repositorio;
    public Eventos guardaEventos (Eventos datosEventos) throws Exception{
        try {
            return this.repositorio.save(datosEventos);
        }catch (Exception error){
          throw new  Exception();
        }
    }
public List<Eventos> listaEventos () throws Exception{
    try {
            return this.repositorio.findAll();
    }catch (Exception error){
        throw new  Exception();
    }
}
}
