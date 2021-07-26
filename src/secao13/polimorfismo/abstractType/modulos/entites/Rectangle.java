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
public class Rectangle extends Shape{
    private Double width;
    private Double height;

    public Rectangle() {
    }

    public Rectangle(Color color ,Double width, Double height) {
        this.width = width;
        this.height = height;
    }    
    
        @Override
    public double getArea() {
        return width * height;
    }
    
    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }    
    
}
