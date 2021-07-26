/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao13.polimorfismo.execicioResolvido.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import secao13.polimorfismo.execicioResolvido.entites.Employee;
import secao13.polimorfismo.execicioResolvido.entites.OutsourcedEmployee;

/**
 *
 * @author 99030499
 */
public class Program {
    /**.
     *  Um empresa possui funcionários próprios e terceirizados.
     *  Para cda funcionário, deseja-se registrar nome, horas trabalhadas e valor por hora.
     *  Funcionários terceirizdo possuem ainda uma despesa adicional.
     * 
     *  O pagamento dos funcionários corresponde ao valor da hora trabalhadas, sendo que os funcionários
     *  terceirizados ainda recebem um bônus correspondente a 110% de despesa adicional.
     * 
     *  Fazer um programa para ler os dados de N funcionários (N fornecido pelo usuário) e armazená-los em uma lista.
     *  Depois de ler todos os dados, mostrar nome e pagamento de cada funcionário na mesma ordem em que foram digitados.
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> emp = new ArrayList<Employee>();
        
        System.out.print("Enter the number of employees:");
        int nf = sc.nextInt();
        
        Employee e;
        
        for (int i = 1; i <= nf; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("OutSourced (y/n)?");
            Boolean outSourced = (sc.next().equals("y"))? true : false;
            System.out.print("Name: ");
            String name =  sc.next();
            System.out.print("Hours: ");
            int hour = sc.nextInt();
            System.out.print("Value Per Hour:");
            Double vph = sc.nextDouble();
            
            if (outSourced) {
                System.out.println("Additional charge: ");
                Double addCharge = sc.nextDouble();
                e = new OutsourcedEmployee(name, hour, vph, addCharge);
            }else{
                e = new Employee(name, hour, vph);
            }
            emp.add(e);
            
        }
        
        System.out.println("PAYMENT:"); 
        for (Employee employee : emp) {
            System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
        }
        
    }
      
}
