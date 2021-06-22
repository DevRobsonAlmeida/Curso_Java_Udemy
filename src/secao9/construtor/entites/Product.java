/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao9.construtor.entites;

/**
 *
 * @author Robson
 */
public class Product {

    private String name;
    private double price;
    private int qtd;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name, double price, int qtd) {
        this.name = name;
        this.price = price;
        this.qtd = qtd;
    }

    public double TotalValueStock() {
        return price * qtd;
    }

    public void AddProducts(int qtd) {
        this.qtd += qtd;
    }

    public void RemoveProducts(int qtd) {
        this.qtd -= qtd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    
    
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + qtd
                + " units, Total $"
                + TotalValueStock();
    }
}
