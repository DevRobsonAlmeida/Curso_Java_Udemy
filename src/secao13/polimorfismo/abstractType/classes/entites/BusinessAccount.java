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
public class BusinessAccount extends Account {

    private Double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10;
        }
    }
    
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

}
