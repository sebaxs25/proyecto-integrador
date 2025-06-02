package com.example.proyecto_integrador.servicios;

import com.example.proyecto_integrador.modelos.Tarjeta;
import com.example.proyecto_integrador.palabras.MensajeApi;
import com.example.proyecto_integrador.repositorios.ITarjetaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Tarjeta buscarTarjetaId (Integer id) throws Exception{
        try{
            Optional<Tarjeta> buscandoTarjeta=this.repositorio.findById(id);
            if (buscandoTarjeta.isPresent()){
                return buscandoTarjeta.get();
            }else{
                throw new Exception(MensajeApi.ERROR_TARJETA_NO_ENCONTRADO.getMensaje());
            }

        }catch (Exception error){
            throw new Exception(error.getMessage());

        }
    }
    public Tarjeta modificarTarjeta (Integer id, Tarjeta datosNuevos) throws Exception{
        try{
            Optional<Tarjeta>buscandoTarjeta =this.repositorio.findById(id);
            if (buscandoTarjeta.isPresent()){
                buscandoTarjeta.get().setEstadoPago(datosNuevos.getEstadoPago());
                return this.repositorio.save(buscandoTarjeta.get());
            }else {
                throw new Exception(MensajeApi.ERROR_TARJETA_NO_ENCONTRADO.getMensaje());
            }
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
