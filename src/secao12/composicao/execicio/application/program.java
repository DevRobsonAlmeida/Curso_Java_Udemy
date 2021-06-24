/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao12.composicao.execicio.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import secao12.composicao.execicio.entites.Department;
import secao12.composicao.execicio.entites.HourContract;
import secao12.composicao.execicio.entites.Worker;
import secao12.composicao.execicio.entites.enums.WorkerLevel;

/**
 *
 * @author robson-pc
 */
public class program {
    public static void main(String[] args) throws ParseException{
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.print("Enter departmant's name: ");
        String departmentName = sc.nextLine();
        
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String wokerName = sc.nextLine();
        
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        
        System.out.print("Base salary: ");
        Double workerBaseSalary = sc.nextDouble();
        
        Worker worker = new Worker(wokerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary, new Department(departmentName));
        
        
        System.out.println("How many contract to this worker ?"); 
        int qtd = sc.nextInt();
        
        for (int i = 1; i <= qtd; i++) {
            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            System.out.print("Duration: ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addCOntract(contract);
        }
        
        System.out.println("");
        System.out.println("Enter month and year calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println(worker.toString());
        System.out.println("Income for 08/2028: " + worker.income(year, month));
        
       
    }
}
