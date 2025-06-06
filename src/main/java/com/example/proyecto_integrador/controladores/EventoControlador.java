package com.example.proyecto_integrador.controladores;


import com.example.proyecto_integrador.modelos.Evento;
import com.example.proyecto_integrador.servicios.EventoServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/eventos")
public class EventoControlador {
    @Autowired
    EventoServicios servicio;
    @PostMapping
    public ResponseEntity<?> guardarEvento (@RequestBody Evento datosNuevos){
        try {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.servicio.guardarEventos(datosNuevos));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }

    }
}


