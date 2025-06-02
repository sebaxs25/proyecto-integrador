package com.example.proyecto_integrador.servicios;

import com.example.proyecto_integrador.modelos.Evento;
import com.example.proyecto_integrador.palabras.MensajeApi;
import com.example.proyecto_integrador.repositorios.IEventoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventoServicios {
    @Autowired
    IEventoRepositorio repositorio;
    public Evento guardarEventos (Evento datosEvento) throws Exception{
        try {
            return this.repositorio.save(datosEvento);
        }catch (Exception error){
          throw new  Exception();
        }
    }
public List<Evento> listaEventos () throws Exception{
    try {
            return this.repositorio.findAll();
    }catch (Exception error){
        throw new  Exception();
    }
}
    public Evento buscarEventosId (Integer id) throws Exception{
        try{
            Optional<Evento>buscandoEvento=this.repositorio.findById(id);
            if (buscandoEvento.isPresent()){
                return buscandoEvento.get();
            }else{
                throw new Exception(MensajeApi.ERROR_EVENTO_NO_ENCONTRADO.getMensaje());
            }

        }catch (Exception error){
            throw new Exception(error.getMessage());

        }
    }
    public Evento modificarEvento (Integer id, Evento datosNuevos) throws Exception{
        try{
            Optional<Evento>buscandoEvento =this.repositorio.findById(id);
            if (buscandoEvento.isPresent()){
                buscandoEvento.get().setNumerosPersonas(datosNuevos.getNumerosPersonas());
                return this.repositorio.save(buscandoEvento.get());
            }else {
                throw new Exception(MensajeApi.ERROR_EVENTO_NO_ENCONTRADO.getMensaje());
            }
        }catch (Exception error){
                throw new Exception(error.getMessage());
        }
    }
}
