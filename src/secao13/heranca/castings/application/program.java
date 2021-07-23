/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao13.heranca.castings.application;


import secao13.heranca.entites.Account;
import secao13.heranca.entites.BusinessAccount;
import secao13.heranca.entites.SavingAccount;

/**
 *
 * @author 99030499
 */
public class program {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bcc =  new BusinessAccount( 1002,"Maria", 0.0, 500.0);
        
        //UPCASTING
        
        Account acc1 = bcc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 500.0);
        Account acc3 = new SavingAccount(1004, "Anna", 0.0, 0.01);
        
        
        //DOWNCASTING
        
        BusinessAccount bcc1 = (BusinessAccount)acc2;
        bcc1.loan(100.0);

        
        SavingAccount scc1 =  (SavingAccount) acc3;
        
        
        //BusinessAccount bcc2 =  (BusinessAccount) acc3;
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount bcc2 = (BusinessAccount) acc3;
            bcc2.loan(200.0);
            System.out.println("Loan! ");
        }
        
        if (acc3 instanceof SavingAccount) {
            SavingAccount scc = (SavingAccount) acc3;
            scc.updateBalance();
            System.out.println("Update");
        }
        
    }
}
