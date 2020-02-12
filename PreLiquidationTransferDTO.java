package com.example.myapplication;

public class PreLiquidationTransferDTO {
    PreLiquidationTransferType preLiquidationTransferType;
    int error;
    String descError;
    PreLiquidationTransferBasicDataDTO datosBasicos;
    String listaComisiones;


    public PreLiquidationTransferDTO(PreLiquidationTransferType type, int error, String descError, PreLiquidationTransferBasicDataDTO datosBasicos, String listaComisiones) {
        this.preLiquidationTransferType = type;
        this.error = error;
        this.descError = descError;
        this.datosBasicos = datosBasicos;
        this.listaComisiones = listaComisiones;
    }

    @Override
    public String toString() {
        return "PreLiquidations{" +
                "type='" + preLiquidationTransferType + '\'' +
                ", error=" + error +
                ", descError='" + descError + '\'' +
                ", datosBasicos=" + datosBasicos +
                ", listaComisiones='" + listaComisiones + '\'' +
                '}';
    }

    public PreLiquidationTransferType getPreLiquidationTransferType() {
        return preLiquidationTransferType;
    }

    public void setPreLiquidationTransferType(PreLiquidationTransferType preLiquidationTransferType) {
        this.preLiquidationTransferType = preLiquidationTransferType;
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

    public PreLiquidationTransferBasicDataDTO getDatosBasicos() {
        return datosBasicos;
    }

    public void setDatosBasicos(PreLiquidationTransferBasicDataDTO datosBasicos) {
        this.datosBasicos = datosBasicos;
    }

    public String getListaComisiones() {
        return listaComisiones;
    }

    public void setListaComisiones(String listaComisiones) {
        this.listaComisiones = listaComisiones;
    }
}
