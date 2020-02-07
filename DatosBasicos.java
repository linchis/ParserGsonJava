package com.example.myapplication;

import java.util.Date;

public class DatosBasicos {
    Date fechaEmisionTransf;
    Double impTransferencia;
    Double impComision;
    Double impGastos;
    Double impLiquido;
    String nombreOrdenante;
    String descCuentaAbono;
    String descCuentaCargo;
    String impTotalDivBase;

    public DatosBasicos(Date fechaEmisionTransf, Double impTransferencia, Double impComision, Double impGastos, Double impLiquido, String nombreOrdenante, String descCuentaAbono, String descCuentaCargo, String impTotalDivBase) {
        this.fechaEmisionTransf = fechaEmisionTransf;
        this.impTransferencia = impTransferencia;
        this.impComision = impComision;
        this.impGastos = impGastos;
        this.impLiquido = impLiquido;
        this.nombreOrdenante = nombreOrdenante;
        this.descCuentaAbono = descCuentaAbono;
        this.descCuentaCargo = descCuentaCargo;
        this.impTotalDivBase = impTotalDivBase;
    }

    public DatosBasicos() {
    }

    @Override
    public String toString() {
        return "DatosBasicos{" +
                "fechaEmisionTransf=" + fechaEmisionTransf +
                ", impTransferencia=" + impTransferencia +
                ", impComision=" + impComision +
                ", impGastos=" + impGastos +
                ", impLiquido=" + impLiquido +
                ", nombreOrdenante='" + nombreOrdenante + '\'' +
                ", descCuentaAbono='" + descCuentaAbono + '\'' +
                ", descCuentaCargo='" + descCuentaCargo + '\'' +
                ", impTotalDivBase='" + impTotalDivBase + '\'' +
                '}';
    }

    public Date getFechaEmisionTransf() {
        return fechaEmisionTransf;
    }

    public void setFechaEmisionTransf(Date fechaEmisionTransf) {
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
