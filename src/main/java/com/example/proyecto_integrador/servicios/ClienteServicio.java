package com.example.proyecto_integrador.servicios;

import com.example.proyecto_integrador.modelos.Cliente;
import com.example.proyecto_integrador.palabras.MensajeApi;
import com.example.proyecto_integrador.repositorios.IClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServicio {
    @Autowired
    IClienteRepositorio repositorio;
    public Cliente guardarCliente (Cliente datosNuevos) throws Exception{
        try{
            return this.repositorio.save(datosNuevos);
        }catch (Exception error){
            throw  new Exception();
        }
    }
    public List<Cliente> listaCliente ()throws Exception{
        try{
            return this.repositorio.findAll();
        }catch (Exception error){
            throw new Exception();
        }

    }
    public Cliente buscarClientesId (Integer id) throws Exception{
        try{
            Optional<Cliente> buscandoCliente=this.repositorio.findById(id);
            if (buscandoCliente.isPresent()){
                return buscandoCliente.get();
            }else{
                throw new Exception(MensajeApi.ERROR_CLIEENTE_NO_ENCONTRADO.getMensaje());
            }

        }catch (Exception error){
            throw new Exception(error.getMessage());

        }
    }
    public Cliente modificarCliente (Integer id, Cliente datosNuevos) throws Exception{
        try{
            Optional<Cliente>buscandoCliente =this.repositorio.findById(id);
            if (buscandoCliente.isPresent()){
                buscandoCliente.get().setSegundoTelefono(datosNuevos.getSegundoTelefono());
                return this.repositorio.save(buscandoCliente.get());
            }else {
                throw new Exception(MensajeApi.ERROR_CLIEENTE_NO_ENCONTRADO.getMensaje());
            }
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
