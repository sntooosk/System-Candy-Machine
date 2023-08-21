package com.machine.model;

import java.text.DecimalFormat;
/**
 * Classe
 *
 * @author Juliano
 * @version 1.1
 */
public class FormataMoeda {
  
    public String ConvMoeda(String valTela) {
        double valor = Double.parseDouble(valTela);
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");
        String formatado = df.format(valor);

        return formatado;
    }    
}