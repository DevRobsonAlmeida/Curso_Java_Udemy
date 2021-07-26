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
public class Circle extends Shape {

    private Double radius;

    public Circle() {
    }

    public Circle(Color color, Double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

}
