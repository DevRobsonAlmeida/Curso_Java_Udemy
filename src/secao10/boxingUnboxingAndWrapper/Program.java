/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao10.boxingUnboxingAndWrapper;

/**
 *
 * @author Robson
 */
public class Program {
    // Boxing
    // É a conversão de um objeto tipo valor para um objeto tipo referência compatível.
    
    // O 'valor' armazena 20.
    int valor = 20;
    // EMCAIXOTAMENTO
    // o valor que foi armazenado em x será alocado na memoria Heap.
    // e o obj estará apontando para o valor.
    Object obj = valor;
    Integer number = valor;
    
    // Umboxing
    // É o processo de conversão de um objeto tipo refência para um objeto tipo valor compatível.
    // A ação que ocorre é que o atributo obj está armazenando no 'y'.
    // O cash é necessario, pois os tipos são diferentes.
    int y = (int) obj;
    //  Caso o objeto seja da classe o atributo, não é necessario o uso do Cash
    int z = number * 2;
    
    // Wrapper Classes
    // São Classes equivalentes aos tipos primitivos
    // Boxing e Unboxing é natural na linguagem
    // Uso Comum: campos de entidaddes em sistemas de informações(IMPORTANTE!)
    // * Pois tipos referência(classes) aceitam valor null e usufruem dos recursos OO
    
    
    
    
}
