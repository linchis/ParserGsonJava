package com.example.myapplication;

import java.util.List;

public class PreLiquidationsTransferDTO {
    List<PreLiquidationTransferDTO> preLiquidationsTransferDTO;

    public PreLiquidationsTransferDTO() {
    }

    public PreLiquidationsTransferDTO(List<PreLiquidationTransferDTO> preLiquidationsTransferDTO) {
        this.preLiquidationsTransferDTO = preLiquidationsTransferDTO;
    }

    public List<PreLiquidationTransferDTO> getPreLiquidationsTransferDTO() {
        return preLiquidationsTransferDTO;
    }

    public void setPreLiquidationsTransferDTO(List<PreLiquidationTransferDTO> preLiquidationsTransferDTO) {
        this.preLiquidationsTransferDTO = preLiquidationsTransferDTO;
    }


    @Override
    public String toString() {
        return "PreLiquidationsTransferDTO{" +
                "preLiquidations=" + preLiquidationsTransferDTO +
                '}';
    }
}
