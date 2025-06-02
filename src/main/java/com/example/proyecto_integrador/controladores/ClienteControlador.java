package com.example.proyecto_integrador.controladores;

import com.example.proyecto_integrador.modelos.Cliente;

import com.example.proyecto_integrador.servicios.ClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/clientes")
@RestController
public class ClienteControlador {
    @Autowired
    ClienteServicio servicio;
    public ResponseEntity<?> guardarCliente (@RequestBody Cliente datosNuevos){
        try {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.servicio.guardarCliente(datosNuevos));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }

    }
}
