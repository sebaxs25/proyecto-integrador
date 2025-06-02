package com.example.proyecto_integrador.controladores;

import com.example.proyecto_integrador.modelos.Tarjeta;
import com.example.proyecto_integrador.servicios.TarjetaServicio;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/tarjetas")
@RestController
public class TarjetaControlador {
    @Autowired
    TarjetaServicio servicio;
    public ResponseEntity<?> guardarTarjeta (@RequestBody Tarjeta datosNuevos){
        try {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.servicio.guardarTajerta(datosNuevos));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }

    }
}
