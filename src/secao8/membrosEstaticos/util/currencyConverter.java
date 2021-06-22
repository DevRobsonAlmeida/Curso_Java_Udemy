/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao8.membrosEstaticos.util;

/**
 *
 * @author Robson
 */
public class currencyConverter {
    public static double conversion(double dolar, double qtd){
        double value = dolar * qtd;
        double valueIOF = value * 0.06;
        double resultado = valueIOF + value;
        return resultado;
    }
}
