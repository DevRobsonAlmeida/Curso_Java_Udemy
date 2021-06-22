/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao8.programacaoOrientacaoAObjetos.entites;

/**
 *
 * @author Robson
 */
public class Produto {

    public String name;
    public double price;
    public int qtd;

    public double TotalValueStock() {
        return price * qtd;
    }

    public void AddProducts(int qtd) {
        this.qtd += qtd;
    }

    public void RemoveProducts(int qtd) {
        this.qtd -= qtd;
    }
    
    public String toString(){
        return name
            + ", $ "
            + String.format("%.2f", price)
            + ", "
            + qtd
            + " units, Total $"
            + TotalValueStock();
    }
}
