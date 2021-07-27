/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao14.execicio.bank.application;

import java.util.Scanner;
import secao14.execicio.bank.model.entites.Account;
import secao14.execicio.bank.model.exceptions.AccountException;

/**
 *
 * @author 99030499
 */
public class program {

    /**
     * Fazer um programa para ler os dados de uma conta bancária e depois
     * realizar um saque nesta conta conta bancária, mostrando o novo saldo. Um
     * saque não pode ocorrer ou se não houver saldo na conta, ou se o valor do
     * saque for superior ao limite de saque da conta.
     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Account acc;
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();

            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();

            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();

            System.out.print("Withdraw Limit: ");
            double withdrawLimit = sc.nextDouble();

            acc = new Account(number, holder, balance, withdrawLimit);
            
            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            acc.withdraw(amount);
            System.out.println("New Balance: " + acc.getBalance());

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Valor não reconhecido");
        } catch (AccountException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
        sc.close();
    }

}
