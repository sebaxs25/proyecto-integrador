package com.example.proyecto_integrador.palabras;

public enum MensajeApi {
    ERROR_EVENTO_NO_ENCONTRADO("EL EVENTO NO HA SIDO ENCONTARDO"),
    ERROR_TARJETA_NO_ENCONTRADO("LA TARJETA NO HA SIDO ENCONTRADO"),
    ERROR_CLIEENTE_NO_ENCONTRADO("EL CLIENTE NO HA SIDO ENCONTARDO")
    ;
    private String mensaje;

    MensajeApi (String mensaje) {this.mensaje= mensaje; }

    public String getMensaje (){ return  mensaje;}
}
