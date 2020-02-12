package com.example.myapplication;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class PreLiquidationTransferDeserializer implements JsonDeserializer<PreLiquidationsTransferDTO> {

    @Override
    public PreLiquidationsTransferDTO deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        Gson gson = new GsonBuilder().create();

        PreLiquidationsTransferDTO preLiquidationsTransferDTO = new PreLiquidationsTransferDTO();
        JsonObject jsonGlobal = (JsonObject) json;

        List<PreLiquidationTransferDTO> lista = new ArrayList<>();

        //recorrer tipo enumerado para obtener los tipos de comision
        for (PreLiquidationTransferType cType: PreLiquidationTransferType.values()){
            System.out.println("COMISION: " + cType);

            JsonObject jsonComision = jsonGlobal.get(cType.toString()).getAsJsonObject();

            PreLiquidationTransferDTO commision = new PreLiquidationTransferDTO(
                    cType,
                    jsonComision.get("error").getAsInt(),
                    jsonComision.get("descError").isJsonNull()?null:jsonComision.get("descError").getAsString(),
                    BasicDataParser(jsonComision.get("datosBasicos").getAsJsonObject()),
                    jsonComision.get("listaComisiones").isJsonNull()?null:jsonComision.get("listaComisiones").getAsString());

            lista.add(commision);
        }
        preLiquidationsTransferDTO.setPreLiquidationsTransferDTO(lista);
        return preLiquidationsTransferDTO;
    }

    private PreLiquidationTransferBasicDataDTO BasicDataParser(JsonObject basicDataObject){

        try {
            return new PreLiquidationTransferBasicDataDTO(
                    new SimpleDateFormat("dd/MM/yyyy").parse(basicDataObject.get("fechaEmisionTransf").getAsString()),
                    basicDataObject.get("impTransferencia").getAsDouble(),
                    basicDataObject.get("impComision").getAsDouble(),
                    basicDataObject.get("impGastos").getAsDouble(),
                    basicDataObject.get("impLiquido").getAsDouble(),
                    basicDataObject.get("nombreOrdenante").isJsonNull()?null:basicDataObject.get("nombreOrdenante").getAsString(),
                    basicDataObject.get("descCuentaAbono").isJsonNull()?null:basicDataObject.get("descCuentaAbono").getAsString(),
                    basicDataObject.get("descCuentaCargo").isJsonNull()?null:basicDataObject.get("descCuentaCargo").getAsString(),
                    basicDataObject.get("impTotalDivBase").isJsonNull()?null:basicDataObject.get("impTotalDivBase").getAsString()
                );
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}