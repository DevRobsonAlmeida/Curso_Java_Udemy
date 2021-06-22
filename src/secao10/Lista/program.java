/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao10.Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Robson
 */
public class program {
    /** - DEMO - 
     *  Tamanho da lista: size()
     *  Inserir elemento na lista:add(obg), add(int, obj)
     *  Remover elementos da lista: remove(obj), remover(int), remveIf(predicate)
     *  Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)
     *  Filtar lista com base em predicado:
     *      List<Integer> result = list.stram().filter(x -> x > 4).collect(Collectors.tolist());
     *  Encontrar primeira ocorrência com base em predicado
     *      Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
     * 
     *  > Assuntos pendentes: 
     *      interfaces
     *      generics
     *      predicados(lambda)
     */
    
    public static void main(String[] args) {
        // Chamado de generic o que ficar dentro dos sinais <>
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        
        // adicionando na posição do indice
        list.add(2, "Marco");
        
        // Saber a quantidade de lista
        System.out.println("Quantidade: " + list.size());

        for (String nomes : list) {
            System.out.println(nomes);
        }
        
        
        System.out.println("--------------------------------------");
        //Procurar por um String
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));
                
        System.out.println("--------------------------------------");
        //Buscar somente o qual começe com uma determina inicial
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String nomes : result) {
            System.out.println(nomes);
        }
        
        System.out.println("--------------------------------------");  
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
                
        System.out.println("--------------------------------------");        
        //remover por nome, indice, condicional
        list.remove("Anna");
        list.remove(1); // alex
        list.removeIf(x -> x.charAt(0) == 'M'); 
        
        for (String nomes : list) {
            System.out.println(nomes);
        }
        
    }
}
