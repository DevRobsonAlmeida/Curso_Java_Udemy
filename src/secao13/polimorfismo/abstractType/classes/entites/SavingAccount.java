/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao13.polimorfismo.abstractType.classes.entites;

import secao13.polimorfismo.abstractType.classes.entites.Account;
import secao13.polimorfismo.abstractType.classes.entites.Account;

/**
 *
 * @author 99030499
 */
public class SavingAccount extends Account {

    private Double interestRate;

    public SavingAccount() {
        super();
    }

    public SavingAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

}
