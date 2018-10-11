/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05.classes;

/**
 *
 * @author Minh
 */
public class Circle extends Shape {
    private double Radius = 1.0;
    private final double PI = 3.14;

    public Circle() {
    }
        
    public Circle(double radius) {
        this.Radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.Radius = radius;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double Radius) {
        this.Radius = Radius;
    }
    
    public double getArea() {
        return (PI * Radius * Radius);
    }
    
    public double getPerimeter() {
        return (2 * PI * Radius);
    }
    
    @Override
    public String toString() {
        return (getRadius() + ", " + getColor() + ", " + isFilled());
    }
}
