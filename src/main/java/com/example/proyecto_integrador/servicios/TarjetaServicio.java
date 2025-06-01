package com.example.proyecto_integrador.servicios;

import com.example.proyecto_integrador.modelos.Tarjeta;
import com.example.proyecto_integrador.repositorios.ITarjetaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarjetaServicio {
    @Autowired
    ITarjetaRepositorio repositorio;
    public Tarjeta guardarTajerta (Tarjeta datosNuevos) throws Exception{
        try{
            return this.repositorio.save(datosNuevos);
        } catch (Exception error) {
            throw new Exception();
        }

    }
   public List<Tarjeta> listaTarjeta () throws Exception{
        try{
            return this.repositorio.findAll();
        }catch (Exception error){
            throw new Exception();
        }
    }

}
