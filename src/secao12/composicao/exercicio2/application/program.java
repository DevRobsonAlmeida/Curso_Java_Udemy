/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao12.composicao.exercicio2.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import secao12.composicao.exercicio2.entites.Comment;
import secao12.composicao.exercicio2.entites.Post;

/**
 *
 * @author robson-pc
 */
public class program {
    public static void main(String[] args) throws ParseException {
        
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
        p1.comentario(c1);
        p1.comentario(c2);
        
        System.out.println(p1);
        
    }
}
