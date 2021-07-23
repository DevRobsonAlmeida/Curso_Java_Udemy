/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao13;

/**
 *
 * @author 99030499
 */
public class Readme {
    /**
     *  > Herança
     * 
     *  - É um tipo associação que permite que uma classe herde todos dados e comportamento de outra
     * 
     *  - Definições importantes
     * 
     *  - Vantagens
     *      Reuso
     *      Polimorfismo
     * 
     *  - Sintaxe
     *      Class A extends class B
     * 
     *  - Definições importante
     *      Relação "é-um"
     *      Generalização/especialização
     *      SuperClasse(classe base)/ subclasse(classe derivada)
     *      Herança/extensão
     *      Herança é uma associação entre classes (e não entre objetos)
     * 
     * 
     *  > Sobreposição ou Sobrescrita
     * 
     *  - É a implementação de um amétodo de uma superclsse na subclasse
     * 
     *  - É fortmente recomendáve usar anotação @Override em um método sobrecrito
     *      Facilita a leitura e compreensão do código
     *      Avisamos ao compilador(boa prática)
     * 
     * 
     *     
     *  > Checklist
     * 
     *  - Upcasting
     *      Casting da subclasse para superclasse
     *      Uso comum: polimorfismo
     * 
     *  - Downcasting
     *      Casting da superclasse para subclasse
     *      Palavra instanceof
     *      Uso comum: métodos que recebem parâmetros genéricos(ex: Equals)
 
     * 
     * 
     *  > Classe e métodos final
     * 
     *  - Palavra cheve: final
     *  - Chave: evita que a classe seja herdada
     *      public final class SavingAccount{}
     *  - Método: evita que o método sob seja sobreposto
     * 
     *  Pra que? 
     *  - Segurança: dependendo das regras do negócio, às vezes é desejável
     *              garantir que uma classe não seja herdada, ou que um método
     *              nao seja sobreposto.
     *      Geralmente convém acrescentar final em métodos sobrepostos, pois 
     *      sobreposiçoes múltiplas podem ser uma porta de entreda para inconsistências.
     *  - Performance: atributos de tipo deuma classe finla são analisado 
     *                 de forma mais rápida em tempo de execeção.
     *      Exempllo clássico: String
     * 
     *  
     * 
     * 
     *  > Polimorfismo
     *      Em Programação Orientada a Objeto, polimorfismo é recurso que 
     *      permite que variáveis de um mesmo tipo mais genérico possam
     *      apontar para objetos de tipos específicos diferentes, tendo
     *      assim comportamento diferente conforme cada tipo específico.
     * 
     *      Importante entender
     *       - A associação do tipo específico com o tipo genérico é feita em tempo de execução(upcasting)
     *       - O compolador não sabe para qual feita (ele só sabe que são duas veriáveis tipos Account):
     * 
     * 
     *  > Abstratas
     *      - Classes
     *          São Classes que não podem ser instanciadas
     * 
     *          É uma forma de gatantir herança total: somente subclasses não abstratas 
     *          podem ser instanciadas, mas nunca a superclasse abstrata
     *      
     *      - Modulos
     *          São métodos que não possuem implementação
     *         
     *          Métodos precisam ser abstratos quenaod a classe é generica
     *          demais para conter sua implementação
     * 
     *          Se uma classe possuor pelos menos um método abstrato, 
     *          então esta classe também é abstrata
     *      
     * 
     * 
     */
}
