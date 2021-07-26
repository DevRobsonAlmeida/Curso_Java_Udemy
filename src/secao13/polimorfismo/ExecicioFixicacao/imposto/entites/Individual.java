/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao13.polimorfismo.ExecicioFixicacao.imposto.entites;

/**
 *
 * @author robson-pc
 */
public class Individual extends TexPayer{
    private double healthExpenditures;

    public Individual() {
    }

    public Individual( String name, Double anualIncome, double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }
    
    @Override
    public double tax() {
       double tax = anualIncome * ((anualIncome < 20000) ? 0.15: 0.25);
        if (healthExpenditures > 0) {
            tax -= healthExpenditures * 0.50;
        }
       return tax;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    
    
}
