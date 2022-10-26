package entities;

import entities.enums.Color;

/**
 *
 * @author Felipe Pereira
 * 
 */
public class Circle extends Shape {
    
    private double radius;
    
    public Circle(){
        
    }

    public Circle(double radius, Color color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public Double area(){
        return Math.PI * radius * radius;
    }
}
