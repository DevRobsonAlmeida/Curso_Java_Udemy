/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao13.polimorfismo.abstractType.modulos.entites;

import secao13.polimorfismo.abstractType.modulos.entites.emuns.Color;

/**
 *
 * @author 99030499
 */
public abstract class Shape {

    private Color color;

    public Shape() {
    }

    public Shape(Color color) {
        this.color = color;
    }
    
    public double getArea() {
        return 0;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
