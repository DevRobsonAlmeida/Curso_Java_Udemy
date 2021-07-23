/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao13.polimorfismo.ExecicioFixicacao.entites;

/**
 *
 * @author 99030499
 */
public class ImportedProduct extends Product {

    private Double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }
    
    @Override
    public String priceTag(){
        return name + " - $ " + String.format("%.2f", totalPrice()) + "(Customs fee $ " + customsFee + " )" ;
    }
    
    public Double totalPrice(){
        return customsFee + price;
    }
    
    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
    
    

}
