/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao13.polimorfismo.execicioResolvido.entites;

/**
 *
 * @author 99030499
 */
public class OutsourcedEmployee extends Employee{
   
    private Double additionalCharge;
    
    public OutsourcedEmployee() {
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour) {
        super(name, hours, valuePerHour);
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }
    
    @Override
    public double payment(){
        return super.payment() + additionalCharge * 1.1;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    
    
    
}
