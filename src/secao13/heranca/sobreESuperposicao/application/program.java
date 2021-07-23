/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao13.heranca.sobreESuperposicao.application;

import secao13.heranca.entites.Account;
import secao13.heranca.entites.BusinessAccount;
import secao13.heranca.entites.SavingAccount;

/**
 *
 * @author 99030499
 */
public class program {
    public static void main(String[] args) {
        Account acc1 = new Account(1001, "Alex", 1000.0);
        acc1.withdraw(200);
        System.out.println(acc1.getBalance());
        
        Account acc2 = new SavingAccount(1002, "Maria", 1000.0, 0.01);
        acc2.withdraw(200);
        System.out.println(acc2.getBalance());
        
        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc3.withdraw(200);
        System.out.println(acc3.getBalance());
    }
}
