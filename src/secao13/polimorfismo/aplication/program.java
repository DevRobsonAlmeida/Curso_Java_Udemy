/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao13.polimorfismo.aplication;

import secao13.heranca.entites.Account;
import secao13.heranca.entites.BusinessAccount;
import secao13.heranca.entites.SavingAccount;

/**
 *
 * @author 99030499
 */
public class program {

    public static void main(String[] args) {

        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingAccount(1023, "Maria", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());

    }

}
