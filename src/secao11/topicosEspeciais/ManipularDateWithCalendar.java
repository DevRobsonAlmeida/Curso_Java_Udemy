/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao11.topicosEspeciais;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author robson-pc
 */
public class ManipularDateWithCalendar {
    
    public static void main(String[] args) throws ParseException{
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        
        System.out.println(sdf.format(d));
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4); //Adiciona horas do dia
        d = cal.getTime();
        
        int minutes = cal.get(Calendar.MINUTE);
        int month = 1 + cal.get(Calendar.MONTH);
        
        
        System.out.println(d);
        System.out.println("Minutos: " + minutes);
        System.out.println("Mês: " + month); 
    }
    
}
