package com.example.myapplication;



public class CurrencyDTO {
    private int error;
    private String descError;
    private DatosBasicosDTO datosBasicos;
    private String listaComisiones;

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

    public DatosBasicosDTO getDatosBasicos() {
        return datosBasicos;
    }

    public void setDatosBasicos(DatosBasicosDTO datosBasicos) {
        this.datosBasicos = datosBasicos;
    }

    public String getListaComisiones() {
        return listaComisiones;
    }

    public void setListaComisiones(String listaComisiones) {
        this.listaComisiones = listaComisiones;
    }
}
