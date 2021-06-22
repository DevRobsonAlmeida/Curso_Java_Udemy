/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao12.enumeracoes.aplication;

import java.util.Date;
import secao12.enumeracoes.entities.Order;
import secao12.enumeracoes.entities.enums.OrdemStatus;

/**
 *
 * @author robson-pc
 */
public class Programa {

    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrdemStatus.PENDING_PAYMENT);
        // Acrescentado um toString na classe Order
        System.out.println(order);
        
        
        // Conversão de String para enum
        OrdemStatus os1 = OrdemStatus.DELIVERED;
        
        OrdemStatus os2 = OrdemStatus.valueOf("DELIVERED");
        
        System.out.println(os1);
        System.out.println(os2);
    }
}
