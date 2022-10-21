package entities;

import entities.enums.Color;

/**
 *
 * @author Felipe Pereira
 * 
 */
public class Circle extends Shape {
    
    private final double PI = 3.14159;
    
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
        return PI * radius * radius;
    }
}
