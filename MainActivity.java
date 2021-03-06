package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void onResume() {
        super.onResume();
        String strjson = "{\"inmediata\":{\"error\":\"0\",\"descError\":null,\"datosBasicos\":{\"fechaEmisionTransf\":\"09/01/2020\",\"impTransferencia\":10.12,\"impComision\":6.0,\"impGastos\":0.0,\"impLiquido\":16.12,\"nombreOrdenante\":\"SUPERMAN\",\"descCuentaAbono\":\"CR 99 11111111122233444555\",\"descCuentaCargo\":\"ES 00 98765432100000000000\",\"impTotalDivBase\":null},\"listaComisiones\":null},\"urgente\":{\"error\":\"0\",\"descError\":\"PL_5304\",\"datosBasicos\":{\"fechaEmisionTransf\":\"09/01/2020\",\"impTransferencia\":10.12,\"impComision\":2.0,\"impGastos\":0.0,\"impLiquido\":12.12,\"nombreOrdenante\":\"SUPERMAN\",\"descCuentaAbono\":\"CR 99 11111111122233444555\",\"descCuentaCargo\":\"ES 00 98765432100000000000\",\"impTotalDivBase\":null},\"listaComisiones\":null},\"estandar\":{\"error\":\"0\",\"descError\":null,\"datosBasicos\":{\"fechaEmisionTransf\":\"09/01/2020\",\"impTransferencia\":10.12,\"impComision\":2.0,\"impGastos\":0.0,\"impLiquido\":12.12,\"nombreOrdenante\":\"SUPERMAN\",\"descCuentaAbono\":\"CR 99 11111111122233444555\",\"descCuentaCargo\":\"ES 00 98765432100000000000\",\"impTotalDivBase\":null},\"listaComisiones\":null}}";


        //COMMISSION EXAMPLE
        PreLiquidationsTransferDTO commissions = parseCommissionsJson(strjson);
        commissions.toString();

        //CURRENCY EXAMPLE
        /*
        Map<String, Currency> parsedMap = parserCurrencyJson(strjson);

        //TEST
        for (Map.Entry<String, Currency> entry : parsedMap.entrySet()) {
            System.out.println(entry.getValue().toString());
        }
        */

    }

    //OLD
    private Map<String, Currency> parserCurrencyJson(String stringInput) {

        Gson gson = new GsonBuilder().create();
        Currency currency = gson.fromJson(stringInput, Currency.class);

        Map<String, CurrencyDTO> decoded = gson.fromJson(stringInput,
                new TypeToken<Map<String, CurrencyDTO>>() {
                }.getType());
        Map<String, Currency> parsedMap = new HashMap<String, Currency>();
        for (Map.Entry<String, CurrencyDTO> entry : decoded.entrySet()) {
            parsedMap.put(entry.getKey(),
                    new Currency(entry.getKey(),
                            entry.getValue().getError(),
                            entry.getValue().getDescError(),
                            createFromDTO(entry.getValue().getDatosBasicos()),
                            entry.getValue().getListaComisiones()));
        }
        return parsedMap;
    }
    //OLD
    private DatosBasicos createFromDTO(DatosBasicosDTO dbDTO) {
        DatosBasicos db = null;
        try {
            db = new DatosBasicos(
                    new SimpleDateFormat("dd/MM/yyyy").parse(dbDTO.getFechaEmisionTransf()),
                    dbDTO.getImpTransferencia(),
                    dbDTO.getImpComision(),
                    dbDTO.getImpGastos(),
                    dbDTO.getImpLiquido(),
                    dbDTO.getNombreOrdenante(),
                    dbDTO.getDescCuentaAbono(),
                    dbDTO.getDescCuentaCargo(),
                    dbDTO.getImpTotalDivBase());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return db;
    }


    //NEW
    private PreLiquidationsTransferDTO parseCommissionsJson(String json){

        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(PreLiquidationsTransferDTO.class, new PreLiquidationTransferDeserializer());
        Gson gson = builder.create();

        return gson.fromJson(json, PreLiquidationsTransferDTO.class);

    }
}
