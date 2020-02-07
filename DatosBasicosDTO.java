package com.example.myapplication;

public class DatosBasicosDTO {
    String fechaEmisionTransf;
    Double impTransferencia;
    Double impComision;
    Double impGastos;
    Double impLiquido;
    String nombreOrdenante;
    String descCuentaAbono;
    String descCuentaCargo;
    String impTotalDivBase;


    public String getFechaEmisionTransf() {
        return fechaEmisionTransf;
    }

    public void setFechaEmisionTransf(String fechaEmisionTransf) {
        this.fechaEmisionTransf = fechaEmisionTransf;
    }

    public Double getImpTransferencia() {
        return impTransferencia;
    }

    public void setImpTransferencia(Double impTransferencia) {
        this.impTransferencia = impTransferencia;
    }

    public Double getImpComision() {
        return impComision;
    }

    public void setImpComision(Double impComision) {
        this.impComision = impComision;
    }

    public Double getImpGastos() {
        return impGastos;
    }

    public void setImpGastos(Double impGastos) {
        this.impGastos = impGastos;
    }

    public Double getImpLiquido() {
        return impLiquido;
    }

    public void setImpLiquido(Double impLiquido) {
        this.impLiquido = impLiquido;
    }

    public String getNombreOrdenante() {
        return nombreOrdenante;
    }

    public void setNombreOrdenante(String nombreOrdenante) {
        this.nombreOrdenante = nombreOrdenante;
    }

    public String getDescCuentaAbono() {
        return descCuentaAbono;
    }

    public void setDescCuentaAbono(String descCuentaAbono) {
        this.descCuentaAbono = descCuentaAbono;
    }

    public String getDescCuentaCargo() {
        return descCuentaCargo;
    }

    public void setDescCuentaCargo(String descCuentaCargo) {
        this.descCuentaCargo = descCuentaCargo;
    }

    public String getImpTotalDivBase() {
        return impTotalDivBase;
    }

    public void setImpTotalDivBase(String impTotalDivBase) {
        this.impTotalDivBase = impTotalDivBase;
    }
}
