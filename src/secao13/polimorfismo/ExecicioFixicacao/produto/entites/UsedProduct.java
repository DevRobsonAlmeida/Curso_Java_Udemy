/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao13.polimorfismo.ExecicioFixicacao.produto.entites;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 99030499
 */
public class UsedProduct extends Product{
    private Date manufactureDate;

    public UsedProduct() {
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }
    
    @Override
    public String priceTag(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return name + " (Used) $ " + price + " ( Manufacture date: " + sdf.format(manufactureDate) + ")";
    }
    
    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    
    
    
    
}
