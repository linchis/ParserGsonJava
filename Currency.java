package com.example.myapplication;

import androidx.annotation.Nullable;

public class Currency {
    String typeTax;
    int error;
    String descError;
    DatosBasicos datosBasicos;
    String listaComisiones;


    public Currency(String type, int error, String descError, DatosBasicos datosBasicos, String listaComisiones) {
        this.typeTax = type;
        this.error = error;
        this.descError = descError;
        this.datosBasicos = datosBasicos;
        this.listaComisiones = listaComisiones;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "type='" + typeTax + '\'' +
                ", error=" + error +
                ", descError='" + descError + '\'' +
                ", datosBasicos=" + datosBasicos +
                ", listaComisiones='" + listaComisiones + '\'' +
                '}';
    }

    public String getTypeTax() {
        return typeTax;
    }

    public void setTypeTax(String typeTax) {
        this.typeTax = typeTax;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getDescError() {
        return descError;
    }

    public void setDescError(String descError) {
        this.descError = descError;
    }

    public DatosBasicos getDatosBasicos() {
        return datosBasicos;
    }

    public void setDatosBasicos(DatosBasicos datosBasicos) {
        this.datosBasicos = datosBasicos;
    }

    public String getListaComisiones() {
        return listaComisiones;
    }

    public void setListaComisiones(String listaComisiones) {
        this.listaComisiones = listaComisiones;
    }
}
