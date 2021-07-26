/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao13.polimorfismo.ExecicioFixicacao.produto.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import secao13.polimorfismo.ExecicioFixicacao.produto.entites.ImportedProduct;
import secao13.polimorfismo.ExecicioFixicacao.produto.entites.Product;
import secao13.polimorfismo.ExecicioFixicacao.produto.entites.UsedProduct;

/**
 *
 * @author 99030499
 */
public class Program {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //
        Product p;
        //
        List<Product> prod = new ArrayList<>();

        System.out.print("Enter the number of products:");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.print("Common, used or imported (c/u/i)?");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if (type == 'i') {
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                p = new ImportedProduct(name, price, customsFee);
            } else if (type == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date data = sdf.parse(sc.next());
                p = new UsedProduct(name, price, data);
            } else {
                p = new Product(name, price);
            }
            prod.add(p);

        }
        for (Product product : prod) {
            System.out.println(product.priceTag());
        }
    }
}
