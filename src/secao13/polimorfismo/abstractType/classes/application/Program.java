/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao13.polimorfismo.abstractType.classes.application;

import secao13.polimorfismo.abstractType.classes.entites.Account;
import secao13.polimorfismo.abstractType.classes.entites.SavingAccount;
import secao13.polimorfismo.abstractType.classes.entites.BusinessAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 99030499
 */
public class Program {
    public static void main(String[] args) {
        
        List<Account> list = new ArrayList<>();
        
        list.add(new SavingAccount(1001, "Alex", 500.00, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.00, 400.0));
        list.add(new SavingAccount(1003, "Bob", 300.00, 0.01));
        list.add(new BusinessAccount(1004, "Anna", 500.00, 500.0));
        
        double sum =  0.0;
        for (Account account : list) {
            sum += account.getBalance();
        }
        System.out.printf("total: $" +  String.format("%.2f%n", sum));
        for (Account acc : list) {
            acc.deposit(10);
        }
        for (Account acc : list) {
            System.out.printf("Update balance for account %d: %.2f%n",acc.getNumber(), acc.getBalance());
        }
        
        sum = 0;
        for (Account account : list) {
            sum += account.getBalance();
        }
        System.out.printf("total: $" +  String.format("%.2f%n", sum));
        
    }
}
