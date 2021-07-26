/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao14.SolucaoExcecoes.muitoRuim.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import secao14.SolucaoExcecoes.muitoRuim.model.entites.Reservation;


/**
 *
 * @author 99030499
 */
public class Program {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number:");
        int number = sc.nextInt();
        System.out.print("Check-In date (dd/MM/yyyy):");
        Date checkIn = sdf.parse(sc.next());
        System.out.print("Check-Out date (dd/MM/yyyy):");
        Date checkOut = sdf.parse(sc.next());

        if (checkIn.after(checkOut)) {
            System.out.println("Error in reservation: check-Out date must be after check-in date");
        } else {
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println(reservation);

            System.out.print("Check-In date (dd/MM/yyyy):");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-Out date (dd/MM/yyyy):");
            checkOut = sdf.parse(sc.next());

            Date now = new Date();

            if (checkIn.before(now) || checkOut.before(now)) {
                System.out.println("Error in reservation: Reservation dates for updates must be future dates");

            } else if (checkIn.after(checkOut)) {
                System.out.println("Error in reservation: check-Out date must be after check-in date");
            } else {
                reservation.updateDates(checkIn, checkOut);
                System.out.print(reservation);
            }
        }
        sc.close();
    }
}
