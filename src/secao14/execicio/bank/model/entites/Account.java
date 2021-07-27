/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao14.execicio.bank.model.entites;

import secao14.execicio.bank.model.exceptions.AccountException;

/**
 *
 * @author 99030499
 */
public class Account {
    private Integer number;
    private String holder;
    private double balance = 0;
    private double withdrawLimit = 0 ;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) throws AccountException {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }
    
    public void depoisit(Double amount){
        balance += amount;
    }
    
    public void withdraw(Double amount) throws AccountException{
        if (withdrawLimit < amount) {
            throw new AccountException("The amount exceeds withdraw limit");
        }else
            if (balance < amount) {
            throw new AccountException("Not enough balance");
        }
        balance -= amount;
    }

    
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }


    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    
    
    
}
