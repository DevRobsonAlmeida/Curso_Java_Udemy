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
public class Company extends TexPayer{
    private int numberOfEmploees;

    public Company() {
    }

    public Company(String name, Double anualIncome, int numberOfEmploees) {
        super(name, anualIncome);
        this.numberOfEmploees = numberOfEmploees;
    }
    
    @Override
    public double tax() {
       return anualIncome * ((numberOfEmploees > 10 ) ? 0.14 : 0.16);
    }

    public int getNumberOfEmploees() {
        return numberOfEmploees;
    }

    public void setNumberOfEmploees(int numberOfEmploees) {
        this.numberOfEmploees = numberOfEmploees;
    }
    
}
