package com.example.myapplication;

public class Currency {
    String type;
    int error;
    String descError;
    DatosBasicos datosBasicos;
    String listaComisiones;


    public Currency(String type, int error, String descError, DatosBasicos datosBasicos, String listaComisiones) {
        this.type = type;
        this.error = error;
        this.descError = descError;
        this.datosBasicos = datosBasicos;
        this.listaComisiones = listaComisiones;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "type='" + type + '\'' +
                ", error=" + error +
                ", descError='" + descError + '\'' +
                ", datosBasicos=" + datosBasicos +
                ", listaComisiones='" + listaComisiones + '\'' +
                '}';
    }
}
