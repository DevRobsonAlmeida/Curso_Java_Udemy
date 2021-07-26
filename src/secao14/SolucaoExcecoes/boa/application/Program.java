/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao14.SolucaoExcecoes.boa.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import secao14.SolucaoExcecoes.boa.model.entites.Reservation;
import secao14.SolucaoExcecoes.boa.model.exceptions.DomainException;

/**
 *
 * @author 99030499
 */
public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {

            System.out.print("Room number:");
            int number = sc.nextInt();
            System.out.print("Check-In date (dd/MM/yyyy):");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check-Out date (dd/MM/yyyy):");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println(reservation);

            System.out.print("Check-In date (dd/MM/yyyy):");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-Out date (dd/MM/yyyy):");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.print(reservation);
        }catch(ParseException e){
            System.out.println("Invalid date format");
        }catch(DomainException e){
            System.out.println("Error in reservation: " + e.getMessage());
        }
        
        
        sc.close();
    }
}
