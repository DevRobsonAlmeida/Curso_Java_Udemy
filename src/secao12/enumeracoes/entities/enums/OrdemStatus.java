/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao12.enumeracoes.entities.enums;

/**
 *
 * @author robson-pc
 * 
 * Enumerações 
 *
 * -É um tipo especial que serve para especificar de forma literal um conjunto
 * de constantes relacionadas
 *
 * - Palavra cheve em Java: enum
 *
 * - Vantage: melhor semântica, códio mais legível e auxiliado pelo compilador
 *
 * - Referência: document oracle --> Java -- > JavaOO --> enum.html
 *
 */


public enum OrdemStatus {
    PENDING_PAYMENT,
    PROCESSING,
    SHIPPED,
    DELIVERED;
}
